package cz.vutbr.fit.racedetector;

import java.util.*;

import cz.vutbr.fit.atomicity.*;
import cz.vutbr.fit.healing.Healing;

/**
 * This class is used for keeping information concerning a thread.
 * 
 * 
 * @author Zdenek Letko
 * 
 */
/*
 * SYNCHRONIZATION - inner state is given by:
 * 
 * synchronization is not needed - this class will be accessed by only one
 * thread
 */
abstract public class RDThread {

	/* healing method */
	protected Healing healing;


	/* optimalization - cached atomic sections */
	private IdentityHashMap<RDVariable, Atomicity> atomicSection;

	/* optimalization - cached from before to after access event */
	private RDVariable beforeVarRecord;
	private String beforeProperVarName;

	/**
	 * constructor
	 * 
	 */
	RDThread() {
		atomicSection = new IdentityHashMap<RDVariable, Atomicity>();
		if (RaceDetector.HEALING) {
			healing = Healing.getHealingMethod();
		}
	}


	/**
	 * Sets the end of atomic section - this program location is buffered for
	 * better performance.
	 * 
	 * @param rdv Variable
	 * @param atom
	 *            Atomicity
	 */
	public void setAtomicSection(RDVariable rdv, Atomicity atom) {
		if (atomicSection == null)
			atomicSection = new IdentityHashMap<RDVariable, Atomicity>();
		atomicSection.put(rdv, atom);
	}

	/**
	 * Returns true if the given program location is the end of buffered atomic
	 * section for this variable.
	 * 
	 * @param rdv Variable
	 * @param progLocation Program
	 *            location - string must be interned !
	 * @return Is end of atomic section
	 */
	public boolean isAtomicSectionEnd(RDVariable rdv, String progLocation) {
		Atomicity atom;
		if (atomicSection == null)
			return false;
		else {
			if ((atom = atomicSection.get(rdv)) == null)
				return false;
			else
				return (atom.isEnd(progLocation) != null);
		}
	}

	/**
	 * Remove the information concerning atomic section end for the variable.
	 * 
	 * @param rdv Variable
	 */
	public void clearAtomicSectionEnd(RDVariable rdv) {
		atomicSection.remove(rdv);
	}


	/**
	 * Clean the structures.
	 */
	public void cleanRDThread() {
		healing = null;
		atomicSection = null;
	}

	/**
	 * Store information concerning the currently accessed variable to cache.
	 * 
	 * @param varRecord
	 * @param properVarName
	 */
	public void setCachedInfo(RDVariable varRecord, String properVarName) {
		beforeVarRecord = varRecord;
		beforeProperVarName = properVarName;

		return;
	}

	/**
	 * Store the proper variable name of the currently accessed variable to
	 * cache.
	 * 
	 * @param properVarName
	 */
	public void setCachedProperVarName(String properVarName) {
		beforeProperVarName = properVarName;

		return;
	}

	/**
	 * Get the variable's record from the cache.
	 * 
	 * @return variable record
	 */
	public RDVariable getCachedVarRecord() {
		return beforeVarRecord;
	}

	/**
	 * Get the variable's proper name from the cache.
	 * 
	 * @return variable name
	 */
	public String getCachedProperVarName() {
		return beforeProperVarName;
	}

}
