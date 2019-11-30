package cz.vutbr.fit.racedetector;

import java.util.*;
import javolution.util.*;

import com.ibm.contest.utils.ObjectEnumerator;
import com.ibm.contest.utils.ProgramLocationParser;

/**
 * This class provides access to the set of ThreadInfo objects - each represents
 * a thread accessing shared variable from RDVariable.
 * 
 * @author zdenek
 * 
 */
/*
 * SYNCHRONIZATION - inner state is given by: threadsInfo, initThread, initThreadInfo
 * 
 * guarded by this
 */

class ERThreadInfoCollection {

	// private static boolean DEBUG = false;

	/* set of threads used with this variable - only for warning output purpose */
	private FastMap<Index, ERThreadInfo> threadsInfo;

	/*
	 * for optimalization purpose - do not construct HashMap, if only one thread
	 * is present
	 */
	private int initThread = -1;
	private ERThreadInfo initThreadInfo = null;

	/*
	 * constructor
	 */
	ERThreadInfoCollection() {
		threadsInfo = null;
	}

	/**
	 * Returns true if the record containing given thread exists.
	 * 
	 */
	public boolean containsThread(int thread) {
		if (threadsInfo == null) {
			return (thread == initThread);
		} else {
			return threadsInfo.containsKey(Index.valueOf(thread));
		}
	}

	/**
	 * Clear the set - remove all ThreadInfo objects from the set.
	 * 
	 */
	public void clearThreads() {
		initThread = -1;
		initThreadInfo = null;
		threadsInfo = null;
	}

	/**
	 * Clean the set - remove all ThreadInfo objects from the set accept that
	 * representing current thread.
	 * 
	 */
	public void clearThreadsAcceptCurrent() {
		if (threadsInfo == null) {
			return;
		} else {
			initThread = ObjectEnumerator.getNumber(Thread.currentThread());
			initThreadInfo = threadsInfo.get(Index.valueOf(initThread));

			threadsInfo = null;
		}
	}

	/**
	 * Adds thread to the set. If the thread record is already present - the
	 * candidate locks set is updated.
	 * 
	 * Also maintains the candidate locks set.
	 * 
	 * @param thread
	 * @param programLocation
	 * @param mode
	 * @param status
	 * @param locks
	 */
	public void addThread(int thread, String programLocation,
			RaceDetector.Operation mode, ERVariable.State status, Set<Index> locks) {

		/* if not exists - add thread to the set */
		addThread(thread, programLocation, mode);

		if (RaceDetector.LOCK_DETERMINE) {
			ERThreadInfo vti;

			
			/* get pointer to ERThreadInfo */
			if (threadsInfo == null) {
				vti = initThreadInfo;
			} else {
				vti = threadsInfo.get(Index.valueOf(thread));
			}

			/* change the candidate locks set for the thread */

			switch (status) {
			case VIRGIN:
				if (!locks.isEmpty())
					vti.addThreadCandidateLocks(locks);
				break;
			case EXCLUSIVE:
				if (!locks.isEmpty())
					vti.addThreadCandidateLocks(locks);
				break;
			case EXCLUSIVE2:
				if (!locks.isEmpty())
					vti.addThreadCandidateLocks(locks);
				break;
			case SHARED:
				vti.retainThreadCandidateLocks(locks);
				break;
			case SHARED_MODIFIED:
				vti.retainThreadCandidateLocks(locks);
				break;
			case RACE:
				break;
			}
		}
	}

	/**
	 * Adds thread to the set.
	 * 
	 * @param thread
	 * @param programLocation
	 * @param mode
	 */
	public void addThread(int thread, String programLocation, RaceDetector.Operation mode) {
		if (threadsInfo == null) {
			if (initThread == -1) {
				/* first thread */
				initThread = thread;
				initThreadInfo = new ERThreadInfo(programLocation, mode);
			} else {
				if (initThread != thread) {
					/* second thread - construct Map */
					threadsInfo = new FastMap<Index, ERThreadInfo>();
					threadsInfo.put(Index.valueOf(initThread), initThreadInfo);
					threadsInfo.put(Index.valueOf(thread), new ERThreadInfo(programLocation,
							mode));
					initThread = -1;
				}
			}
		} else {
			/* putIfAbsent to Map */
			if (!threadsInfo.containsKey(Index.valueOf(thread))) {
				threadsInfo.put(Index.valueOf(thread), new ERThreadInfo(programLocation, mode));
			}
		}
	}

	/**
	 * Updates ThreadInfo record of given thread. Set the last programLocation
	 * and accessMode of this thread to the variable.
	 * 
	 * @param thread
	 * @param programLocation
	 * @param mode
	 */
	public void updateThreadInfo(int thread, String programLocation,
			RaceDetector.Operation mode) {
		ERThreadInfo vti;

		if (threadsInfo == null){
			vti = initThreadInfo;
		}
		else{
			vti = threadsInfo.get(Index.valueOf(thread));
		}
		
		if (vti != null)
			vti.updateThreadInfo(programLocation, mode);

	}

	/**
	 * Generates basic report based on informations stored in
	 * ThreadInfoCollection - a set of threads accessing the variable.
	 * 
	 */
	public String generateVarReport() {
		String str = "";
		ERThreadInfo vti;


		str += String.format("  Variable accessed by threads (mode):%n",
				(Object) null);

		/* for all threads accessing the variable */
		for (FastMap.Entry<Index, ERThreadInfo> me = threadsInfo.head(), end = threadsInfo.tail(); (me = me.getNext()) != end;){
		/* for each thread accessing this variable */
			vti = (ERThreadInfo) me.getValue();
			/* get access mode of the thread */
			Access ala = vti.getAtomAccess();

			str += String.format("   * Thread '%1$s' (%2$s) at '%3$s'%n",
					EraserDetect.threadNames.get(me.getKey()), ala.mode.toString(),
					new ProgramLocationParser(ala.progLoc)
							.getSourceLocation());

			/* print set of locks thread used with this variable */
			if (RaceDetector.LOCK_DETERMINE) {
				boolean none = true;
				String strLocks = "";
				Index lock;
				Set<Index> candidLocks = vti.getThreadCandidateLocks();

				Iterator<Index> it = candidLocks.iterator();
				while (it.hasNext()) {
					/* for each lock */
					
					lock = it.next();
					/*
					strLocks += String.format(
							"       +  Object '%1$s' first locked at '%2$s'%n",
							lock, locks.get(lock));
					*/ 
					strLocks += String.format(
							"       +  Object '%1$s' first locked at '%2$s'%n",
							lock, new ProgramLocationParser(EraserDetect.lockNames.get(lock))
									.getSourceLocation());
									
					none = false;
				}

				if (none)
					str += String.format(
							"      - Thread candidate locks: none.%n",
							(Object) null);
				else
					str += String.format(
							"      - Thread candidate locks: %n%1$s", strLocks);

			}
		}

		return str;
	}

	/**
	 * Returns the set of threads accessing the variable.
	 * 
	 */
	public Set<Index> getVarThreadSet() {
		Set<Index> set;
		if (threadsInfo == null){
			FastSet<Index> fs = new FastSet<Index>();
			fs.add(Index.valueOf(initThread));
			set = fs.unmodifiable();
		} else {
			set = threadsInfo.keySet();			
		}

		return set;
	}

}
