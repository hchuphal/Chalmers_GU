package cz.vutbr.fit.findbugs.atom.analysis;

import cz.vutbr.fit.racedetector.Access;
import cz.vutbr.fit.racedetector.RaceDetector.Operation;

/**
 * Class encapsulating information concerning ConTest method invocation.
 * 
 * @see CTMethods
 * 
 * @author zdenek
 *
 */
/* SYNCHRONIZATION - immutable and therefore thread safe */
public 	class CTVarInfo{

	// ConTest identification of the variable
	public final String varName;
	// Access to the variable (program location and opeartion
	public final Access access;
	/**
	 * Constructor.
	 * 
	 * @param vName Variable name according to ConTest.
	 * @param pLoc Program location according to ConTest.
	 * @param op Operation (read/write).
	 */
	public CTVarInfo(String vName, String pLoc, Operation op){
		varName = vName;
		access = new Access(pLoc, op);
	}
	
}
