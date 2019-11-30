package cz.vutbr.fit.atomicity;

import java.io.*;
import java.util.*;

import javolution.util.FastComparator;
import javolution.util.FastMap;

//SAX classes.
import org.xml.sax.*;
import org.xml.sax.helpers.*;

import cz.vutbr.fit.racedetector.Access;
import cz.vutbr.fit.racedetector.RaceDetector;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.xml.transform.sax.*;

/**
 * This class contains a collection of atomicity sections indexed by
 * programLocation of the begining access to the atomicity. It implements import
 * from and export to XML files and several basic operation on the colleciton.
 * 
 * @see Atomicity
 * @see RaceDetector
 * 
 * @author zdenek
 * 
 */
/*
 * SYNCHRONIZATION - inner state is given by: variables
 * 
 * synchronization is done by right locking
 */
public class AtomicityCollection {

	/*
	 * --- DEBUG OPTIONS ----------------------------------------
	 */
	/* debug mode - to put details in output files set to true */
	private static final boolean DEBUG = false;

	/*
	 * ----------------------------------------------------------
	 */

	// if to allow atomicity ending only with EXITs
	private static final boolean ALLOW_EMPTY = false;

	/* file name of the file containing the DTD for the XML of atomicities */
	private static final String DTD_FILE = "atomicity.dtd";

	/* type of the atomicities */
	private enum AtomType {
		SIMPLEATOM, DOUBLEATOM, TRIPLEATOM, MULTIATOM
	}

	/* structure to maintain variable related information */
	/* GuardedBy lock */
	private FastMap <String, Atomicity> atomsec;

	/* true if the atomicity set was produced during the correct run */
	public volatile boolean correctRun = true;

	/**
	 * Constructor.
	 * 
	 */
	public AtomicityCollection() {
		atomsec = new FastMap<String, Atomicity>();
		atomsec.setKeyComparator(FastComparator.IDENTITY);
		atomsec.setShared(true);
	}

	/**
	 * Returns Atomicity object pointed at the given programLocation. If there
	 * is no Atomicity object matching the given key null is returned.
	 * 
	 * @param programLocation
	 * 
	 * @return Atomicity object or null
	 */
	public Atomicity getAtomicity(String programLocation) {
		Atomicity atomRecord = null;

		atomRecord = atomsec.get(programLocation);

		return atomRecord;
	}

	/**
	 * Add a new atomicity to the collection. Atomicity is represented by its
	 * start access and one of Atomicity classes encapsulating atomicity ends.
	 * 
	 */
	public void addAtomicity(String progLoc, Atomicity atom) {
		if (progLoc != null && atom != null) {
			atomsec.put(progLoc, atom);
			atom.incViolation();
		}
	}

	/**
	 * Add a new atomicity to the collection. Atomicity is represented by its
	 * start access and one of Atomicity classes encapsulating atomicity ends.
	 * 
	 */
	public void addAll(AtomicityCollection ac) {
		if (ac != null) {
			atomsec.putAll(ac.atomsec);
		}
	}

