package cz.vutbr.fit.racedetector;

import javolution.util.*;

import com.ibm.contest.utils.*;

/**
 * This class contains information gathered concerning the variable. The main
 * Eraser algorithm is implemented in the <i>updateStatus</i> method.
 * 
 * @author zdenek
 * 
 */
public class ERVariable extends RDVariable {

	/* debug mode - to put details in output files set to true */
	private static final boolean DEBUG = false;

	/* states of internal state machine */
	enum State {
		VIRGIN, EXCLUSIVE, EXCLUSIVE2, SHARED, SHARED_MODIFIED, RACE
	}

	/* state of internal state machine */
	/* guardedBy this */
	private State status;

	/* owner of this record */
	/* guardedBy this */
	private int owner;

	/* set of candidate locks used with this variable */
	/* guardedBy this */
	private FastSet<Index> candidateLocks;

	/* additional information concerning threads accessing this variable */
	private final ERThreadInfoCollection threadsInfo;

	ERVariable(Object ins, String str) {
		super(ins, str);
		status = State.VIRGIN;
		candidateLocks = new FastSet<Index>();
		threadsInfo = new ERThreadInfoCollection();
	}

	/*
	 * ----------------------------------------------------------------------------------
	 * RACE Detection Mechanism
	 * ----------------------------------------------------------------------------------
	 * 
	 */

