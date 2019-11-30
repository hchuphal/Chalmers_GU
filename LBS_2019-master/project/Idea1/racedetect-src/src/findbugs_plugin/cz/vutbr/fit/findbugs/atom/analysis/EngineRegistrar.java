package cz.vutbr.fit.findbugs.atom.analysis;

import edu.umd.cs.findbugs.classfile.IAnalysisCache;
import edu.umd.cs.findbugs.classfile.IAnalysisEngineRegistrar;

/**
 * Allows to register our analysis to FindBugs.
 * 
 * @author zdenek
 *
 */
public class EngineRegistrar implements IAnalysisEngineRegistrar {

	public void registerAnalysisEngines(IAnalysisCache analysisCache) {
		new AtomDataflowEngine().registerWith(analysisCache);
	}

}