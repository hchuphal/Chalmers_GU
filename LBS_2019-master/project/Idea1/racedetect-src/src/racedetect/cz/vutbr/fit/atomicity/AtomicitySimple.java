package cz.vutbr.fit.atomicity;

import org.xml.sax.helpers.AttributesImpl;

import com.ibm.contest.utils.ProgramLocationParser;

import cz.vutbr.fit.racedetector.Access;
import cz.vutbr.fit.racedetector.RaceDetector;

import org.xml.sax.*;
import javax.xml.transform.sax.*;

/**
 * The representation of an atomicity with one end.
 * 
 * @author zdenek
 * 
 */
/*
 * SYNCHRONIZATION - inner state is given by: atomEnd
 * 
 * immutable and therefore thread safe
 */

public class AtomicitySimple implements Atomicity {

	// the end and begin of the atomicity
	private final Access atomEnd;
	public final Access atomBegin;
	// counter of the occurence of this atomicity violation
	private int violationCount = 0;
	
	/**
	 * Constructor takes the end of the atomicity.
	 * 
	 * @param aEnd
	 */
	public AtomicitySimple(Access aBegin, Access aEnd) {
		atomBegin = aBegin;
		atomEnd = aEnd;
	}

	/**
	 * Returns the access type (read/write of the atomicity begin operation.
	 */
	public RaceDetector.Operation getBeginOp() {
		return atomBegin.mode;
	}
	
	/**
	 * Returns ConTest program location of the begin access of this atomicity. 
	 */
	public String getKeyProgLocation(){
		return atomBegin.progLoc;
	}

	/**
	 * Returns the array of ending Accesses.
	 * 
	 */
	public Access[] getAtomEnds(){
		Access[] arr = new Access[1];
		arr[0] = atomEnd;
		return arr;
	}

	/**
	 * This method will safely increment tne counter of this
	 * atomicity violation - this value is used during the learning stage.
	 * 
	 */
	public synchronized void incViolation(){
		violationCount++;
	}

	/**
	 * Returns true if the given program location represents the end of the
	 * atomicity.
	 */
	public RaceDetector.Operation isEnd(String progLocation) {
		
		if (atomEnd.progLoc == progLocation)
			return atomEnd.mode;
		else
			return null;
	}

	
	/**
	 * Generates an XML record of this atomicity. (According to atomicity.dtd)
	 */
	public void genXML(TransformerHandler hd, boolean learning) throws SAXException {
		AttributesImpl atts = new AttributesImpl();

		if (learning){
			atts.addAttribute("","", "violatedCount", "CDATA", new Integer(violationCount).toString());
			hd.startElement("", "", "SIMPLEATOM", atts);
		}
		else{
			hd.startElement("", "", "SIMPLEATOM", null);
		}
		atts.clear();
		atts.addAttribute("", "", "loc", "CDATA", atomBegin.progLoc);
		atts.addAttribute("", "", "mode", "CDATA", atomBegin.mode
				.toString());
		hd.startElement("", "", "BEGIN", atts);
		hd.endElement("", "", "BEGIN");
		atts.clear();
		atts.addAttribute("", "", "loc", "CDATA", atomEnd.progLoc);
		atts.addAttribute("", "", "mode", "CDATA", atomEnd.mode
				.toString());
		hd.startElement("", "", "END", atts);
		hd.endElement("", "", "END");
		hd.endElement("", "", "SIMPLEATOM");

		return;
	}

	/**
	 * Returns string representation of the atomicity.
	 */
	public String toString() {
		try {
			return String.format("   From: %1$s%n   To: %2$s%n",
					(new ProgramLocationParser(atomBegin.progLoc))
							.getSourceLocation(), (new ProgramLocationParser(
							atomEnd.progLoc)).getSourceLocation());
		} catch (Exception e) {
			return String.format("   From: %1$s%n   To: %2$s%n", atomBegin
					.progLoc, atomEnd.progLoc);
		}
	}

}
