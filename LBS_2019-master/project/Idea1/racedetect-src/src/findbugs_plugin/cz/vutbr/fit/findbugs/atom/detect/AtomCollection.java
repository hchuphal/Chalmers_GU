package cz.vutbr.fit.findbugs.atom.detect;

import java.util.*;

import cz.vutbr.fit.atomicity.Atomicity;
import cz.vutbr.fit.atomicity.AtomicityCollection;
import cz.vutbr.fit.racedetector.Access;

/**
 * A collection of atoms (atoms or access tuples are basic units of atomicity
 * found by static analysis). Atom represent two consequence accesses to the
 * field. Static analysis adds atoms to this collection and then it can be
 * transformed into atomicity collection which is used by race detector.
 * 
 * <p>This class is not thread safe.
 * 
 * @author zdenek
 * 
 */
/*
 * SYNCHRONIZATION - inner state is given by: atomList
 * 
 * NOT THREAD SAFE
 */
public class AtomCollection {

	private static final boolean DEBUG = false;

	// a list of accesses
	private LinkedList<AccessTuple> atomList;

	// tuple - the last access to the variable and the current access
	// immutable -> Thread safe
	private class AccessTuple {
		final Access firstAcc, secondAcc;

		AccessTuple(Access first, Access last) {
			firstAcc = first;
			secondAcc = last;
		}

	}

	/**
	 * Constructor.
	 */
	public AtomCollection() {
		atomList = new LinkedList<AccessTuple>();
	}

	/**
	 * Add a new tuple into the list.
	 * 
	 * @param previous
	 *            The preceding access to the variable.
	 * @param actual
	 *            The current (or later) access to the variable.
	 */
	public void add(Access previous, Access actual) {
		atomList.add(new AccessTuple(previous, actual));
	}

	/**
	 * The main functionality function. Implements conversion from atom
	 * collection to atomicity collection. It joins all atoms which start at the
	 * same program location to one atomicity.
	 * 
	 * @return Atomicity collection
	 */
	public AtomicityCollection getAtomicityCol() {
		AtomicityCollection ac = new AtomicityCollection();

		HashMap<Access, HashSet<Access>> tmpCol = new HashMap<Access, HashSet<Access>>();
		Atomicity atomic;

		if (DEBUG)
			for (AccessTuple at : atomList)
				System.out.println(at.firstAcc + " <-> " + at.secondAcc);

		/* join atoms with the same first access */
		for (AccessTuple at : atomList) {
			if (tmpCol.containsKey(at.firstAcc)) {
				// already present - just try to add a new ending location
				tmpCol.get(at.firstAcc).add(at.secondAcc);
			} else {
				// a new begin
				tmpCol.put(at.firstAcc, new HashSet<Access>());
				tmpCol.get(at.firstAcc).add(at.secondAcc);
			}

		}

		/* create atomicities */
		for (Access keyTmpCol : tmpCol.keySet()) {
			if ((atomic = AtomicityCollection.getNewAtomicity(keyTmpCol, tmpCol
					.get(keyTmpCol))) != null) {
				ac.addAtomicity(atomic.getKeyProgLocation(), atomic);
			}
		}

		if (DEBUG)
			System.out.println(ac.getDebugText());

		return ac;
	}
}
