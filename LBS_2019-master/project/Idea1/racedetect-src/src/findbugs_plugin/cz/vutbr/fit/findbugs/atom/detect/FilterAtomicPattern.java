package cz.vutbr.fit.findbugs.atom.detect;

import cz.vutbr.fit.atomicity.*;
import cz.vutbr.fit.racedetector.Access;
import cz.vutbr.fit.racedetector.RaceDetector.Operation;

import java.util.*;

import com.ibm.contest.utils.*;

public class FilterAtomicPattern {

	protected static boolean isAtomicPattern(Atomicity atom) {
		Access[] arr = atom.getAtomEnds();

		// x++ pattern
		// first access = READ
		// all non EXIT accesses on the same line
		// last access = WRITE
		int startLine, endLine;
		int lastAccess = 0;
		int lastAccessSerial = 0;
		boolean sameLine = true;

		// first access = READ
		if (atom.getBeginOp() != Operation.READ)
			return false;

		// all non EXIT accesses on the same line
		startLine = Integer.parseInt(new ProgramLocationParser(atom
				.getKeyProgLocation()).getSourceLineNumbers());

		ProgramLocationParser plp;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].mode != Operation.EXIT) {
				try {
					// get end line number
					plp = new ProgramLocationParser(atom.getKeyProgLocation());
					endLine = Integer.parseInt(plp.getSourceLineNumbers());
					if (endLine != startLine)
						sameLine = false;
					else {
						// determine the last access
						if (plp.getSerialNumber() > lastAccessSerial) {
							lastAccessSerial = plp.getSerialNumber();
							lastAccess = i;
						}
					}
				} catch (Exception e) {
					sameLine = false;
				}
			}
		}
		if (!sameLine)
			return false;

		// last access = WRITE
		if (arr[lastAccess].mode == Operation.WRITE)
			return true;
		else
			return false;
	}

	protected static AtomicityCollection joinSameLineAtomicity(
			AtomicityCollection atc) {
		Atomicity atom, atom2;
		AtomicityCollection ac = new AtomicityCollection();

		Object[] begins = atc.getKeySet().toArray();
		// get line numbers
		int[] lines = new int[begins.length];
		for (int i = 0; i < begins.length; i++)
			lines[i] = Integer.parseInt(new ProgramLocationParser(
					(String) begins[i]).getSourceLineNumbers());
		// check all the same lines
		for (int i = 0; i < lines.length; i++) {
			if (begins[i] != null) {
				atom = atc.getAtomicity((String) begins[i]);
				for (int j = i + 1; j < lines.length; j++) {
					// same start line detection
					if (lines[i] == lines[j]) {
						if (begins[j] != null) {
							// same end line detection
							atom2 = atc.getAtomicity((String) begins[j]);
							boolean ok = true;
							// first atomicity
							Access[] ends = atom.getAtomEnds();
							for (int a = 0; a < ends.length; a++)
								if (ends[a].mode != Operation.EXIT)
									if (lines[i] != Integer
											.parseInt(new ProgramLocationParser(
													ends[a].progLoc)
													.getSourceLineNumbers()))
										ok = false;
							if (ok) {
								// second atomicity
								ends = atom2.getAtomEnds();
								for (int a = 0; a < ends.length; a++)
									if (ends[a].mode != Operation.EXIT)
										if (lines[i] != Integer
												.parseInt(new ProgramLocationParser(
														ends[a].progLoc)
														.getSourceLineNumbers()))
											ok = false;

							}
							if (ok) {
								// join the atomicities
								atom = joinAtomicity(atom, atom2);
								// do not process j-th item again
								begins[j] = null;
							}
						}
					}
				}
				ac.addAtomicity(atom.getKeyProgLocation(), atom);
			}
		}
		return ac;
	}

	/**
	 * it is assumed that both atomicities are on the same line...
	 */
	private static Atomicity joinAtomicity(Atomicity atom1, Atomicity atom2) {
		HashSet<Access> newEnds = new HashSet<Access>();
		Access newBegin;
		// determine which is the first one
		int beg1 = new ProgramLocationParser(atom1.getKeyProgLocation())
				.getSerialNumber();
		int beg2 = new ProgramLocationParser(atom2.getKeyProgLocation())
				.getSerialNumber();
		if (beg1 == beg2)
			return null; // something is wrong
		// decide which atomicity occurs first
		if (beg1 > beg2) {
			Atomicity tmp = atom1;
			atom1 = atom2;
			atom2 = tmp;
		}
		// determine new begin
		newBegin = new Access(atom1.getKeyProgLocation(), atom1.getBeginOp());
		// determine new ends
		for (Access ac : atom1.getAtomEnds()) {
			if (ac.mode == Operation.EXIT)
				newEnds.add(ac);
		}
		for (Access ac : atom2.getAtomEnds()) {
			newEnds.add(ac);
		}

		return AtomicityCollection.getNewAtomicity(newBegin, newEnds);
	}
}
