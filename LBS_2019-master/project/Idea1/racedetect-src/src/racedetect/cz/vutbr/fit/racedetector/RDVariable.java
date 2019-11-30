package cz.vutbr.fit.racedetector;

import java.util.concurrent.atomic.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Semaphore;
import java.lang.ref.WeakReference;

/**
 * This class is used for keeping information about program variable.
 * 
 * 
 * @author Zdenek
 * 
 */
/*
 * SYNCHRONIZATION - inner state is given by: status, raceDetected, owner
 * suggestedLocks, candidateLocks
 * 
 * synchronization is done by right locking
 */
abstract public class RDVariable {

	/* ---------------------------------------------------------- */

	/*
	 * race detection flag - true means that Race over this variable has been
	 * detected
	 */
	/* guardedBy statusLock */
	protected volatile boolean raceDetected = false;

	/*
	 * omit flag - mark variable as do not analyse it
	 */
	/* guardedBy statusLock */
	protected volatile boolean varOmited = false;

	/*
	 * noise flag - mark variable as the one to cause a race on
	 */
	/* guardedBy statusLock */
	protected volatile boolean varNoiseInject = false;

	/* Healing ------------------------------------------------------- */
	/* temporary lock for healing purpose */
	public ReentrantLock raceAvoidLock = null;

	/* temporary lock for healing purpose */
	public Semaphore raceAvoidSemaphore = null;
	
	/*
	 * thread which performs healing operation over this variable - 0 = nobody
	 * is healing
	 */
	/* guardedBy Atomic operations in HealingOT* */
	public AtomicInteger healedByThreads = null;

	/**
	 * Which variable is in the atomicity section.
	 */
	public final String varName;

	/**
	 * Reference to a target program object. This weak reference is used for
	 * object identification - e.g. for human readable warnings.
	 * 
	 */
	public final WeakReference<Object> instance;

	/**
	 * Constructor
	 * 
	 */
	RDVariable(Object inst, String name) {

		instance = new WeakReference<Object>(inst);
		varName = name;
	}

	/**
	 * Turn the healing on.
	 */
	public synchronized void prepareHealing() {
		// prepare healing
		if (RaceDetector.HEALING_METHOD == RaceDetector.HealingMethod.NEWMUTEX){
			if (raceAvoidLock == null)
				raceAvoidLock = new ReentrantLock();
		}
		if (RaceDetector.HEALING_METHOD == RaceDetector.HealingMethod.SEMAPHORE){
			if (raceAvoidSemaphore == null)
				raceAvoidSemaphore = new Semaphore(1);
		}
		
		if ((RaceDetector.HEALING_METHOD == RaceDetector.HealingMethod.OTYIELD) || 
			(RaceDetector.HEALING_METHOD == RaceDetector.HealingMethod.OTWAIT)){
			if (healedByThreads == null)
				healedByThreads = new AtomicInteger(0);
		}
	}

}