	/**
	 * This method implements Race detection algorithm.
	 * 
	 * Initially the variable is used by one thread - as long as only one thread
	 * is accessing the variable Race is not possible. Whenever second thread
	 * access the variable we have to be carefull. If second (and any other)
	 * thread is just only reading the variable Race is still not possible.
	 * 
	 * Whenever also second (and any other) thread is changing the value of the
	 * variable Race is possible and algorithm must check if performed operation
	 * is causing the Race. This is done by intersection between sets of so
	 * called Candidates locks of variable V (set of locks what could be used
	 * for protecting variable V) and locks held by thread T (set of locks what
	 * thread is using to protect sensitive parts of the program execution). If
	 * the intersection is empty Race is reported.
	 * 
	 * 
	 * 
	 * @param programLocation -
	 *            program location of current operation
	 * @param operation -
	 *            read or write operation flag
	 * @return - true if race is identified
	 */
	public synchronized boolean updateState(ERThread thread,
			String programLocation, RaceDetector.Operation operation) {

		boolean ret = false;
		FastSet<Index> threadSyncInfo;
		int thisThreadID = ObjectEnumerator.getNumber(Thread.currentThread());

		switch (status) {
		case VIRGIN:
			/*
			 * writing variable's initialization value RACE is not possible
			 */
			if (operation == RaceDetector.Operation.WRITE) {
				/* init structure - delete all previous entries */
				threadsInfo.clearThreads();

				/* put first owner of the variable into ThreadInfo */
				if (RaceDetector.LOCK_DETERMINE) {
					threadsInfo.addThread(thisThreadID, programLocation,
							operation, status, thread.getHeldLocks());
				} else {
					threadsInfo.addThread(thisThreadID, programLocation,
							operation);
				}
				/* store owner */
				owner = thisThreadID;

				/* change the state */
				if (RaceDetector.OWNER_TRANSFER)
					status = State.EXCLUSIVE;
				else {
					status = State.EXCLUSIVE2;

				}
			}
			break;
		case EXCLUSIVE:
			/*
			 * as long as variable is used in the same thread - there is no RACE
			 * possible. When another thread access variable - ownership of the
			 * variable is stolen. state -> status = EXCLUSIVE2
			 */
			if (owner != thisThreadID) {
				/* another thread accessing variable */
				/*
				 * put second owner of the thread into ThreadInfo -> clear old
				 * ThreadInfo structure
				 */
				threadsInfo.clearThreads();

				/* put second owner of the variable into ThreadInfo */
				if (RaceDetector.LOCK_DETERMINE) {
					threadsInfo.addThread(thisThreadID, programLocation,
							operation, status, thread.getHeldLocks());
				} else {
					threadsInfo.addThread(thisThreadID, programLocation,
							operation);
				}
				/* store owner */
				owner = thisThreadID;

				status = State.EXCLUSIVE2;
			}
			break;
		case EXCLUSIVE2:
			/*
			 * as long as variable is used in the same thread - there is no RACE
			 * possible when another thread access variable - RaceDetector
			 * initialization performed: - read -> status = SHARED - write ->
			 * status = SHARED_MODIFIED
			 */
			if (owner != thisThreadID) {
				/* another thread accessing variable */
				if (RaceDetector.LOCK_DETERMINE) {
					threadsInfo.addThread(thisThreadID, programLocation,
							operation, status, thread.getHeldLocks());
				} else {
					threadsInfo.addThread(thisThreadID, programLocation,
							operation);
				}

				/*
				 * do an intersection with heldLocks to get candidate locks set -
				 * give the same result as getHeldLocks
				 */
				candidateLocks.addAll(thread.getHeldLocks());

				if (operation == RaceDetector.Operation.READ) {

					/* do not report warining even if candidate set is empty */
					/* read only access */
					status = State.SHARED;
				} else {

					status = State.SHARED_MODIFIED;
					if (candidateLocks.isEmpty()) {

						/*
						 * RACE has been detected
						 */
						status = State.RACE;
						this.prepareHealing();
						this.raceDetected = true;
						ret = true;
					}
				}
			}
			/* else no other thread is accessing the variable */
			break;
		case SHARED:
			/*
			 * as long as variable is read by other threads it's safe and no
			 * RACE is possible when variable is written by thread ->
			 * status=SHARED_MODIFIED
			 */
			if (RaceDetector.LOCK_DETERMINE) {
				threadsInfo.addThread(thisThreadID, programLocation, operation,
						status, thread.getHeldLocks());
			} else {
				threadsInfo.addThread(thisThreadID, programLocation, operation);
			}

			/* if it is the last thread accessing the variable */
			if (((threadSyncInfo = EraserDetect.joinSync.get(Index.valueOf(thisThreadID))) != null)
					&& threadSyncInfo.containsAll(threadsInfo.getVarThreadSet())) {
				/*
				 * join synchronized - this is the last thread accessing the
				 * variable
				 */
				status = State.EXCLUSIVE2;
				owner = thisThreadID;
				/*
				 * clear candidate locks and make T(v) contains only current
				 * thread
				 */
				candidateLocks.clear();
				threadsInfo.clearThreadsAcceptCurrent();

			} else {
				candidateLocks.retainAll(thread.getHeldLocks());
				if (operation == RaceDetector.Operation.READ) {

					/* do not report warning even if candidate set is empty */
					/* read only access */
				} else {

					status = State.SHARED_MODIFIED;
					if (candidateLocks.isEmpty()) {

						/*
						 * RACE has been detected
						 */
						status = State.RACE;
						this.prepareHealing();
						this.raceDetected = true;
						ret = true;
					}
				}
			}

			break;
		case SHARED_MODIFIED:
			/*
			 * whenever variable is accessed without lock - RACE is found
			 */
			if (RaceDetector.LOCK_DETERMINE) {
				threadsInfo.addThread(thisThreadID, programLocation, operation,
						status, thread.getHeldLocks());
			} else {
				threadsInfo.addThread(thisThreadID, programLocation, operation);
			}

			/* if it is the last thread accessing the variable */
			if (((threadSyncInfo = EraserDetect.joinSync.get(Index.valueOf(thisThreadID))) != null)
					&& threadSyncInfo.containsAll(threadsInfo.getVarThreadSet())) {
				/*
				 * join synchronized - this is the last thread accessing the
				 * variable
				 */
				status = State.EXCLUSIVE2;
				owner = thisThreadID;
				/*
				 * clear candidate locks and make T(v) contains only current
				 * thread
				 */
				candidateLocks.clear();
				threadsInfo.clearThreadsAcceptCurrent();

			} else {
				if (operation == RaceDetector.Operation.READ) {

					candidateLocks.retainAll(thread.getHeldLocks());
					if (candidateLocks.isEmpty()) {

						/*
						 * RACE has been detected
						 */
						status = State.RACE;
						this.prepareHealing();
						this.raceDetected = true;
						ret = true;
					}

				} else {

					/* writeHeldLocks should be used NOT IMPLEMENTED YET */
					candidateLocks.retainAll(thread.getHeldLocks());
					if (candidateLocks.isEmpty()) {

						/*
						 * RACE has been detected
						 */

						status = State.RACE;
						this.prepareHealing();
						this.raceDetected = true;
						ret = true;
					}
				}
			}

			break;
		case RACE:

			/*
			 * continue with collecting all threads which are accessing the
			 * variable
			 */
			if (RaceDetector.LOCK_DETERMINE) {
				threadsInfo.addThread(thisThreadID, programLocation, operation,
						status, thread.getHeldLocks());
			} else {
				threadsInfo.addThread(thisThreadID, programLocation, operation);
			}

			/* if it is the last thread accessing the variable */
			if (((threadSyncInfo = EraserDetect.joinSync.get(Index.valueOf(thisThreadID))) != null)
					&& threadSyncInfo.containsAll(threadsInfo.getVarThreadSet())) {
				/*
				 * join synchronized - this is the last thread accessing the
				 * variable
				 */
				status = State.EXCLUSIVE2;
				owner = thisThreadID;
				/*
				 * clear candidate locks and make T(v) contains only current
				 * thread
				 */
				candidateLocks.clear();
				threadsInfo.clearThreadsAcceptCurrent();

			}

			break;
		default:
			System.out.println(" RaceDetectorVariable - invalid inner state. ");
			break;
		}

		if (DEBUG)
			RaceDetector.printDebug(this + " status: " + getStatus());

		/* update threads-info */
		threadsInfo.updateThreadInfo(thisThreadID, programLocation, operation);

		return ret;
	}

