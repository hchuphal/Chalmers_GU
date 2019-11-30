package cz.vutbr.fit.healing;

import java.util.HashSet;

import cz.vutbr.fit.atomicity.*;
import cz.vutbr.fit.racedetector.RDThread;
import cz.vutbr.fit.racedetector.RDVariable;
import cz.vutbr.fit.racedetector.RaceDetector;

/**
 * <p>
 * Abstract class defines the interface for healing methods implemented in
 * <i>Healing*</i> classes. It also provides a way to set used healing method
 * by <i>getHealingMethod</i> and can distuingish between normal access to the
 * variable and enter/leave the critical section (also called atomic section)
 * according to the information received from the <i>Atomicity</i> object.
 * 
 * @see Atomicity
 * 
 * @author zdenek
 * 
 */
abstract public class Healing {

	private static final boolean DEBUG = false;

	/*
	 * set of variable that are in Race state and this thread is in their atomic
	 * sections
	 */
	private HashSet<RDVariable> healedVariables;

	/*
	 * program location at which this thread enters normalAccess mode for
	 * healing
	 */
	private String normalAccessLocation;
	
	
	public Healing(){
		normalAccessLocation = null;
		healedVariables = new HashSet<RDVariable>();
	}
	


	/**
	 * Returns true if the given variable is healed by this thread.
	 * 
	 * @return Is healed
	 */
	public boolean isHealedVariable(RDVariable rdv) {
		if (healedVariables == null)
			return false;
		else
			return healedVariables.contains(rdv);
	}

	
	/**
	 * Returns a new object representing concrete healing method which will be
	 * used for healing (quarding atomicity sections).
	 * 
	 * @return Healing object
	 */
	public static Healing getHealingMethod() {

		Healing ret = null;

		/* choose according to healing method */
		switch (RaceDetector.HEALING_METHOD) {
		case THREADS:
			ret = new HealingThreads();
			break;
		case YIELD:
			ret = new HealingYield();
			break;
		case PRIORITY:
			ret = new HealingPriority();
			break;
		case YIELDPRIORITY:
			ret = new HealingYieldPriority();
			break;
		case YIELDTHREADS:
			ret = new HealingYieldThreads();
			break;
		case NEWMUTEX:
			ret = new HealingNewMutex();
			break;
		case OTYIELD:
			ret = new HealingOTYield();
			break;
		case OTWAIT:
			ret = new HealingOTWait();
			break;
		}

		return ret;
	}

	/**
	 * initialization of the method - empty by default
	 * 
	 */
	public static void initHealing() {

		/* init healing method - if needed */
		if (RaceDetector.HEALING_METHOD == RaceDetector.HealingMethod.THREADS)
			HealingThreads.initHealing();
		if (RaceDetector.HEALING_METHOD == RaceDetector.HealingMethod.YIELDTHREADS)
			HealingYieldThreads.initHealing();

	}

	/**
	 * finalization of the method - empty by default
	 * 
	 */
	public static void finalHealing() {

		/* finalize healing method - if needed */
		if (RaceDetector.HEALING_METHOD == RaceDetector.HealingMethod.THREADS)
			HealingThreads.finalHealing();
		if (RaceDetector.HEALING_METHOD == RaceDetector.HealingMethod.YIELDTHREADS)
			HealingYieldThreads.finalHealing();

	}

	/**
	 * Start healing operation if needed according to chosen healing method. Use
	 * Atomicity information to distinguish between normal access and enter of
	 * the critical section.
	 * 
	 * @param programLocation
	 *            Program location
	 * @param rdv
	 *            Variable information
	 * @param rdt
	 *            Thread information
	 * @param atom
	 *            Atomicity information - not null if start of atomic section
	 */
	public void startHealing(String programLocation, RDVariable rdv,
			RDThread rdt, Atomicity atom) {

		if (isHealedVariable(rdv)) {
			/* nothing to do - we are within the critical sec. */
			if (DEBUG)
				RaceDetector.printDebug(" healing ("
						+ System.identityHashCode(rdv) + ") nothing (start) "
						+ Thread.currentThread());
			return;
		} else {
			/* not in the critical section */
			if (atom != null){
				/*
				 * entering critical section - start healing
				 */
				if (DEBUG)
					RaceDetector.printDebug("start critic"
							+ Thread.currentThread());
				healedVariables.add(rdv);
				enterCriticSection(rdv, rdt);
				/* for speedup purpose the end of atomic section is buffered */
				rdt.setAtomicSection(rdv, atom);
			} else {
				/*
				 * another operation outside critical section
				 */
				if (DEBUG)
					RaceDetector.printDebug("start normal"
							+ Thread.currentThread());
				beforeNormalAccess(rdv, rdt);
				normalAccessLocation = programLocation;
			}
		}
	}

	/**
	 * End healing if needed by chosen healing method. Use Atomicity information
	 * to distuingish between normal access and enter of the critical section.
	 * 
	 * 
	 * @param programLocation
	 *            Program location
	 * @param rdv
	 *            Variable information
	 * @param rdt
	 *            Thread information
	 */
	public void endHealing(String programLocation, RDVariable rdv,
			RDThread rdt) {

		if (rdt.isAtomicSectionEnd(rdv, programLocation)) {
			/*
			 * end of critical section - end healing
			 */
			if (DEBUG)
				RaceDetector.printDebug("end critic" + Thread.currentThread());
			leaveCriticSection(rdv, rdt);
			healedVariables.remove(rdv);
			/* for speedup purpose the end of atomic section is buffered */
			rdt.clearAtomicSectionEnd(rdv);

		} else {
			/* not the end of the critical section */
			if (isHealedVariable(rdv)) {
				/*
				 * inside the critical section - nothing to do
				 */
				if (DEBUG)
					RaceDetector.printDebug(" healing ("
							+ System.identityHashCode(rdv)
							+ ") nothing (stop) " + Thread.currentThread());

				return;
			} else {
				/*
				 * another operation outside critical section
				 */
				if (DEBUG)
					RaceDetector.printDebug("end normal"
							+ Thread.currentThread());
				if (normalAccessLocation == programLocation){
					normalAccessLocation = null;
					afterNormalAccess(rdv, rdt);
				}

			}
		}

	}

	/**
	 * Called before enter the critical section which should be atomic.
	 * 
	 * @param rdv
	 *            Variable information
	 */
	abstract protected void enterCriticSection(RDVariable rdv, RDThread rdt);

	/**
	 * Called after exit the critical section which should be atomic.
	 * 
	 * @param rdv
	 *            Variable information
	 */
	abstract protected void leaveCriticSection(RDVariable rdv, RDThread rdt);

	/**
	 * Called before normal access to the variable.
	 * 
	 * @param rdv
	 *            Variable information
	 */
	abstract protected void beforeNormalAccess(RDVariable rdv, RDThread rdt);

	/**
	 * Called after normal access to the variable.
	 * 
	 * @param rdv
	 *            Variable information
	 */
	abstract protected void afterNormalAccess(RDVariable rdv, RDThread rdt);

}