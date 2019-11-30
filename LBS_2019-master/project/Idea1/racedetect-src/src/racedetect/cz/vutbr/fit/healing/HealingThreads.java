package cz.vutbr.fit.healing;

import cz.vutbr.fit.racedetector.RDThread;
import cz.vutbr.fit.racedetector.RDVariable;

/**
 * <p>
 * Method based on the utilization of other processors (cores) in the system.
 * 
 * @see HealingDummyThread
 * 
 * @author zdenek
 *
 */
class HealingThreads extends Healing {

	private int storedPriority;
	
	/**
	 * initialization of the method - empty by default
	 *
	 */
	public static void initHealing(){
		/*
		 * prepare and execute all aditional threads
		 */
		for (int i = 0; i < Runtime.getRuntime().availableProcessors() - 1 ; i++) {
			HealingDummyThread dummy = new HealingDummyThread();
			dummy.start();
		}
	}
	
	/**
	 * finalization of the method - empty by default
	 *
	 */
	public static void finalHealing(){
		/*
		 * stop all aditional threads
		 */
		HealingDummyThread.endAll();
	}

	
	/**
	 * Called before enter the critical section.
	 * 
	 * @param rdv critical variable
	 */
	protected void enterCriticSection(RDVariable rdv, RDThread rdt){
		/*
		 * start aditional threads and increase the thread priority
		 */
		HealingDummyThread.goAll();
		storedPriority = Thread.currentThread().getPriority();
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);		
	}
	

	/**
	 * Called after exit the critical section.
	 * 
	 * @param rdv critical variable
	 */
	protected void leaveCriticSection(RDVariable rdv, RDThread rdt){
		/*
		 * decrease the thread priority again and suspend aditional threads
		 */
		HealingDummyThread.stopAll();
		Thread.currentThread().setPriority(storedPriority);
	}
	
	
	/**
	 * Called before normal access to the variable.
	 * 
	 * @param rdv critical variable
	 */
	protected void beforeNormalAccess(RDVariable rdv, RDThread rdt){
		/*
		 * nothing
		 */
	}
	

	/**
	 * Called after normal access to the variable.
	 * 
	 * @param rdv critical variable
	 */
	protected void afterNormalAccess(RDVariable rdv, RDThread rdt){
		/*
		 * nothing
		 */
	}

}
