package cz.vutbr.fit.racedetector;

import javolution.util.*;

/**
 * A structure used for maintaining important thread dependent information for
 * AtomRace. Mostly contains only cached temporary information.
 * 
 * 
 * @author zdenek
 * 
 */
public class ARThread extends RDThread {


	protected FastSet<ARVariable> curInside;

	
	ARThread(){
		curInside = new FastSet<ARVariable>();
	}
	
}
