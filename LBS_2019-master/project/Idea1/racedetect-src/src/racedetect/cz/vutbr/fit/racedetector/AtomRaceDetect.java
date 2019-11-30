package cz.vutbr.fit.racedetector;

import java.util.*;

import cz.vutbr.fit.atomicity.*;

/**
 * Implementation of the atomicity violation detection algorithm.
 * 
 * <h2> AtomRace - How it works </h2>
 * <p>
 * The algorithm is checking violation of predefined atomicities. Atomicity is a
 * piece of the code which access some shared variable and should be executed
 * atomically. Executed atomically means that no other thread will touch the
 * shared vairable in the way which will leads to data inconsistency in between
 * the start of the atomicity and the end of the atomicity.
 * <p>
 * Predefined atomicity is loaded from the file before the execution starts. The
 * typical <b>Atomicity</b> has one begin and several ends. Both begin and ends
 * are defined by access to the variable (program location is used for
 * identification of access). Each access is also labeled by its type.
 * Currently, there are three types of access (READ, WRITE and EXIT). In other
 * words, Atomicity gives to each begin access a set of possible immediately
 * following accesses to the same variable. EXIT type of access gives the
 * algorithm information that the method is ending and it should stop checking
 * atomicity for this variable. Atomicity is obtained from CFG of methods.
 * <p>
 * Algorithm starts to check for atomicity violation immediately before the
 * begin access of the atomicity section and ends immediately after the end
 * access. If two atomicities follow each other then during the access which
 * represents end of the first and start of the second atomicity the algorithm
 * checks for both atomicities. If during the checking some other thread
 * (different from the one which enters the atomicity) is accessing the variable
 * a <b>suspected race</b> is recorded. At the end of the atomicity it is
 * checked whether consistency of the variable was not broken. The consistency
 * is broken in the following scenarios: <table>
 * <tr>
 * <th>Thread doing atomicity</th>
 * <th>Other thread</th>
 * <th>Problem description</th>
 * </tr>
 * <tr>
 * <td>read - write</td>
 * <td>write</td>
 * <td>The second write relies on a value from the preceding read that is
 * overriden by other thread.</td>
 * </tr>
 * <tr>
 * <td>read - read</td>
 * <td>write</td>
 * <td>The write by other thread makes the two reads have different views of
 * the variable.</td>
 * </tr>
 * <tr>
 * <td>write - write</td>
 * <td>read</td>
 * <td>Intermediate result that is assumed to be invisible to other threads is
 * read by a remote access.</td>
 * </tr>
 * <tr>
 * <td>write - read</td>
 * <td>write</td>
 * <td>The read does not receive the local result it expects.</td>
 * </tr>
 * </table> <b> All these scenarios are unserializable.</b> (More can be read
 * for example in the article of SVD tool.) If some of this scenarios are
 * detected the race warining is produced.
 * <p>
 * The core of this algorithm is implemented in the ARVariable class.
 * 
 * @see ARVariable
 * 
 * @author zdenek
 * 
 */
public class AtomRaceDetect implements Detector{

	/*
	 * --- DEBUG OPTIONS ----------------------------------------
	 */
	/* debug mode - to put details in output files set to true */
	private static final boolean DEBUG = false;

	/* structure to maintain thread related information */
	private static RDThreadLocal threads = new RDThreadLocal();

	/* structure to maintain variable related information */
	private static RDVariableCollection variables = new RDVariableCollection();

	/* violated atomicities */
	protected static AtomicityCollection violatedAtomicityCol = new AtomicityCollection();


	/**
	 * Returns a new variable object.
	 */
	public RDVariable getNewVariable(Object inst, String str) {
		return (RDVariable) new ARVariable(inst, str);
	}

	/**
	 * Returns a new thread object.
	 */
	public RDThread getNewThread() {
		return (RDThread) new ARThread();
	}

	/**
	 * Operations performed after access to the variable.
	 * 
	 */
	public void afterAccessEvent(String programLocation) {

		ARVariable varRecord;
		ARThread threadRecord;

		/* check if we know this thread */
		threadRecord = (ARThread) threads.get();

		if (threadRecord.getCachedProperVarName() == null)
			/* local array cell */
			return;

		/* check if we know this variable */
		varRecord = (ARVariable) threadRecord.getCachedVarRecord();

		/***********************************************************************
		 * RACE CAUSING - NOISE INJECTING
		 */
		if (RaceDetector.NOISE){
			if (RaceDetector.NOISE_RANDOM)
				NoiseInjection.randInjectNoise();
			if (RaceDetector.NOISE_VARIABLES && varRecord.varNoiseInject)
				NoiseInjection.randInjectNoise();
			if (RaceDetector.NOISE_PROGLOC)
				NoiseInjection.progLocInjectNoise(programLocation);
		}
		
		/***********************************************************************
		 * RACE DETECTING
		 */
		/* leave atomic section if needed */
		if (varRecord.afterAccess(threadRecord, programLocation)) {
			/* TRUE ATOMICITY VIOLATION HAS BEEN DETECTED */
		}

		/***********************************************************************
		 * HEALING END
		 */
		/* perform healing operation */
		if (RaceDetector.HEALING && varRecord.raceDetected) {
				threadRecord.healing.endHealing(programLocation, varRecord,
						threadRecord);
		}

	}

