package cz.vutbr.fit.atomicity;

import javax.xml.transform.sax.TransformerHandler;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

import com.ibm.contest.utils.ProgramLocationParser;

import cz.vutbr.fit.racedetector.Access;
import cz.vutbr.fit.racedetector.RaceDetector;

/**
 * The representation of atomicity which has one start and two possible ends.
 * 
 * @author zdenek
 * 
 *//*
 * SYNCHRONIZATION - inner state is given by: atomEnd1, atomEnd2
 * 
 * immutable and therefore thread safe
 */

public class AtomicityDouble implements Atomicity {

	// two ends and one begin
	private final Access atomEnd1, atomEnd2;
	public final Access atomBegin;
	// counter of the occurence of this atomicity violation
	private int violationCount = 0;

	/**
	 * Constructor takes the two ends.
	 *  
	 */
	public AtomicityDouble(Access aBegin, Access aEnd1, Access aEnd2) {
		atomBegin = aBegin;
		atomEnd1 = aEnd1;
		atomEnd2 = aEnd2;
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
		Access[] arr = new Access[2];
		arr[0] = atomEnd1;
		arr[1] = atomEnd2;
		return arr;
	}

	/**
	 * This method will safely increment tne counter of this
	 * atomicity violation - this value is used during the learning stage.
	 * 
	 *
	 */
	public synchronized void incViolation(){
		violationCount++;
	}
	
	/**
	 * Determines if the given program location represents one of the ends of
	 * this atomicity.
	 */
	public RaceDetector.Operation isEnd(String progLocation) {
		if (progLocation == atomEnd1.progLoc)
			return atomEnd1.mode;
		if (progLocation == atomEnd2.progLoc)
			return atomEnd2.mode;
		else
			return null;
	}

	
	/**
	 * Generates XML record of this atomicity. (According to atomicity.dtd)
	 */
	public void genXML(TransformerHandler hd, boolean learning) throws SAXException {
		AttributesImpl atts = new AttributesImpl();

		if (learning){
			atts.addAttribute("","", "violatedCount", "CDATA", new Integer(violationCount).toString());
			hd.startElement("", "", "DOUBLEATOM", atts);
		}
		else{
			hd.startElement("", "", "DOUBLEATOM", null);
		}
		atts.clear();
		atts.addAttribute("", "", "loc", "CDATA", atomBegin.progLoc);
		atts.addAttribute("", "", "mode", "CDATA", atomBegin.mode
				.toString());
		hd.startElement("", "", "BEGIN", atts);
		hd.endElement("", "", "BEGIN");
		atts.clear();
		atts.addAttribute("", "", "loc", "CDATA", atomEnd1.progLoc);
		atts.addAttribute("", "", "mode", "CDATA",
				atomEnd1.mode.toString());
		hd.startElement("", "", "END", atts);
		hd.endElement("", "", "END");
		atts.clear();
		atts.addAttribute("", "", "loc", "CDATA", atomEnd2.progLoc);
		atts.addAttribute("", "", "mode", "CDATA",
				atomEnd2.mode.toString());
		hd.startElement("", "", "END", atts);
		hd.endElement("", "", "END");
		hd.endElement("", "", "DOUBLEATOM");

		return;
	}

	/**
	 * Give a text representation of the atomicity.
	 */
	public String toString() {
		try {
			return String.format("   From: %1$s%n   To: %2$s, %3$s%n",
					(new ProgramLocationParser(atomBegin.progLoc))
							.getSourceLocation(), (new ProgramLocationParser(
							atomEnd1.progLoc)).getSourceLocation(),
					(new ProgramLocationParser(atomEnd2.progLoc))
							.getSourceLocation());
		} catch (Exception e) {
			return String
					.format("   From: %1$s%n   To: %2$s, %3$s%n", atomBegin
							.progLoc, atomEnd1.progLoc, atomEnd2
							.progLoc);
		}
	}


}
