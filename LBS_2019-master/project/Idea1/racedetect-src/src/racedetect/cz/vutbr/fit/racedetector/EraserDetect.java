package cz.vutbr.fit.racedetector;

import javolution.util.*;

import com.ibm.contest.utils.*;

/**
 * The implementation of the Eraser algorithm.
 * 
 * <h2> Eraser - how it works </h2>
 * 
 * <p>
 * Eraser is a lock set based race condition detection algorithm. It maintains
 * for each shared variable a set of locks used with it. The set is build at the
 * first access (at the second access if owner transfer is enabled). Then the
 * algorithm do intersection of this set and the set of locks currently owned by
 * the thread at the time of an access to the variable. If the lockset becomes
 * empty the race warning is produced.
 * <p>
 * To suppress false alarms a finite automata representing the phase in which
 * the variable is currently present is maintained. The race warning is produced
 * only if the variable is in the RACE state of the automata. For more
 * information refer the article about Eraser.
 * <p>
 * The core of this algorithm is implemented in the ERVariable class
 * 
 * @see ERVariable
 * 
 * @author zdenek
 * 
 */
public class EraserDetect implements Detector {

	/*
	 * --- DEBUG OPTIONS ----------------------------------------
	 */
	/* debug mode - to put details in output files set to true */
	private static final boolean DEBUG = false;

	/* structure to maintain thread related information */
	private static RDThreadLocal threads = new RDThreadLocal();

	/* structure to maintain variable related information */
	private static RDVariableCollection variables = new RDVariableCollection();

	/*
	 * structure to maintain lock related information used for human readable
	 * warnings
	 */
	protected static FastMap<Index, String> lockNames = new FastMap<Index, String>();

	/* structure to maintain thread names */
	protected static FastMap<Index, String> threadNames = new FastMap<Index, String>();

	/* structure to maintain join synchronization data */
	// key = thread identification, Set = set of threads synchronized by join
	protected static FastMap<Index, FastSet<Index>> joinSync = new FastMap<Index, FastSet<Index>>();

	/**
	 * Returns a new variable object.
	 */
	public RDVariable getNewVariable(Object inst, String str) {
		return (RDVariable) new ERVariable(inst, str);
	}

	/**
	 * Returns a new thread object.
	 */
	public RDThread getNewThread() {
		return (RDThread) new ERThread();
	}

	/**
	 * Operations performed after access to the variable.
	 * 
	 */
	public void afterAccessEvent(String programLocation) {

		ERVariable varRecord;
		ERThread threadRecord;

		/* check if we know this thread */
		threadRecord = (ERThread) threads.get();

		if (threadRecord.getCachedProperVarName() == null)
			/* local array cell */
			return;

		/* check if we know this variable */
		varRecord = (ERVariable) threadRecord.getCachedVarRecord();

		/* most of variables will not be in Race - leave */
		if (!varRecord.raceDetected) {
			/* nothing to do */
			return;
		}

		/***********************************************************************
		 * HEALING END
		 */
		/* perform healing operation */
		if (RaceDetector.HEALING) {
			synchronized (threadRecord) {
				threadRecord.healing.endHealing(programLocation, varRecord,
						threadRecord);
			}
		}

	}

