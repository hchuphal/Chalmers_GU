package cz.vutbr.fit.racedetector;

import java.util.Set;
import javolution.util.*;

/**
 * Class takes care of the information gathered about the thread. It is also
 * used for buffering information which will be used during the next step done
 * by this thread.
 * 
 * @author zdenek
 * 
 */
public class ERThread extends RDThread {

	/*
	 * --- DEBUG OPTIONS ----------------------------------------
	 */
	/* debug mode - to put details in output files set to true */
	private static final boolean DEBUG = false;

	/*
	 * ----------------------------------------------------------
	 */

	/* locks currently held by this thread */
	private final FastSet<Index> heldLocks;

	
	/**
	 * constructor
	 * 
	 */
	ERThread() {
		heldLocks = new FastSet<Index>();
	}

	/**
	 * Information of the thread are removed, for memory saving. Only
	 * information concerning healing and Join synchronization remain.
	 * 
	 */
	public synchronized void cleanERThread() {

		heldLocks.clear();
		healing = null;
		if (RaceDetector.HEALING){
			cleanRDThread();
		}
	}

	/**
	 * Adds lock to the set of locks currently held by the thread
	 * 
	 * @param lock
	 *            A lock to be added
	 */
	public void addHeldLock(int lock) {		
		heldLocks.add(Index.valueOf(lock));

		if (DEBUG)
			RaceDetector.printDebug(this.toString() + " held locks: "
					+ printHeldLocks());
	}

	/**
	 * Removes lock from the set of locks currently held by the thread.
	 * 
	 * @param lock
	 *            A lock to be removed
	 */
	public void removeHeldLock(int lock) {
		heldLocks.remove(Index.valueOf(lock));
	}


	/**
	 * Returns locks held by the thread.
	 * 
	 * @return A set of locks
	 */
	public Set<Index> getHeldLocks() {

		return heldLocks.unmodifiable();
	}

	/**
	 * Returns a text representation of held locks.
	 * 
	 * @return Held locks
	 */
	public String printHeldLocks() {
		return heldLocks.toString();
	}


}
