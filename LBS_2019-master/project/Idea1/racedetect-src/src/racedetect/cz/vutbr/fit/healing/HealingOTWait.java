package cz.vutbr.fit.healing;

import cz.vutbr.fit.racedetector.RDThread;
import cz.vutbr.fit.racedetector.RDVariable;

/**
 * Healing method that uses <i>wait</i> called on the threads trying to access
 * the variable while another trhead is inside a critical section that should be
 * executed atomicaly.
 * 
 * @author zdenek
 * 
 */
class HealingOTWait extends Healing {

	/**
	 * Called before enter the critical section.
	 * 
	 * @param rdv
	 *            critical variable
	 */
	protected void enterCriticSection(RDVariable rdv, RDThread rdt) {
		/*
		 * if variable is under healing, wait for a moment before continue
		 */
		int counterCopy;
		
		counterCopy = rdv.healedByThreads.incrementAndGet();

		/* if someone else is also in the critic section - wait */
		if (counterCopy > 1) {
			try {
				synchronized(this){
					wait(0, 10);
				}
			} catch (InterruptedException e) {
			}
		}
	}

	/**
	 * Called after exit the critical section.
	 * 
	 * @param rdv
	 *            critical variable
	 */
	protected void leaveCriticSection(RDVariable rdv, RDThread rdt) {
		/* end healing */

		rdv.healedByThreads.decrementAndGet();

	}

	/**
	 * Called before normal access to the variable.
	 * 
	 * @param rdv
	 *            critical variable
	 */
	protected void beforeNormalAccess(RDVariable rdv, RDThread rdt) {
		/*
		 * if anyone is in the healing section - wait
		 */
		if (!rdv.healedByThreads.equals(0)) {
			try {
				synchronized(this){
					wait(0, 10);
				}
			} catch (InterruptedException e) {
			}
		}
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
