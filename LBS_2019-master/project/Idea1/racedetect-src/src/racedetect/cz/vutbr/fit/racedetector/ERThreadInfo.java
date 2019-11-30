package cz.vutbr.fit.racedetector;

import java.util.*;
import javolution.util.*;

/**
 * This class is used for keeping information about threads accessing concrete
 * variable. The data are used for understandable reporting of bugs.
 * 
 * @author Zdenek Letko
 * 
 */
/*
 * SYNCHRONIZATION - inner state is given by: progLocation, accessMode,
 * raceParticipant, atomLastAccess, threadCandidateLocks
 * 
 * synchronization is done by right locking
 */
class ERThreadInfo {

	/*
	 * --- DEBUG OPTIONS ----------------------------------------
	 */
	/* debug mode - to put details in output files set to true */
	private static final boolean DEBUG = false;

	/*
	 * ----------------------------------------------------------
	 */

	/* set of locks used with this thread and this variable */
	/* guardedBy threadCandidateLocks */
	private FastSet<Index> threadCandidateLocks;

	/* last access to the variable */
	/* guardedBy this */
	private String lastProgramLocation;

	/*
	 * access mode to the variable, since once accessed in write mode - remains
	 * write
	 */
	/* guardedBy this */
	private RaceDetector.Operation accessMode;

	/**
	 * constructor
	 * 
	 * @param programLocation
	 * @param mode
	 *            Access mode of the variable according to
	 *            RaceDetector.READ/WRITE_OPER
	 */
	public ERThreadInfo(String programLocation, RaceDetector.Operation mode) {
		lastProgramLocation = programLocation;
		accessMode = mode;
		if (RaceDetector.LOCK_DETERMINE){
			threadCandidateLocks = new FastSet<Index>();
		}
	}

	/**
	 * Adds set of locks that are used in the combination of thread/variable.
	 * 
	 * @param locks
	 */
	public void addThreadCandidateLocks(Set<Index> locks) {
		threadCandidateLocks.addAll(locks);
		if (DEBUG)
			RaceDetector.printDebug(this.toString() + " candidate locks added "
					+ locks + " new: " + threadCandidateLocks);
	}

	/**
	 * Retains maintained candidates locks for thread/variable combination.
	 * 
	 * 
	 * @param locks
	 */
	public void retainThreadCandidateLocks(Set<Index> locks) {
		threadCandidateLocks.retainAll(locks);
		if (DEBUG)
			RaceDetector.printDebug(this.toString()
					+ " candidate locks retain " + locks + " new: "
					+ threadCandidateLocks);
	}

	/**
	 * Updates programLocation and access mode. Program location is set to the
	 * last access. Mode switch to write if mode is write.
	 * 
	 * @param programLocation
	 * @param mode
	 */
	public synchronized void updateThreadInfo(String programLocation,
			RaceDetector.Operation mode) {

		/* update program location */
		lastProgramLocation = programLocation;
		if ((accessMode == RaceDetector.Operation.READ) && (mode == RaceDetector.Operation.WRITE)) {
			/* switch access from READ_OPER to WRITE_OPER */
			accessMode = mode;
		}
	}

	/**
	 * Returns string of program location where the last access to the variable
	 * took place and the access mode.
	 * 
	 */
	public synchronized Access getAtomAccess() {
		return new Access(lastProgramLocation, accessMode);
	}

	/**
	 * Returns a shapshot candidate lock set of the thread with this variable.
	 * 
	 */
	public Set<Index> getThreadCandidateLocks() {
		return threadCandidateLocks.unmodifiable();
	}

}
