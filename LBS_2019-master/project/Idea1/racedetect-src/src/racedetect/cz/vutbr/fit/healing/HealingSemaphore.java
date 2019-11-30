package cz.vutbr.fit.healing;

import cz.vutbr.fit.racedetector.RDThread;
import cz.vutbr.fit.racedetector.RDVariable;
import cz.vutbr.fit.racedetector.RaceDetector;

/**
 * <p>
 * Healing method which uses a new semaphore to guard the variable. Semaphore
 * simulates a lock but without an ownership problem. Semaphore can be released
 * by a different thread than the one who obtained the semaphore. A lock is
 * obtained every time the variable is accessed. The healing is based on the
 * idea that lock is not released within the critical sections which should be
 * done atomicaly.
 * 
 * 
 * @author zdenek
 * 
 */
class HealingSemaphore extends Healing {

	private static final boolean DEBUG = false;

	/**
	 * Called before enter the critical section.
	 * 
	 * @param rdv
	 *            critical variable
	 */
	protected void enterCriticSection(RDVariable rdv, RDThread rdt) {
		/*
		 * lock the semaphore
		 */

		if (DEBUG)
			RaceDetector.printDebug(" semaphore ("
					+ System.identityHashCode(rdv) + ") try to be locked "
					+ Thread.currentThread() + " (critic)");

		try{
			rdv.raceAvoidSemaphore.acquire();
		} catch (InterruptedException e){
			if (DEBUG)
				RaceDetector.printDebug(" semaphore ("
						+ System.identityHashCode(rdv) + ") InterruptedException "
						+ Thread.currentThread() + " (critic)");			
		}

		if (DEBUG)
			RaceDetector.printDebug(" semaphore ("
					+ System.identityHashCode(rdv) + ") locked "
					+ Thread.currentThread() + " (critic)");
	}

	/**
	 * Called after exit the critical section.
	 * 
	 * @param rdv
	 *            critical variable
	 */
	protected void leaveCriticSection(RDVariable rdv, RDThread rdt) {
		/*
		 * unlock the semaphore
		 */

		
		rdv.raceAvoidSemaphore.release();

		if (DEBUG)
			RaceDetector.printDebug(" semaphore ("
					+ System.identityHashCode(rdv) + ") unlocked "
					+ Thread.currentThread() + " (critic)");
	}

	/**
	 * Called before normal access to the variable.
	 * 
	 * @param rdv
	 *            critical variable
	 */
	protected void beforeNormalAccess(RDVariable rdv, RDThread rdt) {
		/*
		 * lock the semaphore
		 */

		if (DEBUG)
			RaceDetector.printDebug(" semaphore ("
					+ System.identityHashCode(rdv) + ") try to be locked "
					+ Thread.currentThread());

		try{
			rdv.raceAvoidSemaphore.acquire();
		} catch (InterruptedException e){
			if (DEBUG)
				RaceDetector.printDebug(" semaphore ("
						+ System.identityHashCode(rdv) + ") InterruptedException "
						+ Thread.currentThread() + " (critic)");			
		}

		if (DEBUG)
			RaceDetector.printDebug(" semaphore ("
					+ System.identityHashCode(rdv) + ") locked "
					+ Thread.currentThread());
	}

	/**
	 * Called after normal access to the variable.
	 * 
	 * @param rdv
	 *            critical variable
	 */
	protected void afterNormalAccess(RDVariable rdv, RDThread rdt) {
		/*
		 * unlock the semaphore
		 */

		rdv.raceAvoidSemaphore.release();

		if (DEBUG)
			RaceDetector.printDebug(" semaphore ("
					+ System.identityHashCode(rdv) + ") unlocked "
					+ Thread.currentThread());
	}

}
