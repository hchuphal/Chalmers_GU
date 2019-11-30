package cz.vutbr.fit.healing;

import cz.vutbr.fit.racedetector.RDThread;
import cz.vutbr.fit.racedetector.RDVariable;
import cz.vutbr.fit.racedetector.RaceDetector;

/**
 * <p>
 * Healing method which uses a new explicit lock to guard the variable. A lock
 * si obtained every time the variable is accessed. The healing is based on the
 * idea that lock is not released within the critical sections which should be
 * done atomicaly.
 * 
 * 
 * @author zdenek
 * 
 */
class HealingNewMutex extends Healing {

	private static final boolean DEBUG = false;

	/**
	 * Called before enter the critical section.
	 * 
	 * @param rdv
	 *            critical variable
	 */
	protected void enterCriticSection(RDVariable rdv, RDThread rdt) {
		/*
		 * lock the explicit lock
		 */

		if (DEBUG)
			RaceDetector.printDebug(" explicit lock ("
					+ System.identityHashCode(rdv) + ") try to be locked "
					+ Thread.currentThread() + " (critic)");

		rdv.raceAvoidLock.lock();

		if (DEBUG)
			RaceDetector.printDebug(" explicit lock ("
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
		 * unlock the explicit lock
		 */

		rdv.raceAvoidLock.unlock();

		if (DEBUG)
			RaceDetector.printDebug(" explicit lock ("
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
		 * lock the explicit lock
		 */

		if (DEBUG)
			RaceDetector.printDebug(" explicit lock ("
					+ System.identityHashCode(rdv) + ") try to be locked "
					+ Thread.currentThread());

		rdv.raceAvoidLock.lock();

		if (DEBUG)
			RaceDetector.printDebug(" explicit lock ("
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
		 * unlock the explicit lock
		 */

		rdv.raceAvoidLock.unlock();

		if (DEBUG)
			RaceDetector.printDebug(" explicit lock ("
					+ System.identityHashCode(rdv) + ") unlocked "
					+ Thread.currentThread());
	}

}
