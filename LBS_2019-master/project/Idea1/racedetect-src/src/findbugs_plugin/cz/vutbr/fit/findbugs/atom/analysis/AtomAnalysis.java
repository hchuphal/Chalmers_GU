package cz.vutbr.fit.findbugs.atom.analysis;

import java.util.*;

import org.apache.bcel.Constants;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ConstantUtf8;
import org.apache.bcel.classfile.ConstantMethodref;
import org.apache.bcel.classfile.ConstantClass;
import org.apache.bcel.classfile.ConstantNameAndType;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.CPInstruction;
import org.apache.bcel.generic.ConstantPoolGen;

import cz.vutbr.fit.atomicity.AtomicityCollection;
import cz.vutbr.fit.racedetector.Access;

import edu.umd.cs.findbugs.ba.BasicBlock;
import edu.umd.cs.findbugs.ba.DataflowAnalysisException;
import edu.umd.cs.findbugs.ba.DepthFirstSearch;
import edu.umd.cs.findbugs.ba.Edge;
import edu.umd.cs.findbugs.ba.ForwardDataflowAnalysis;

/**
 * <p>
 * Implements control flow analysis which looks for atoms (two consequential
 * accesses to some variable). It uses and detects ConTest methods - access is
 * defined as ConTest method invocation. Information concerning variable and
 * location of an access is based on the parameters of these ConTest methods.
 * 
 * <p>
 * At the end of the analysis, the collection of detected atoms is transformed
 * to AtomicityCollection and is stored into specified XML file.
 * 
 * @see AtomicityCollection
 * @author zdenek
 * 
 */
public class AtomAnalysis extends ForwardDataflowAnalysis<AtomFact> {


	private ConstantPool cp;
	private ConstantPoolGen cpg;
	
	/**
	 * Constructor
	 * 
	 * @param dfs  Depth First Search dataflow analysis
	 * @param cop  Constant pool
	 */
	public AtomAnalysis(DepthFirstSearch dfs, ConstantPool cop, ConstantPoolGen copg) {
		super(dfs);
		cp = cop;
		cpg = copg;
	}

	/**
	 * Returns true if the fact represents a value which is not TOP (I know
	 * nothing) or BOTTOM (error occured).
	 * 
	 */
	@Override
	public boolean isFactValid(AtomFact fact) {
		return !(fact.isTop() || fact.isBottom());
	}

	/**
	 * Key method for analysis. For each instruction in the given basic block
	 * this method is called. It represents the point where the instruction can
	 * change the fact. (Implements the LocalGen and LocalKill functions.)
	 * 
	 */
	@Override
	public void transferInstruction(InstructionHandle handle,
			BasicBlock basicBlock, AtomFact fact)
			throws DataflowAnalysisException {
		// only valid fact are useful to change
		if (!isFactValid(fact)) {
			return;
		}

		// get the instruction
		short opcode = handle.getInstruction().getOpcode();
		// process invokestatic instruction
		if (opcode == Constants.INVOKESTATIC) {
			processInvokeStatic(handle, fact);

		}

		// if some error happens
		// if (fact.getVLA() < 0) {
		// fact.setAsBottom();
		// }
	}

	/**
	 * Copy the content of the fact from the source fact to the destination
	 * fact.
	 * 
	 */
	public void copy(AtomFact source, AtomFact dest) {
		dest.setVLA(source.getVLAcopy());
		dest.setBottom(source.isBottom());
		dest.setTop(source.isTop());
	}

	/**
	 * Create a new fact. This is the only way how all the facts are made. Some
	 * will be initialized by setAsTop, initEntryFact or copy.
	 * 
	 */
	public AtomFact createFact() {
		return new AtomFact(new HashMap<String, HashSet<Access>>());
	}

	/**
	 * Initiate the fact to the fact which should hold at the start of CFG.
	 * 
	 */
	public void initEntryFact(AtomFact result) throws DataflowAnalysisException {
		result.setVLA(new HashMap<String, HashSet<Access>>());
		result.setTop(false);
		result.setBottom(false);
	}

