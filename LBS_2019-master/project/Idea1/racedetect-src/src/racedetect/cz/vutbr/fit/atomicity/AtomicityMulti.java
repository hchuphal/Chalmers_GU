package cz.vutbr.fit.atomicity;

import java.util.*;

import javax.xml.transform.sax.TransformerHandler;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

import com.ibm.contest.utils.ProgramLocationParser;

import cz.vutbr.fit.racedetector.Access;
import cz.vutbr.fit.racedetector.RaceDetector;

/**
 * The representation of an atomicity which as more than three ends.
 * 
 * @author zdenek
 * 
 */
/*
 * SYNCHRONIZATION - inner state is given by: atomEnd
 * 
 * immutable and therefore thread safe
 */
public class AtomicityMulti implements Atomicity {

	// the set of ends of the atomicity
	private final Access[] atomEnd;
	public final Access atomBegin;
	// counter of the occurence of this atomicity violation
	private int violationCount = 0;
	
	/**
	 * Constructor gets a set of ends of the atomicity.
	 * 
	 * @param aEnd
	 */
	public AtomicityMulti(Access aBegin, HashSet<Access> aEnd) {
		atomBegin = aBegin;
		atomEnd = new Access[aEnd.size()];
		Iterator<Access> iter = aEnd.iterator();
		for (int i = 0; i < aEnd.size(); i++)
			atomEnd[i] = iter.next();
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
	 * 
	 */
	public Access[] getAtomEnds(){
		Access[] arr = new Access[atomEnd.length];
		for (int i=0; i<atomEnd.length; i++)
			arr[i] = atomEnd[i];
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
	 * Returns true if the given program location represents the end of the
	 * atomicity. (According to atomicity.dtd)
	 * 
	 */
	public RaceDetector.Operation isEnd(String progLocation) {
		for (int i=0; i< atomEnd.length; i++){
			if (atomEnd[i].progLoc == progLocation)
				return atomEnd[i].mode;
		}
		return null;
	}


	/**
	 * Generates an XML record of this atomicity.
	 */
	public void genXML(TransformerHandler hd, boolean learning) throws SAXException {
		AttributesImpl atts = new AttributesImpl();

		if (learning){
			atts.addAttribute("","", "violatedCount", "CDATA", new Integer(violationCount).toString());
			hd.startElement("", "", "MULTIATOM", atts);
		}
		else{
			hd.startElement("", "", "MULTIATOM", null);
		}
		atts.clear();
		atts.addAttribute("", "", "loc", "CDATA", atomBegin.progLoc);
		atts.addAttribute("", "", "mode", "CDATA", atomBegin.mode
				.toString());
		hd.startElement("", "", "BEGIN", atts);
		hd.endElement("", "", "BEGIN");
		for (int i=0; i< atomEnd.length; i++){
			atts.clear();
			atts.addAttribute("", "", "loc", "CDATA", atomEnd[i].progLoc);
			atts.addAttribute("", "", "mode", "CDATA", atomEnd[i].mode
					.toString());
			hd.startElement("", "", "END", atts);
			hd.endElement("", "", "END");
		}
		hd.endElement("", "", "MULTIATOM");

		return;
	}

	/**
	 * Returns the string representation of this atomicity.
	 */
	public String toString() {
		try {
			String ends = new String();
			int i = 0;
			for (int a=0; a< atomEnd.length; a++){
				if (i == 0)
					ends += new ProgramLocationParser(atomEnd[a].progLoc)
							.getSourceLocation();
				else
					ends += ", "
							+ (new ProgramLocationParser(atomEnd[a].progLoc))
									.getSourceLocation();
				i++;
			}

			return String.format("   From: %1$s%n   To one of: %2$s%n",
					(new ProgramLocationParser(atomBegin.progLoc))
							.getSourceLocation(), ends);
		} catch (Exception e) {
			String ends = new String();
			int i = 0;
			for (int a=0; a< atomEnd.length; a++){
				if (i == 0)
					ends += atomEnd[a].progLoc;
				else
					ends += ", " + atomEnd[a].progLoc;
				i++;
			}

			return String.format("   From: %1$s%n   To one of: %2$s%n", atomBegin
					.progLoc, ends);
		}
	}

}
