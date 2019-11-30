package cz.vutbr.fit.racedetector;

import com.ibm.contest.utils.ProgramLocationParser;
import com.ibm.contest.utils.Miscellaneous;
import javolution.util.*;

import cz.vutbr.fit.atomicity.*;

/**
 * This class implements the core of the atomicity race detecting algorithm and
 * contains variable related information.
 * 
 * <p>
 * Atomicity race detecting algorithm checks if two or more threads are not
 * accessing the parts of code that should be executed atomically
 * simultaneously.
 * 
 * @author zdenek
 * 
 */
/*
 * SYNCHRONIZATION - inner state is given by: isInside, byThread, atomSec
 * 
 * synchronization is done by locking of the object this
 */
public class ARVariable extends RDVariable {

	/* debug mode - to put details in output files set to true */
	private static final boolean DEBUG = false;

	/*
	 * flag that the variable is inside the critical section the identification
	 * of the thread which turns isInside on
	 */
	private Thread simpleThread;
	/*
	 * Flag that the variable is accessed without atomicity. It is used to
	 * detect data races (not atomicity violations).
	 */
	private String simpleProgLoc;
	private RaceDetector.Operation simpleOper;

	/*
	 * suspected atomicities - race has been detected but we don't know if it is
	 * on exit path yet. If it would be on exit path - it was false alarm.
	 */
	private FastList<ARInfo> atomSec;

	/**
	 * constructor
	 */
	public ARVariable(Object ins, String vName) {
		super(ins, vName);
		simpleThread = null;
		simpleProgLoc = null;
		atomSec = null;
	}

	/**
	 * Things that should be done before the access to the variable: Check if
	 * someone else is not in the critical section of this variable (if is -
	 * than conflict is detected). If this is the start of some atomic section
	 * set the flag and store other useful information.
	 * 
	 * 
	 * @param art
	 *            Thread related and cached information.
	 * @param programLocation
	 *            Current program location.
	 * @param operation
	 *            Type of the operation read/write.
	 * @param beginAtom
	 *            Contains atomicity if there begins some at the current program
	 *            location
	 * @return true if there is suspected race
	 */
	public synchronized boolean beforeAccess(ARThread art,
			String programLocation, RaceDetector.Operation operation,
			Atomicity beginAtom) {
		boolean ret = false;

		/*
		 * simple detection - data race
		 */
		if (simpleThread == null) {
			simpleThread = Thread.currentThread();
			simpleProgLoc = programLocation;
			simpleOper = operation;
		} else {
			if ((operation == RaceDetector.Operation.WRITE)
					|| (simpleOper == RaceDetector.Operation.WRITE)) {
				/* race detected */				
				if (!this.raceDetected) {
					this.prepareHealing();
					this.raceDetected = true;
					produceWarningForSimpleAccess(simpleThread, simpleProgLoc,
							simpleOper, programLocation, operation);
				}
				ret = true;
			}
		}

		/*
		 * detection of atomicity violation
		 */
		if (atomSec != null)
			if (!atomSec.isEmpty()) {
				boolean added = false;
				// someone is in an atomic section over this variable 
				// for each atomic section add a suspect access
				for (ARInfo ari : atomSec) {
					if (ari.addProblemAccess(programLocation, operation))
						added = true; // 					
				}
				
			
				if (RaceDetector.ATOMRACE_IMMHEAL && added){
					// wait till it will be clear that there is no problem
					while (!atomSec.isEmpty()){
						try{
							if (DEBUG)
								System.out.println( Thread.currentThread() + " waiting");
							this.wait();
						} catch (InterruptedException e){}
					}
					if (DEBUG)
						System.out.println( Thread.currentThread() + " waiting end");

					
				}

			}

		if (beginAtom != null) {
			// new atomic section is entered
			// add a new atomic section info to the list
			if (atomSec == null)
				atomSec = new FastList<ARInfo>();
			atomSec.addLast(new ARInfo(beginAtom));
			// thread has to know in what atomic sections it is
			art.curInside.add(this);
			if (DEBUG)
				System.out.println( Thread.currentThread() + " atomsec start   " + programLocation);

		}

		return ret;
	}