	/**
	 * Operations performed before access to the variable.
	 * 
	 */
	public void beforeAccessEvent(String programLocation, String varName,
			Object instance, RaceDetector.Operation operation) {

		ARVariable varRecord;
		ARThread threadRecord;
		Atomicity beginAtomRecord;

		/* check if we know this thread otherwise add it to the list */
		threadRecord = (ARThread) threads.get();

		
		/* build proper variable name */
		String properVarName = RaceDetector.getProperVarName(instance, varName);
		if (properVarName == null) {
			/* local array cell - skip */
			threadRecord.setCachedProperVarName(null);
			return;
		}

		/* check if we know this variable otherwise add it to the list */
		varRecord = (ARVariable) variables.getVariable(instance, properVarName);
		
		/* do not process variables that should be ommited */
		if (varRecord.varOmited)
			return;

		/*
		 * do not proceed if the variable is under healing by this thread
		 */
		if (RaceDetector.HEALING)
			if ((threadRecord.healing != null) && (threadRecord.healing.isHealedVariable(varRecord))) {
			/* in the middle of healing process - do nothing */

			return;
		}

		
		/***********************************************************************
		 * ATOMICITY
		 */
		/* get atomicity starting at this program location */
		beginAtomRecord = RaceDetector.atomicity
				.getAtomicity(programLocation);

		

		/***********************************************************************
		 * HEALING START must be before detecting
		 */
		/* if healing is enabled and race is detected - start healing if needed */
		if (RaceDetector.HEALING && varRecord.raceDetected
				&& (beginAtomRecord != null)) {
			synchronized (threadRecord) {
				threadRecord.healing.startHealing(programLocation, varRecord,
						threadRecord, beginAtomRecord);
			}
		}

		/***********************************************************************
		 * RACE DETECTING - AtomRace algorithm
		 */
		if (varRecord.beforeAccess(threadRecord, programLocation, operation,
				beginAtomRecord)) {
			/* ATOMICITY VIOLATION WAS DETECTED - could be false alarm */
		}

		/***********************************************************************
		 * RACE CAUSING - NOISE INJECTING
		 */
		if (RaceDetector.NOISE){
			if (RaceDetector.NOISE_RANDOM)
				NoiseInjection.randInjectNoise();
			if (RaceDetector.NOISE_VARIABLES && varRecord.varNoiseInject)
				NoiseInjection.randInjectNoise();
			if (RaceDetector.NOISE_PROGLOC)
				NoiseInjection.progLocInjectNoise(programLocation);
		}


		/***********************************************************************
		 * for speedup - cache the varRecord for the afterAccessEvent
		 */
		threadRecord.setCachedInfo(varRecord, properVarName);

		if (DEBUG) {
			/* print debug info only for specified variable */
			RaceDetector.printDebug(this + " beforeAccess : " + properVarName
					+ " by " + Thread.currentThread());
		}

	}

	/**
	 * Called when method is being entered.
	 * 
	 * @param programLocation
	 */
	public void beforeMethodEvent(String programLocation) {
		// not yet implemented
		ARThread threadRecord;

		/* check if we know this thread */
		threadRecord = (ARThread) threads.get();

		if (threadRecord.curInside.isEmpty())
			/* no variable in the atomicity seciton */
			return;

		for (ARVariable varRecord : new HashSet<ARVariable>(
				threadRecord.curInside)) {

			/*******************************************************************
			 * RACE DETECTING
			 */
			/* leave atomic section if needed */
			varRecord.afterAccess(threadRecord, programLocation);

			/*******************************************************************
			 * HEALING END
			 */
			/* perform healing operation */
			if (RaceDetector.HEALING && varRecord.raceDetected) {
				synchronized (threadRecord) {
					threadRecord.healing.endHealing(programLocation, varRecord,
							threadRecord);
				}
			}
		}
	}
	
	/**
	 * Called when method is being exited.
	 * 
	 * @param programLocation
	 */
	public void afterMethodEvent(String programLocation) {

		ARThread threadRecord;

		/* check if we know this thread */
		threadRecord = (ARThread) threads.get();

		if (threadRecord.curInside.isEmpty())
			/* no variable in the atomicity seciton */
			return;

		for (ARVariable varRecord : new HashSet<ARVariable>(
				threadRecord.curInside)) {

			/*******************************************************************
			 * RACE DETECTING
			 */
			/* leave atomic section if needed */
			varRecord.afterAccess(threadRecord, programLocation);

			/*******************************************************************
			 * HEALING END
			 */
			/* perform healing operation */
			if (RaceDetector.HEALING && varRecord.raceDetected) {
				synchronized (threadRecord) {
					threadRecord.healing.endHealing(programLocation, varRecord,
							threadRecord);
				}
			}
		}
	}

	/**
	 * not implemented yet
	 */
	public void monitorEnterEvent(String programLocation, int lock) {

		// TODO - if lock is being used with some variable - do an atomic
		// section start here
	}

	/**
	 * not implemented yet
	 */
	public void monitorExitEvent(String programLocation, int lock) {
		// TODO - if lock is being used with some variable - do an atomic
		// section end here

	}

	/**
	 * Construct a data structure to be used with the thread.
	 */
	public void threadBeginEvent(String programLocation) {

		/* allocate space for a new thread information */
		threads.get();
	}

	/**
	 * Remove a data structure being used with the thread.
	 */
	public void threadEndEvent() {

		// nothing to do
	}

	/**
	 * not implemented yet
	 */
	public void threadJoinEvent(String programLocation, Thread target) {

		// nothing to do
	}

}
