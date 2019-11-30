package cz.vutbr.fit.findbugs.atom.detect;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.*;

import org.apache.bcel.Constants;
import org.apache.bcel.classfile.ConstantClass;
import org.apache.bcel.classfile.ConstantMethodref;
import org.apache.bcel.classfile.ConstantNameAndType;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ConstantUtf8;
import org.apache.bcel.generic.CPInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionHandle;

import cz.vutbr.fit.atomicity.AtomicityCollection;
import cz.vutbr.fit.findbugs.atom.analysis.AtomDataflow;
import cz.vutbr.fit.findbugs.atom.analysis.AtomFact;
import cz.vutbr.fit.findbugs.atom.analysis.CTMethods;
import cz.vutbr.fit.findbugs.atom.analysis.CTVarInfo;
import cz.vutbr.fit.racedetector.Access;
import cz.vutbr.fit.racedetector.RaceDetector.Operation;

import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.ba.CFG;
import edu.umd.cs.findbugs.ba.Location;
import edu.umd.cs.findbugs.bcel.CFGDetector;
import edu.umd.cs.findbugs.classfile.CheckedAnalysisException;
import edu.umd.cs.findbugs.classfile.Global;
import edu.umd.cs.findbugs.classfile.IAnalysisCache;
import edu.umd.cs.findbugs.classfile.MethodDescriptor;

/**
 * FindBugs detector which uses the results of our analysis to producing atoms.
 * At the end the atoms are converted to atomicities and stored into the
 * predefined file.
 * 
 * @author zdenek
 * 
 */
public class FindPatterns extends CFGDetector {

	/* print debug info */
	private static final boolean DEBUG = false;

	/**
	 * colleciton of atoms which will be filled up during the work of the
	 * detector;
	 */
	private HashMap<String, AtomCollection> atomCol;
	private AtomicityCollection atomicCol;

	/**
	 * Constructor initialize the atom collection.
	 * 
	 * @param bugReporter
	 *            is not used
	 */
	public FindPatterns(BugReporter bugReporter) {
		atomicCol = new AtomicityCollection();
		atomCol = new HashMap<String, AtomCollection>();
	}

	/**
	 * This method is called when this type of detector is starting to analyze
	 * some method.
	 * <p>
	 * The key phase of the analysis is called from here. The previous analysis
	 * results are obtained and processed. The collection of atoms is builded.
	 * 
	 */
	@Override
	protected void visitMethodCFG(MethodDescriptor methodDescriptor, CFG cfg)
			throws CheckedAnalysisException {

		if (!atomCol.isEmpty()) {
			processAtomCol();
		}
		atomCol.clear();

		IAnalysisCache analysisCache = Global.getAnalysisCache();

		ConstantPoolGen cpg = analysisCache.getClassAnalysis(
				ConstantPoolGen.class, methodDescriptor.getClassDescriptor());
		AtomDataflow atomDataflow = analysisCache.getMethodAnalysis(
				AtomDataflow.class, methodDescriptor);
		ConstantPool cp = cpg.getConstantPool();

		for (Iterator<Location> i = cfg.locationIterator(); i.hasNext();) {
			Location location = i.next();

			short opcode = location.getHandle().getInstruction().getOpcode();
			if (opcode != Constants.INVOKESTATIC) {
				continue;
			} else {
				AtomFact af = atomDataflow.getFactAtLocation(location);
				if (af.isBottom() || af.isTop())
					continue; // dead code?

				// identifikovat
				InstructionHandle handle = location.getHandle();
				CPInstruction ins = (CPInstruction) handle.getInstruction();
				ConstantMethodref cmr = (ConstantMethodref) cp.getConstant(ins
						.getIndex());

				// get target class of invokestatic
				ConstantClass cc = (ConstantClass) cp.getConstant(cmr
						.getClassIndex());
				ConstantUtf8 csm = (ConstantUtf8) cp.getConstant(cc
						.getNameIndex());
				String className = (String) csm.getBytes();

				// only ConTest methods are interesting for us
				if (!className.equals("com/ibm/contest/runtimecore/Manager"))
					continue;

				if (DEBUG)
					System.out.println(" XXX - "
							+ location
							+ " : "
							+ atomDataflow.getFactAtLocation(location)
									.toString());

				// get target method of invokestatic
				ConstantNameAndType cnat = (ConstantNameAndType) cp
						.getConstant(cmr.getNameAndTypeIndex());
				ConstantUtf8 cst = (ConstantUtf8) cp.getConstant(cnat
						.getNameIndex());
				String contestMethod = (String) cst.getBytes();

				// process ConTest method parameters - for access to field
				// methods
				CTVarInfo ctmi = CTMethods.processVarConTestMethod(
						contestMethod, handle, cp, cpg);

				// if it was method representing access to field
				if (ctmi != null) {
					HashSet<Access> prevAccess = af.getVLA(ctmi.varName);
					if (prevAccess != null) {
						AtomCollection ac;
						if (!atomCol.containsKey(ctmi.varName))
							atomCol.put(ctmi.varName, new AtomCollection());
						ac = atomCol.get(ctmi.varName);
						for (Access a : prevAccess)
							ac.add(a, ctmi.access);

					}
				}
				// other methods
				else {
					String exitPoint = CTMethods.processExitMethod(
							contestMethod, handle, cp);
					// if it was method exit method
					if (exitPoint != null) {
						AtomCollection ac;
						for (String varId : af.getVLAcopy().keySet()) {
							if (!atomCol.containsKey(varId))
								atomCol.put(varId, new AtomCollection());
							ac = atomCol.get(varId);
							for (Access a : af.getVLA(varId))
								ac
										.add(a, new Access(exitPoint,
												Operation.EXIT));
						}
					}
				}
			}

		}
	}

	/**
	 * This class is called at the end of the computation. The collection of
	 * atoms is converted to atomicities and these are stored to the XML file.
	 */
	@Override
	public void finishPass() {

		/* for the last method */
		if (!atomCol.isEmpty()) {
			processAtomCol();
		}

		/** ************************************************************************** */
		BufferedWriter fd;
		String dirName = "race_detector";
		/* if doesn't exist directory atomicity - make it */
		File dir = new File(dirName);
		if (!dir.exists()) {
			dir.mkdir();
		}

		String fName = dirName + File.separator + "atomicity.xml";

		/* create and open apropriate file */
		try {
			fd = new BufferedWriter(new FileWriter(fName));
		} catch (Exception exc) {
			System.err.println(" Failed to open file:" + fName);
			return;
		}

		/** ************************ */
		atomicCol.storeAtomicityToFile(fd, false);

		/* close the file */
		try {
			fd.close();
		} catch (Exception exc) {
			System.err.println(" Failed to close file:" + fName);
		}

	}

	/**
	 * todo
	 */
	private void processAtomCol() {

		AtomicityCollection atc;

		for (AtomCollection ac : atomCol.values()) {
			atc = ac.getAtomicityCol();

			if (atc.getAtomicityCollectionSize() == 0)
				return;

			atc = FilterAtomicPattern.joinSameLineAtomicity(atc);
			for (String key : atc.getKeySet()) {
				if (!FilterAtomicPattern.isAtomicPattern(atc.getAtomicity(key)))
					atc.remove(key);
					
			}

			atomicCol.addAll(atc);
		}

	}
}
