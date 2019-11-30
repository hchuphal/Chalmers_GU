package cz.vutbr.fit.racedetector;

/**
 * The interface for race detecting algorithms. This interface simplify the
 * ConTest listeners architecture to a few methods to implement.
 * 
 * 
 * @author zdenek
 * 
 */
public interface Detector {

	/**
	 * Returns a new structure to maintain information concerning the variable.
	 * @param inst Variable instance - according to ConTest.
	 * @param str Name of the variable - according to ConTest.
	 * @return variable object
	 */	
	RDVariable getNewVariable(Object inst, String str);
		
	/**
	 * Returns a new structure to maintain information concerning the thread.
	 * @return thread object
	 */	
	RDThread getNewThread();	

}