	/**
	 * Operations performed before access to the variable.
	 * 
	 * 
	 */
	public void beforeAccessEvent(String programLocation, String varName,
			Object instance, RaceDetector.Operation operation) {

		ERVariable varRecord;
		ERThread threadRecord;

		/* check if we know this thread otherwise add it to the list */
		threadRecord = (ERThread) threads.get();

		/* build proper variable name */
		String properVarName = RaceDetector.getProperVarName(instance, varName);
		if (properVarName == null) {
			/* local array cell - skip */
			threadRecord.setCachedProperVarName(null);
			return;
		}

		/* check if we know this variable otherwise add it to the list */
		varRecord = (ERVariable) variables.getVariable(instance, properVarName);

		/* do not process variables that should be ommited */
		if (varRecord.varOmited)
			return;

		/*
		 * do not proceed if the variable is under healing by this thread
		 */
		if (RaceDetector.HEALING)
			if ((threadRecord.healing != null)
					&& (threadRecord.healing.isHealedVariable(varRecord))) {
				/* in the middle of healing process - do nothing */

				return;
			}

		/***********************************************************************
		 * RACE DETECTING - updateStatus provides Eraser algorithm
		 */
		/* only if the variable is not yet in the race state */
		if (!varRecord.raceDetected) {
			if (varRecord.updateState(threadRecord, programLocation, operation)) {
				/* first occurence of a race was found */

				RaceDetector.printWarning(RaceDetector.getVarIdentifier(
						instance, properVarName), Thread.currentThread(),
						programLocation, varRecord.printVarReport());

			}

		}

		/***********************************************************************
		 * HEALING START
		 */
		/* if healing is enabled and race is detected - start healing if needed */
		if (RaceDetector.HEALING && varRecord.raceDetected) {
			synchronized (threadRecord) {
				threadRecord.healing.startHealing(programLocation, varRecord,
						threadRecord, RaceDetector.atomicity
								.getAtomicity(programLocation));
			}
		}

		/***********************************************************************
		 * For speedup cache some usefull information for AfterAccessEvent
		 */
		if (RaceDetector.HEALING) {
			/* for speedup - cache the varRecord for the afterAccessEvent */
			/*
			 * when healing disabled do not cache the info - afterAccessEvent
			 * will think that it is local array and will not proceed
			 */
			threadRecord.setCachedInfo(varRecord, properVarName);
		}

		if (DEBUG) {
			/* print debug info only for specified variable */
			RaceDetector.printDebug(this + " beforeAccess : " + properVarName
					+ " by " + Thread.currentThread());
		}

	}

	/**
	 * Add a lock to the set of held locks.
	 * 
	 */
	public void monitorEnterEvent(String programLocation, int lock) {

		ERThread rdt = (ERThread) threads.get();
		if (DEBUG)
			RaceDetector.printDebug(this + "monitorEnter : " + lock + " by "
					+ Thread.currentThread());

		/* update lock set of current thread */
		rdt.addHeldLock(lock);

		/* update locks information used for printing human readable warnings */
		if (RaceDetector.LOCK_DETERMINE) {
			Index i = Index.valueOf(lock);
			/* put if absent - not necessary thread safe */
			if (!lockNames.containsKey(i))
				lockNames.put(i, programLocation);
		}

	}

	/**
	 * Remove a lock from the set of held locks.
	 */
	public void monitorExitEvent(String programLocation, int lock) {

		ERThread rdt = (ERThread) threads.get();
		if (DEBUG)
			RaceDetector.printDebug(this + "monitorExit : " + lock + " by "
					+ Thread.currentThread());

		/* maintain lock sets of current thread */
		rdt.removeHeldLock(lock);

	}

	/**
	 * Construct a data structure representing the thread.
	 * 
	 */
	public void threadBeginEvent(String programLocation) {

		/* allocate space for a new thread information */
		threads.get();

		threadNames.put(Index.valueOf(ObjectEnumerator.getNumber(Thread
				.currentThread())), Miscellaneous.getThreadString(Thread
				.currentThread()));
	}

	/**
	 * Clean a data structure representing the thread.
	 * 
	 */
	public void threadEndEvent() {

		ERThread rdt = (ERThread) threads.get();

		/* discard information concerning this thread */
		rdt.cleanERThread();

	}

	/**
	 * Join synchronization implementation.
	 * 
	 * If successful join has been done - current thread is synchronized with
	 * target thread. Race between these two threads is no more possible.
	 */
	public void threadJoinEvent(String programLocation, Thread target) {

		Index thisThread = Index.valueOf(ObjectEnumerator.getNumber(Thread
				.currentThread()));
		Index targetThread = Index.valueOf(ObjectEnumerator.getNumber(target));

		/* get object containing join sync info for current thread */
		FastSet<Index> threadJoinedSet = joinSync.get(thisThread);
		if (threadJoinedSet == null) {
			joinSync.put(thisThread, threadJoinedSet = new FastSet<Index>());
			/* every thread has to be synchronized with itself
			 * so it can be used containsAll operation later on
			 */
			threadJoinedSet.add(thisThread);
		}

		/* from now be synchronized with the target thread */
		threadJoinedSet.add(targetThread);
		/*
		 * and also with threads this thread was synchronized (transitive
		 * closure of join operation over set of all threads)
		 */
		FastSet<Index> transJoinedSet = joinSync.get(targetThread);
		if (transJoinedSet != null) {
			threadJoinedSet.addAll(transJoinedSet);
		}

		/*
		 * there is no need to maintain record about the thread already joined
		 */
		joinSync.remove(targetThread);

	}

}
