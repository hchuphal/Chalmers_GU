package cz.vutbr.fit.atomicity;

import org.xml.sax.*;

import cz.vutbr.fit.racedetector.*;

import javax.xml.transform.sax.*;

/**
 * Interface defines the basic operations which every atomicity should support.
 * 
 * @author zdenek
 * 
 */
public interface Atomicity {

	
	/**
	 * Returns ConTest program location of the start Access to the Atomicity.
	 * This program location is used as the unique identification of this
	 * atomicity.
	 * 
	 * @return program location
	 */
	public String getKeyProgLocation();

	/**
	 * Returns the access type of the atomicity begin operation. (read or write)
	 * 
	 * @return access type
	 */
	public RaceDetector.Operation getBeginOp();

	/**
	 * Returns the array of ending Accesses.
	 * 
	 * 
	 */
	public Access[] getAtomEnds();
	
	/**
	 * Calling of this method will safely increment tne counter of this
	 * atomicity violation - this value is used during the learning stage.
	 * 
	 *
	 */
	public void incViolation();

	/**
	 * Returns true if the given program location represents the end of the
	 * atomicity.
	 * 
	 * @param progLocation
	 *            ConTest program location.
	 */
	public RaceDetector.Operation isEnd(String progLocation);

	/**
	 * Generates XML apropriate record of the atomicity. The record has to
	 * follow the atomicity.dtd definition.
	 * 
	 * @param hd
	 * @param learning True if the violation count should be also written
	 * @throws SAXException
	 */
	public void genXML(TransformerHandler hd, boolean learning) throws SAXException;

	/**
	 * Returns string representation of the atomicity - suitable for users.
	 * 
	 */
	public String toString();

}