	/**
	 * Things that should be done before the access to the variable: If this
	 * thread is inside the critical section of this variable and the given
	 * program location is the end of the atomic section - stop checking.
	 * 
	 * @param art
	 *            Thread related and cached information.
	 * @param programLocation
	 *            Current program location.
	 * @return true if it was true race
	 */
	public synchronized boolean afterAccess(ARThread art, String programLocation) {

		RaceDetector.Operation endOp;
		ARInfo.ProblemAccess problemAcc;
		ARInfo ariToRemove = null;
		boolean ret = false;

		/*
		 * simple detection - data race detection
		 */
		if (Thread.currentThread().equals(simpleThread)) {
			simpleThread = null;
			simpleProgLoc = null;
			simpleOper = null;
		}

		/*
		 * detection of atomicity violation
		 * 
		 */
		if (atomSec != null)
			if (!atomSec.isEmpty()) {
				for (FastList.Node<ARInfo> n = atomSec.head(), end = atomSec
						.tail(); (n = n.getNext()) != end;) {
					ARInfo ari = n.getValue();
					// check if it is atomicity end 
					if ((endOp = ari.atomicity.isEnd(programLocation)) != null) {
						// atomic section end 
						if ((problemAcc = ari.isTrueRace(endOp)) != null) {
							// atomicity violation detected
							if (!this.raceDetected) {
								this.prepareHealing();
								this.raceDetected = true;
							}
							processIdentifiedAtomViolation(ari, problemAcc);
							ret = true;
						}
						ariToRemove = ari;
						if (DEBUG)
							System.out.println( Thread.currentThread() + " atomsec end :" + programLocation);

					}
				}
				// remove ended atomic section from the list
				if (ariToRemove != null){
					atomSec.remove(ariToRemove);
					// thread finish execution of atomic section for this variable 
					art.curInside.remove(this);
				}
				
				// enable one waiting thread
				if (RaceDetector.ATOMRACE_IMMHEAL)
					this.notify();

			}

		return ret;
	}

	/**
	 * What to do when race was detected.
	 * 
	 * @param race
	 */
	private void processIdentifiedAtomViolation(ARInfo race,
			ARInfo.ProblemAccess problemAcc) {

		if (!this.raceDetected) {
			this.prepareHealing();
			this.raceDetected = true;
		}

		// print warning if not yet done
		if (AtomRaceDetect.violatedAtomicityCol.getAtomicity(race.atomicity
				.getKeyProgLocation()) == null) {
			RaceDetector.printWarning(RaceDetector.getVarIdentifier(instance.get(),
					varName), race.printAtomViolatReport(problemAcc));
		}
		// add this violation to the set of violated atomic sections
		AtomRaceDetect.violatedAtomicityCol.addAtomicity(race.atomicity
				.getKeyProgLocation(), race.atomicity);
		return;

	}

	private void produceWarningForSimpleAccess(Thread simByThread,
			String simProgLoc, RaceDetector.Operation simOper,
			String curProgLoc, RaceDetector.Operation curOper) {
		String str;
		/* with human readable program locations */
		str = String
				.format(
						"  The variable was accessed simultaneously by:%n   - Thread: %1$s at '%2$s' (%3$s)%n   - Thread: %4$s at '%5$s' (%6$s)%n The variable should be declared as volatile or a proper synchronization should be added.%n",
						Miscellaneous.getThreadString(simByThread),
						new ProgramLocationParser(simProgLoc)
								.getSourceLocation(), simOper.toString(),
						Miscellaneous.getThreadString(Thread.currentThread()),
						new ProgramLocationParser(curProgLoc)
								.getSourceLocation(), curOper.toString());


		RaceDetector.printWarning(RaceDetector.getVarIdentifier(instance.get(),
				varName), str);

	}
}
