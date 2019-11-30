package cz.vutbr.fit.healing;

import cz.vutbr.fit.racedetector.RDThread;
import cz.vutbr.fit.racedetector.RDVariable;

/**
 * <p>
 * Method that influences scheduler by the increasing the priority of the thread
 * entering critical section to maximum, call <i>yield</i> to receive full
 * window from scheduler and take it back when the thread leaves the section.
 * 
 * @author zdenek
 * 
 */
class HealingYieldPriority extends Healing {

	private int storedPriority;

	/**
	 * Called before enter the critical section.
	 * 
	 * @param rdv
	 *            critical variable
	 */
	protected void enterCriticSection(RDVariable rdv, RDThread rdt) {
		/*
		 * increase the thread priority
		 */
		storedPriority = Thread.currentThread().getPriority();
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		/*
		 * call yield
		 */
		Thread.yield();
	}

	/**
	 * Called after exit the critical section.
	 * 
	 * @param rdv
	 *            critical variable
	 */
	protected void leaveCriticSection(RDVariable rdv, RDThread rdt) {
		/*
		 * decrease the thread priority again
		 */
		Thread.currentThread().setPriority(storedPriority);
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
