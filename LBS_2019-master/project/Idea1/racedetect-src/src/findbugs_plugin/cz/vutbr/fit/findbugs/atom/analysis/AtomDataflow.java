package cz.vutbr.fit.findbugs.atom.analysis;

import edu.umd.cs.findbugs.ba.CFG;
import edu.umd.cs.findbugs.ba.Dataflow;

/**
 * Creating control flow analysis environment.
 * 
 * @author zdenek
 *
 */
public class AtomDataflow extends Dataflow<AtomFact, AtomAnalysis> {
	public AtomDataflow(CFG cfg, AtomAnalysis analysis) {
	    super(cfg, analysis);
    }
}
