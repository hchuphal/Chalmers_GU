package cz.vutbr.fit.racedetector;

import javolution.util.*;
import com.ibm.contest.utils.Miscellaneous;
import com.ibm.contest.utils.ProgramLocationParser;

import cz.vutbr.fit.atomicity.Atomicity;
import cz.vutbr.fit.racedetector.RaceDetector.Operation;

/**
 * This class represents detected atomicity violation which could lead to a data
 * race. It contain all necessary information that can be used for tracking what
 * happened.
 * 
 * @author zdenek
 * 
 */
public class ARInfo {

	/**
	 * This class represents the problematic access which was detected when
	 * someone else was in atomicity section of this variable.
	 * 
	 * @author zdenek
	 * 
	 */
	public class ProblemAccess {
		public final Thread curThread;
		public final String curLocation;
		public final Operation curOperation;

		/**
		 * Constructor - information concerning the problematic access.
		 * 
		 * @param cThread
		 *            Thread which wanted to access the variable.
		 * @param cLoc
		 *            Its location in the code.
		 * @param cOper
		 *            Operation it wanted to perform.
		 */
		public ProblemAccess(Thread cThread, String cLoc, Operation cOper) {
			curThread = cThread;
			curLocation = cLoc;
			curOperation = cOper;
		}

		/**
		 * Give a text representation of problematic access - usable also for
		 * printing warnings.
		 */
		public String toString() {

			return Miscellaneous.getThreadString(curThread)
					+ "("
					+ curOperation
					+ ")"
					+ " at "
					+ new ProgramLocationParser(curLocation)
							.getSourceLocation();
			/*
			 * return Miscellaneous.getThreadString(curThread) + "(" +
			 * curOperation + ")" + " at " + curLocation;
			 */
		}

		/**
		 * Returns true if the given object is of type ProblemAccess and program
		 * locations and threads are the same. (modes are not compared because
		 * the program location should be unique with respect to operation)
		 */
		@Override
		public boolean equals(Object ac) {
			if (ac == null || ac.getClass() != ac.getClass())
				return false;
			ProblemAccess pac = (ProblemAccess) ac;
			return ((curLocation == pac.curLocation) && (curThread == pac.curThread));
		}

		/**
		 * Returns hashCode of this Object which is actually the hash code of
		 * the program location and thread.
		 */
		@Override
		public int hashCode() {
			return curLocation.hashCode() + curThread.hashCode();
		}

	}

	/**
	 * Atomicity section which was disturbed.
	 */
	public final Atomicity atomicity;
	/**
	 * Which thread is in the atomicity section.
	 */
	private final Thread byThread;

	/**
	 * A list of interleaved accesses.
	 */
	private final FastSet<ProblemAccess> problemAcc = new FastSet<ProblemAccess>();

	/**
	 * Constructor.
	 * 
	 * @param at
	 *            Atomicity.
	 */
	public ARInfo(Atomicity at) {
		atomicity = at;
		byThread = Thread.currentThread();
	}

	/**
	 * Adds a new ProblemAccess to this race report only if the current thread
	 * is different from one which enters the atomic section.
	 * 
	 * @param location
	 * @param op
	 * @return true if the current thread is not the one which enters the atomic
	 *         section - possible atomicity violation detected.
	 */
	public boolean addProblemAccess(String location, Operation op) {
		if (!Thread.currentThread().equals(byThread)) {
			problemAcc.add(new ProblemAccess(Thread.currentThread(), location,
					op));
			return true;
		}
		return false;
	}

	/**
	 * Produce the warning that race has been detected.
	 * 
	 */
	public String printAtomViolatReport(ProblemAccess pAcc) {
		String str2 = "";
		String str;
		/* generate warning message */
		str2 = String.format("%1$s%n   %2$s", str2, pAcc.toString());
		str = String
				.format(
						"  The atomic section:%n%1$s  Executed by thread '%2$s' was violated by the following accesses:%3$s %n",
						atomicity.toString(), Miscellaneous
								.getThreadString(byThread), str2);

		return str;
	}

	/**
	 * Returns true if the given atomicity ending operation means that it was a
	 * true race. True race is is in this case caused by unserializable
	 * interleavings.
	 * 
	 * <p>
	 * Problematic interleavings are (based on AVIO paper):
	 * <ul>
	 * <li>atomicity (read-read) with disturbing (write)
	 * <li>atomicity (write-read) with disturbing (write)
	 * <li>atomicity (write-write) with disturbing (read)
	 * <li>atomicity (read-write) with disturbing (write)
	 * </ul>
	 * 
	 * @param endOp
	 * @return the race is true race
	 */
	public ProblemAccess isTrueRace(Operation endOp) {
		Operation beginOp;

		if (endOp == Operation.EXIT)
			return null;

		for (FastSet.Record r = problemAcc.head(), end = problemAcc.tail(); (r = r
				.getNext()) != end;) {
			ProblemAccess pAcc = problemAcc.valueOf(r);
			beginOp = atomicity.getBeginOp();

			// Unserializable combinations.
			if (beginOp == Operation.READ) {
				if (pAcc.curOperation == Operation.WRITE)
					return pAcc;
				else
					return null;
			} else /* beginOp == Operation.WRITE */{
				if (endOp == Operation.WRITE) {
					if (pAcc.curOperation == Operation.READ)
						return pAcc;
					else
						return null;
				} else /* endOp == Operation.READ */{
					if (pAcc.curOperation == Operation.WRITE)
						return pAcc;
					else
						return null;
				}
			}
		}

		return null;

	}

	/**
	 * Returns true if the given object is of type ARRace and atomicity and
	 * byThread are the same. (other fields are not compared)
	 */
	@Override
	public boolean equals(Object arrace) {
		if (arrace == null || arrace.getClass() != arrace.getClass())
			return false;
		ARInfo arr = (ARInfo) arrace;
		return ((atomicity == arr.atomicity) && (byThread == arr.byThread));
	}

	/**
	 * Returns hashCode of this Object which is actually the hash code of the
	 * program location.
	 */
	@Override
	public int hashCode() {
		return atomicity.hashCode() + byThread.hashCode();
	}
}
