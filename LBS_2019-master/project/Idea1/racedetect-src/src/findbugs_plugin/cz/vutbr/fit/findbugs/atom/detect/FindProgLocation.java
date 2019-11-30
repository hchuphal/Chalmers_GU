package cz.vutbr.fit.findbugs.atom.detect;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.*;

import cz.vutbr.fit.findbugs.atom.analysis.*;

import org.apache.bcel.Constants;
import org.apache.bcel.classfile.ConstantClass;
import org.apache.bcel.classfile.ConstantMethodref;
import org.apache.bcel.classfile.ConstantNameAndType;
import org.apache.bcel.classfile.ConstantUtf8;
import org.apache.bcel.generic.CPInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.generic.InstructionHandle;

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
public class FindProgLocation extends CFGDetector {


	/**
	 * interesting variables - see Constructor...
	 */
	private HashSet<String> varToTrack = new HashSet<String>();
	
	/**
	 * colleciton of program locations to check
	 */
	private HashSet<String> progLocations = new HashSet<String>();

	/**
	 * Constructor initialize the atom collection.
	 * 
	 * @param bugReporter
	 *            is not used
	 */
	public FindProgLocation(BugReporter bugReporter) {
		varToTrack.add("es.tid.TIDorbj.core.comm.iiop.IIOPCommunicationDelegate.forwardReference");
		varToTrack.add("es.tid.TIDorbj.core.comm.iiop.IIOPCommLayer.recover_count");
		varToTrack.add("es.tid.TIDorbj.core.typecode.TypeCodeImpl.m_exhaustive_equal");
		varToTrack.add("es.tid.TIDorbj.core.comm.iiop.IIOPProfile.m_listen_point");
		varToTrack.add("es.tid.TIDorbj.util.Trace.m_log");
		varToTrack.add("test.Airlines$Flight.soldSeats");
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
		IAnalysisCache analysisCache = Global.getAnalysisCache();

		ConstantPoolGen cpg = analysisCache.getClassAnalysis(
				ConstantPoolGen.class, methodDescriptor.getClassDescriptor());
		ConstantPool cp = cpg.getConstantPool();

		for (Iterator<Location> i = cfg.locationIterator(); i.hasNext();) {
			Location location = i.next();

			short opcode = location.getHandle().getInstruction().getOpcode();
			if (opcode != Constants.INVOKESTATIC) {
				continue;
			} else {

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
					System.out.println("ctmi.varName: " + ctmi.varName);
					if (varToTrack.contains(ctmi.varName)){
						progLocations.add(ctmi.access.progLoc);
					}
				}
				// other methods
				else {
					// nothing
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
		/** ************************************************************************** */
		BufferedWriter fd;
		String dirName = "race_detector";
		/* if doesn't exist directory atomicity - make it */
		File dir = new File(dirName);
		if (!dir.exists()) {
			dir.mkdir();
		}

		String fName = dirName + File.separator + "noiselocations";

		/* create and open apropriate file */
		try {
			fd = new BufferedWriter(new FileWriter(fName));
		} catch (Exception exc) {
			System.err.println(" Failed to open file:" + fName);
			return;
		}

		/** ************************ */
		try{
			for (String loc : progLocations){
				fd.write(loc);
				fd.newLine();
			}
		} catch(Exception e){
			//do nothing
		}
		
		/* close the file */
		try {
			fd.close();
		} catch (Exception exc) {
			System.err.println(" Failed to close file:" + fName);
		}

	}

}
