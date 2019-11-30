package cz.vutbr.fit.findbugs.atom.analysis;

import org.apache.bcel.classfile.Method;

import edu.umd.cs.findbugs.ba.CFG;
import edu.umd.cs.findbugs.ba.DepthFirstSearch;
import edu.umd.cs.findbugs.classfile.CheckedAnalysisException;
import edu.umd.cs.findbugs.classfile.IAnalysisCache;
import edu.umd.cs.findbugs.classfile.IMethodAnalysisEngine;
import edu.umd.cs.findbugs.classfile.MethodDescriptor;

import org.apache.bcel.generic.ConstantPoolGen;
/**
 * Implements important interface methods which are used for communication with
 * the analysis.
 * 
 * @author zdenek
 * 
 */
public class AtomDataflowEngine implements IMethodAnalysisEngine<AtomDataflow> {

	/**
	 * Method which is called in order to get dataflow analysis results for a
	 * given method. The analysisCache is used for storing facts.
	 */
	public AtomDataflow analyze(IAnalysisCache analysisCache,
			MethodDescriptor descriptor) throws CheckedAnalysisException {
		// get needed information
		CFG cfg = analysisCache.getMethodAnalysis(CFG.class, descriptor);
		DepthFirstSearch dfs = analysisCache.getMethodAnalysis(
				DepthFirstSearch.class, descriptor);
		Method method = analysisCache.getMethodAnalysis(Method.class,
				descriptor);
		ConstantPoolGen cpg = analysisCache.getClassAnalysis(ConstantPoolGen.class, descriptor.getClassDescriptor());

		// create analysis
		AtomAnalysis analysis = new AtomAnalysis(dfs, method.getConstantPool(), cpg);
		// make analysis dataflow
		AtomDataflow dataflow = new AtomDataflow(cfg, analysis);

		// do a dataflow
		dataflow.execute();

		return dataflow;
	}

	/**
	 * Registers the analysis to analysisCache.
	 */
	public void registerWith(IAnalysisCache analysisCache) {
		analysisCache.registerMethodAnalysisEngine(AtomDataflow.class, this);
	}

	/**
	 * Returns information if the facts can be later recomputed.
	 * @return Can be recomputed
	 */
	public boolean canRecompute() {
		return true;
	}

}