	/**
	 * Returns true if the given fact is TOP.
	 * 
	 */
	public boolean isTop(AtomFact fact) {
		return fact.isTop();
	}

	/**
	 * Make the fact as TOP - means that at this point we know nothing about the
	 * location where this fact takes effect.
	 */
	public void makeFactTop(AtomFact fact) {
		fact.setTop(true);
	}

	/**
	 * Key method which takes care of joining facts. It takes a fact which is
	 * true at the end of previous basic block and allows to change the result
	 * fact with respect to edge type.
	 * 
	 */
	public void meetInto(AtomFact fact, Edge edge, AtomFact result)
			throws DataflowAnalysisException {
		// if preceded fact is TOP - there is nothing to distribute
		// if descendant fact is BOTTOM - there is an error and can not be used
		if (fact.isTop() || result.isBottom()) {
			return;
		}

		// if preceded fact is BOTTOM - error information has to be distributed
		// if descendant fact is TOP - must be updated
		if (fact.isBottom() || result.isTop()) {
			copy(fact, result);
			return;
		}
		// there is a problem the descendant fact has to be set to BOTTOM
		// result.setBottom(true);

		// otherwise propagate the fact
		result.joinVLAs(fact.getVLAcopy());
	}

	/**
	 * Returns true if the given facts are the same with respect to analysis
	 * purpose.
	 */
	public boolean same(AtomFact fact1, AtomFact fact2) {

		if (fact1.isTop() != fact2.isTop())
			return false;
		if (fact1.isBottom() != fact2.isBottom())
			return false;
			
		HashMap<String, HashSet<Access>> vla1 = fact1.getVLAcopy();
		HashMap<String, HashSet<Access>> vla2 = fact2.getVLAcopy();
		HashSet<Access> la1, la2;
		
		if (vla1.size() != vla2.size())
			return false;
		// compare entry by entry
		for (String s : vla1.keySet()) {
			if (vla2.containsKey(s)) {
				la1 = vla1.get(s);
				la2 = vla2.get(s);
				if (la1.size() != la2.size())
					return false;
				if (!la1.containsAll(la2))
					return false;
			} else {
				return false;
			}
		}

		return true;
	}

	/**
	 * Returns human readable representation of the fact.
	 */
	@Override
	public String factToString(AtomFact fact) {
		AtomFact af = (AtomFact) fact;
		if (fact.isTop())
			return "TOP";
		if (fact.isBottom())
			return "BOTTOM";

		return af.toString();
	}

	/**
	 * Method that takes care of dealing with INVOKESTATIC instructions. It
	 * looks for ConTest method calls and process them.
	 * 
	 */
	private void processInvokeStatic(InstructionHandle handle, AtomFact fact) {

		CPInstruction ins = (CPInstruction) handle.getInstruction();
		ConstantMethodref cmr = (ConstantMethodref) cp.getConstant(ins
				.getIndex());

		// get target class of invokestatic
		ConstantClass cc = (ConstantClass) cp.getConstant(cmr.getClassIndex());
		ConstantUtf8 csm = (ConstantUtf8) cp.getConstant(cc.getNameIndex());
		String className = (String) csm.getBytes();

		// only ConTest methods are interesting for us
		if (!className.equals("com/ibm/contest/runtimecore/Manager"))
			return;

		// get target method of invokestatic
		ConstantNameAndType cnat = (ConstantNameAndType) cp.getConstant(cmr
				.getNameAndTypeIndex());
		ConstantUtf8 cst = (ConstantUtf8) cp.getConstant(cnat.getNameIndex());
		String contestMethod = (String) cst.getBytes();

		CTVarInfo ctmi = CTMethods.processVarConTestMethod(contestMethod, handle,
				cp, cpg);
		if (ctmi != null) {
			fact.addVLA(ctmi.varName, ctmi.access);
		}
	}
}
