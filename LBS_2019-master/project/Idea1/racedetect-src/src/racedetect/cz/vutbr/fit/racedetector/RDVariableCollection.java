package cz.vutbr.fit.racedetector;

import java.util.concurrent.locks.*;
import java.util.*;
import com.ibm.contest.utils.*;

/**
 * This class provides access to set of RDVariable (information concerning
 * variable).
 * <p>
 * Currently it's implemented using IdentityHashMap.
 * 
 * 
 * @author Zdenek Letko
 * 
 */
/*
 * SYNCHRONIZATION - inner state is given by: rdvariables
 * 
 * synchronization is done by right locking, RDVarCollection
 */

public class RDVariableCollection {

	private static final boolean DEBUG = false;
	
	/* structure to maintain variable related information */
	/* GuardedBy lock */
	/* will be used as <Object, RDObjVarCollection> */
	private WeakIdentityHashMap rdvariables;

	/* read write lock to protect rdvariables */
	private ReentrantReadWriteLock lock;

	/**
	 * Set of variables that should not be analysed.
	 */
	protected static RDVarSet omitVariables;
	/**
	 * Set of variables that should not be analysed.
	 */
	protected static RDVarSet healVariables;
	/**
	 * Set of variables that should be disturbed by a noise.
	 */
	protected static RDVarSet noiseVariables;
	
	/**
	 * Constructor.
	 * 
	 */
	public RDVariableCollection() {
		rdvariables = new WeakIdentityHashMap(100);
		lock = new ReentrantReadWriteLock();
		omitVariables = new RDVarSet();
		healVariables = new RDVarSet();
		noiseVariables = new RDVarSet();
	}

	/**
	 * Returns variable object pointed at the given variable. If there is no
	 * variable object matching the given one, new object is made and returned.
	 * 
	 */
	public RDVariable getVariable(Object instance, String properVarName) {

		RDObjVarCollection rdovc;

		/* optimistic policy - variable is already present in most cases */
		try {
			lock.readLock().lock();
			rdovc = (RDObjVarCollection) rdvariables.get(instance);
		} finally {
			lock.readLock().unlock();
		}
		/* return the variable object */
		if (rdovc == null) {
			/* if the instance is not yet in the collection - add it */
			try {
				lock.writeLock().lock();
				if (!rdvariables.containsKey(instance)) {
					rdovc = new RDObjVarCollection();
					rdvariables.put(instance, rdovc);
				} else {
					rdovc = (RDObjVarCollection) rdvariables.get(instance);
				}
			} finally {
				lock.writeLock().unlock();
			}
		}

		return rdovc.getVariable(instance, properVarName);

	}

	/**
	 * A class which contains a set of variables for the instance in
	 * rdvariables.
	 * 
	 * @author zdenek
	 * 
	 */
	private class RDObjVarCollection {
		/* read write lock to protect rdObjVar */
		private ReentrantReadWriteLock lock;

		HashMap<String, RDVariable> rdObjVar;

		RDObjVarCollection() {
			lock = new ReentrantReadWriteLock();
			rdObjVar = new HashMap<String, RDVariable>();
		}

		/**
		 * Returns ERVariable or ARVariable object pointed at the given
		 * variable. If there is no object matching the given one, new object is
		 * made and returned.
		 * 
		 */
		public RDVariable getVariable(Object ins, String str) {
			RDVariable rdv;

			
			/* optimistic policy - variable is already present in most cases */
			try {
				lock.readLock().lock();
				rdv = rdObjVar.get(str);
				if (rdv != null)
					return rdv;
			} finally {
				lock.readLock().unlock();
			}

			/* if the variable is not yet in the collection - add it */
			try {
				lock.writeLock().lock();
				if (!rdObjVar.containsKey(str)) {
					rdv = RaceDetector.detector.getNewVariable(ins, str);
					rdObjVar.put(str, rdv);
					if (omitVariables.isVarInSet(str)){
						rdv.varOmited = true;
						if (DEBUG)
							System.out.println(" Variable: " + str + " was set to be ommited.");
					}
					if (healVariables.isVarInSet(str)){
						rdv.prepareHealing();
						rdv.raceDetected = true;
						if (DEBUG)
							System.out.println(" Variable: " + str + " was set to be healed.");
					}
					if (noiseVariables.isVarInSet(str)){
						rdv.varNoiseInject = true;
						if (DEBUG)
							System.out.println(" Variable: " + str + " was set to be focused by a noise.");
					}
					//System.out.println(this + ":" + System.identityHashCode(str) + " X " + str + " X " + rdv);		
					return rdv;
				} else {
					return rdObjVar.get(str);
				}
			} finally {
				lock.writeLock().unlock();
			}

		}

	}
	
	public void printStatistics() {
		System.out.println(" Set size:" + rdvariables.size());
	}

}