	/**
	 * Returns String describing the status of the variable.
	 * 
	 * @return status
	 */
	public synchronized String getStatus() {
		String str = "";

		switch (status) {
		case VIRGIN:
			str = "VIRGIN";
			break;
		case EXCLUSIVE:
			str = "EXCLUSIVE";
			break;
		case EXCLUSIVE2:
			str = "EXCLUSIVE2";
			break;
		case SHARED:
			str = "SHARED";
			break;
		case SHARED_MODIFIED:
			str = "SHARED_MODIFIED";
			break;
		case RACE:
			str = "RACE";
			break;
		default:
			str = "unknown";
			break;
		}

		return str;
	}

	/**
	 * Returns String of candidate lock set of this variable.
	 * 
	 * @return String with candidate locks
	 */
	public synchronized String getCandidateLocks() {
		String str;

		str = candidateLocks.toString();

		return str;
	}

	/**
	 * This function generate report for variable represented with this object.
	 * Useful information to find RACE are presented: Threads and their access
	 * mode, locks etc.. Some suggestion is also generated here.
	 * 
	 * @return String to put into output file
	 */
	public synchronized String printVarReport() {

		String str;

		/* generates basic output */
		str = threadsInfo.generateVarReport();

		/*
		 * make suggestion to improve lock policy - based on lock sets for
		 * threads
		 */
		if (RaceDetector.LOCK_DETERMINE) {
			str += String
					.format(
							"  You probably should use a lock to protect this variable. %n  You can make a new one or use some lock used by other threads.",
							(Object) null);
		} else {
			str += String
					.format(
							"  You probably should use a lock to protect this variable. ",
							(Object) null);

		}

		return str;
	}

	/**
	 * Returns string with information which can be helpful for debuging.
	 * 
	 * @return String with info
	 */
	public synchronized String debugPrint() {
		String str = "";
		str += String
				.format(
						"%n  - Status: %1$s%n  - Candidate locks: %2$s%n  - Suggested locks: %3$s%n ",
						status, candidateLocks);
		return str;
	}

}