	/**
	 * Stores atomicity information into the "atomicity" directory.
	 * 
	 * @param learning
	 *            If true statistics of violation will be stored
	 */
	public void storeAtomicityToFile(BufferedWriter fd, boolean learning) {

		if (DEBUG)
			System.out.println("Storing atomicity to files...");

		if (fd == null)
			return;

		/* prepare XML stuff */
		StreamResult streamResult = new StreamResult(fd);
		SAXTransformerFactory tf = (SAXTransformerFactory) SAXTransformerFactory
				.newInstance();
		TransformerHandler hd;
		try {
			hd = tf.newTransformerHandler();
		} catch (TransformerConfigurationException e) {
			return;
		}
		Transformer serializer = hd.getTransformer();
		serializer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");
		try {
			// try to find DTD file
			serializer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM,
					findDTDFile());
		} catch (FileNotFoundException fnfe) {
			System.out.println("Error: DTD file '" + DTD_FILE
					+ "' not found in the classpath.");
			System.out.println(fnfe.getMessage());
			System.exit(-1);
		}
		serializer.setOutputProperty(OutputKeys.INDENT, "yes");
		hd.setResult(streamResult);
		try {
			hd.startDocument();
			if (learning) {
				AttributesImpl atts = new AttributesImpl();
				atts.addAttribute("", "", "correctRun", "CDATA", new Boolean(
						correctRun).toString());
				hd.startElement("", "", "ATOMICITY", atts);
			} else {
				hd.startElement("", "", "ATOMICITY", null);
			}
			// generates the content of the file
			for (Atomicity atom : atomsec.values()) {
				atom.genXML(hd, learning);
			}

			hd.endElement("", "", "ATOMICITY");
			hd.endDocument();
		} catch (SAXException e) {
			// consume - nothing will be recorded to the file
		}

	}

	/**
	 * Restores atomicity information from the file. And fill the structures.
	 * 
	 */
	public boolean restoreAtomicityFromFile(BufferedReader fd) {

		if (fd == null)
			return false;

		SAXParserFactory spf = SAXParserFactory.newInstance();
		spf.setValidating(true); // Validation required
		SAXParser sp;
		try {
			sp = spf.newSAXParser();
		} catch (ParserConfigurationException pe) {
			System.err.println(" Failed to parse file: " + pe);
			return false;
		} catch (SAXException se) {
			System.err.println(" Failed to parse file: " + se);
			return false;
		}
		InputSource input = new InputSource(fd);
		XMLHandler handler = new XMLHandler();
		// tell the parser to parse the input and notify the handler
		try {
			sp.parse(input, handler);
		} catch (IOException ioe) {
			System.err.println("Problem: " + ioe);
			return false;
		} catch (SAXException se) {
			System.err.println("Problem: " + se);
			return false;
		}

		return true;
	}

	/**
	 * Removes from this atomicity collection the record that is determined by
	 * its key.
	 * 
	 * @param key
	 */
	public void remove(String key) {
		atomsec.remove(key);
	}

	/**
	 * Removes from this atomicity collection all records that are presented in
	 * the given atomicity collection.
	 * 
	 * @param remCollection
	 */
	public void removeAll(AtomicityCollection remCollection) {

		if (remCollection != null) {
			for (String key : remCollection.getKeySet())
				atomsec.remove(key);
		}
	}

	/**
	 * Removes from this atomicity collection all records that uses as key
	 * ConTest locations present in the given Set.
	 * 
	 * @param remCollection
	 */
	public void removeAll(HashSet<String> remCollection) {

		if (remCollection != null) {
			for (String key : remCollection)
				atomsec.remove(key);
		}
	}

	/**
	 * Returns the number of atomicities present in this collection.
	 * 
	 * @return Number of atomicities in the collection.
	 */
	public int getAtomicityCollectionSize() {
		return atomsec.size();
	}

	/**
	 * Returns text representation - used for debuging.
	 * 
	 * @return Information string
	 */
	public String getDebugText() {
		String str = "  ";

		for (Atomicity atom : atomsec.values()) {
			str = String.format("%1$s%n%2$s", str, atom.toString());
		}
		return str;
	}

	/**
	 * Returns the key set of the atomsec.
	 */
	public HashSet<String> getKeySet() {
		return new HashSet<String>(atomsec.keySet());
	}

	/**
	 * Returns the right Atomicity object according to the number of ends the
	 * atomicity should have.
	 * 
	 * @param begin
	 * @param ends
	 * @return atomicity instance
	 */
	public static Atomicity getNewAtomicity(Access begin, HashSet<Access> ends) {

		int endCount = ends.size();
		Access tmpEnd, tmpEnd2, tmpEnd3;
		Iterator<Access> iter;

		switch (endCount) {
		case 0:
			// error - there shoudl be at least one end
			// this atomicity is not legal and will not be saved
			return null;
		case 1:
			// one end -> simple atomicity
			// the simple atomicity which ends with EXIT operation is not
			// interesting for us
			tmpEnd = ends.iterator().next();
			if (ALLOW_EMPTY || (tmpEnd.mode != RaceDetector.Operation.EXIT))
				return new AtomicitySimple(begin, tmpEnd);

			break;
		case 2:
			// two ends -> double atomicity
			// the double atomicity which ends with EXIT operations is not
			// interesting for us
			iter = ends.iterator();
			tmpEnd = iter.next();
			tmpEnd2 = iter.next();

			if (ALLOW_EMPTY
					|| ((tmpEnd.mode != RaceDetector.Operation.EXIT) || (tmpEnd2.mode != RaceDetector.Operation.EXIT)))
				return new AtomicityDouble(begin, tmpEnd, tmpEnd2);
			break;
		case 3:
			// two ends -> double atomicity
			// the double atomicity which ends with EXIT operations is not
			// interesting for us
			iter = ends.iterator();
			tmpEnd = iter.next();
			tmpEnd2 = iter.next();
			tmpEnd3 = iter.next();

			if (ALLOW_EMPTY
					|| ((tmpEnd.mode != RaceDetector.Operation.EXIT)
							|| (tmpEnd2.mode != RaceDetector.Operation.EXIT) || (tmpEnd3.mode != RaceDetector.Operation.EXIT)))
				return new AtomicityTriple(begin, tmpEnd, tmpEnd2, tmpEnd3);
			break;
		default:
			// more than two ends -> multi atomicity
			// the multi atomicity which ends only with EXIT operations is
			// not interesting for us
			boolean legal = false;
			for (Access acs : ends) {
				if (acs.mode != RaceDetector.Operation.EXIT)
					legal = true;
			}
			if (ALLOW_EMPTY || legal)
				return new AtomicityMulti(begin, ends);
			break;
		}

		// this should not occur
		return null;
	}

	/**
	 * Returns the path to the DTD file located somewhere in the classpath. If
	 * the file is not found an exception is thrown.
	 * 
	 * @return
	 * @throws FileNotFoundException
	 */
	private String findDTDFile() throws FileNotFoundException {
		String classPath = System.getProperty("java.class.path");
		String delimiter = System.getProperty("path.separator");
		/* till there is more tokens */
		for (StringTokenizer st = new StringTokenizer(classPath, delimiter); st
				.hasMoreTokens();) {
			/* enter the directory */
			File dir = new File(st.nextToken());
			if (dir.isFile()) {
				dir = dir.getParentFile();
			}
			/* or open the file */
			File propFile = new File(dir, DTD_FILE);
			if (propFile.isFile()) {
				if (DEBUG)
					System.out.println(" Using DTD:" + dir + File.separator
							+ DTD_FILE);
				return dir + File.separator + DTD_FILE;
			} else {
				if (DEBUG)
					System.out.println(" NOT FOUND DTD:" + dir + File.separator
							+ DTD_FILE);
			}
		}
		/* if the file was not find */
		throw new FileNotFoundException();
	}

	// ***********************************************************************
	// ***********************************************************************
	/**
	 * A class implements the handler for processing an XML file. The methods of
	 * this class are called during the processing of the XML.
	 * 
	 * @author zdenek
	 * 
	 */
	class XMLHandler extends DefaultHandler {

		// Accumulate text
		private StringBuffer accumulator = new StringBuffer();
		// A flag representing the atomicity type currently processing
		private AtomType atomType;
		// A temp. accesses
		private Access beginAccess, endAccess, end2Access, end3Access;
		// A temp. accesses set
		private HashSet<Access> endAccesses = new HashSet<Access>();
		// A temp. key to the set of atomicities
		private String atomKey;

		/**
		 * When the parser encounters plain text (not XML elements), it calls
		 * this method.
		 * 
		 */
		public void characters(char[] buffer, int start, int length) {
			accumulator.append(buffer, start, length);
		}

		/**
		 * Called when the parser gets to some start element. The element text
		 * representation and its attributes are given.
		 */
		public void startElement(String namespaceURL, String localName,
				String qname, Attributes attributes) {
			String progLoc, modeStr;
			RaceDetector.Operation mode;

			accumulator.setLength(0);
			if (qname.equals("ATOMICITY")) {
				modeStr = attributes
						.getValue(attributes.getIndex("correctRun"));
				if (modeStr != null) {
					if (modeStr.equalsIgnoreCase("true"))
						correctRun = true;
					if (modeStr.equalsIgnoreCase("false"))
						correctRun = false;
				}
			}
			if (qname.equals("SIMPLEATOM")) {
				atomType = AtomType.SIMPLEATOM;
				beginAccess = null;
				endAccess = null;
			}
			if (qname.equals("DOUBLEATOM")) {
				atomType = AtomType.DOUBLEATOM;
				beginAccess = null;
				endAccess = null;
				end2Access = null;
			}
			if (qname.equals("TRIPLEATOM")) {
				atomType = AtomType.TRIPLEATOM;
				beginAccess = null;
				endAccess = null;
				end2Access = null;
				end3Access = null;
			}
			if (qname.equals("MULTIATOM")) {
				atomType = AtomType.MULTIATOM;
				beginAccess = null;
				endAccesses.clear();
			}
			if (qname.equals("BEGIN")) {
				progLoc = attributes.getValue(attributes.getIndex("loc"));
				modeStr = attributes.getValue(attributes.getIndex("mode"));
				if (modeStr.equalsIgnoreCase("write"))
					mode = RaceDetector.Operation.WRITE;
				else
					mode = RaceDetector.Operation.READ;
				beginAccess = new Access(progLoc, mode);
				atomKey = progLoc.intern();
			}
			if (qname.equals("END")) {
				progLoc = attributes.getValue(attributes.getIndex("loc"));
				modeStr = attributes.getValue(attributes.getIndex("mode"));
				if (modeStr.equalsIgnoreCase("write"))
					mode = RaceDetector.Operation.WRITE;
				else if (modeStr.equalsIgnoreCase("read"))
					mode = RaceDetector.Operation.READ;
				else
					mode = RaceDetector.Operation.EXIT;
				if (atomType == AtomType.SIMPLEATOM)
					endAccess = new Access(progLoc, mode);
				if (atomType == AtomType.DOUBLEATOM)
					if (endAccess == null)
						endAccess = new Access(progLoc, mode);
					else
						end2Access = new Access(progLoc, mode);
				if (atomType == AtomType.TRIPLEATOM)
					if (endAccess == null)
						endAccess = new Access(progLoc, mode);
					else {
						if (end2Access == null)
							end2Access = new Access(progLoc, mode);
						else
							end3Access = new Access(progLoc, mode);
					}
				if (atomType == AtomType.MULTIATOM)
					endAccesses.add(new Access(progLoc, mode));
			}

		}

		/**
		 * Called when the parser gets to some end element. The element text
		 * representation is given.
		 */
		public void endElement(String namespaceURL, String localName,
				String qname) {
			if (qname.equals("SIMPLEATOM")) {
				if ((beginAccess != null) && (endAccess != null)) {
					atomsec.put(atomKey, new AtomicitySimple(beginAccess,
							endAccess));
				} else {
					System.err
							.println(" Wrong value when processing SIMPEATOM.");
				}
			}
			if (qname.equals("DOUBLEATOM")) {
				if ((beginAccess != null) && (endAccess != null)
						&& (end2Access != null)) {
					atomsec.put(atomKey, new AtomicityDouble(beginAccess,
							endAccess, end2Access));
				} else {
					System.err
							.println(" Wrong value when processing DOUBLEATOM.");
				}
			}
			if (qname.equals("TRIPLEATOM")) {
				if ((beginAccess != null) && (endAccess != null)
						&& (end2Access != null) && (end3Access != null)) {
					atomsec.put(atomKey, new AtomicityTriple(beginAccess,
							endAccess, end2Access, end3Access));
				} else {
					System.err
							.println(" Wrong value when processing TRIPLEATOM.");
				}
			}
			if (qname.equals("MULTIATOM")) {
				if ((beginAccess != null) && !(endAccesses.isEmpty())) {
					atomsec.put(atomKey, new AtomicityMulti(beginAccess,
							new HashSet<Access>(endAccesses)));
				} else {
					System.err
							.println(" Wrong value when processing MULTIATOM.");
				}
			}
		}

		/**
		 * Called at the end of parsing.
		 */
		public void endDocument() {
		}

		/*
		 * for not to reading DTD file @Override public InputSource
		 * resolveEntity(String publicId, String systemId) throws IOException,
		 * SAXException { return new InputSource(new ByteArrayInputStream(new
		 * byte[0])); }
		 */
	}
}
