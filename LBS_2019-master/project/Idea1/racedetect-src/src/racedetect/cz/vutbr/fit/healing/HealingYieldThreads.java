package cz.vutbr.fit.healing;

import cz.vutbr.fit.racedetector.RDThread;
import cz.vutbr.fit.racedetector.RDVariable;
import cz.vutbr.fit.racedetector.RaceDetector;

/**
 * <p>
 * Method based on the utilization of other processors (cores) in the system. It
 * starts threads and call <i>yield</i> to enable them to start.
 * 
 * @see HealingDummyThread
 * 
 * @author zdenek
 * 
 */
class HealingYieldThreads extends Healing {

	/* debug mode - to put details in output files set to true */
	private static final boolean DEBUG = false;
	
	/* priority of the healed thread */
	private int storedPriority;

	/**
	 * initialization of the method - empty by default
	 * 
	 */
	public static void initHealing() {
		/*
		 * prepare and execute all aditional threads
		 */
		for (int i = 0; i < Runtime.getRuntime().availableProcessors() -1; i++) {
			HealingDummyThread dummy = new HealingDummyThread();
			dummy.start();
			if (DEBUG)
				RaceDetector.printDebug(" constructing dummy thread " + dummy);
		}
	}

	/**
	 * finalization of the method - empty by default
	 * 
	 */
	public static void finalHealing() {
		/*
		 * stop all aditional threads
		 */
		HealingDummyThread.endAll();
		if (DEBUG)
			RaceDetector.printDebug(" destructing dummy threads ");

	}

	/**
	 * Called before enter the critical section.
	 * 
	 * @param rdv
	 *            critical variable
	 */
	protected void enterCriticSection(RDVariable rdv, RDThread rdt) {
		/*
		 * start aditional threads and increase the thread priority and call
		 * yield
		 */
		HealingDummyThread.goAll();
		storedPriority = Thread.currentThread().getPriority();
		/* yield */
		Thread.yield();
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
	}

	/**
	 * Called after exit the critical section.
	 * 
	 * @param rdv
	 *            critical variable
	 */
	protected void leaveCriticSection(RDVariable rdv, RDThread rdt) {
		/*
		 * decrease the thread priority again and suspend aditional threads
		 */
		Thread.currentThread().setPriority(storedPriority);
		HealingDummyThread.stopAll();

	}

	/**
	 * Called before normal access to the variable.
	 * 
	 * @param rdv
	 *            critical variable
	 */
	protected void beforeNormalAccess(RDVariable rdv, RDThread rdt) {
		/*
		 * nothing
		 */
	}

	/**
	 * Called after normal access to the variable.
	 * 
	 * @param rdv
	 *            critical variable
	 */
	protected void afterNormalAccess(RDVariable rdv, RDThread rdt) {
		/*
		 * nothing
		 */
	}

}
