package cz.vutbr.fit.findbugs.atom.analysis;

import java.util.*;

import cz.vutbr.fit.racedetector.Access;

/**
 * This class represents the fact (something what is true at the location) of
 * the dataflow analysis for finding atomicity.
 * 
 * @see AtomAnalysis
 * @author zdenek
 * 
 */
public class AtomFact {
	// TOP = I know nothing about the fact at this location (top of the lattice)
	private boolean isTop = false;
	// BOTTOM = The fact is not valid (e.g. error occured) (bottom of the
	// lattice)
	private boolean isBottom = false;
	
	/**
	 * Set of last accesses to the variables.
	 */
	private HashMap<String, HashSet<Access>> varLastAccess;

	/**
	 * Constructor.
	 * 
	 * @param vla
	 */
	public AtomFact(HashMap<String, HashSet<Access>> vla) {
		varLastAccess = vla;
	}

	/**
	 * Returns true if this fact represents TOP value - I know nothing about the
	 * fact at this location (top of the lattice).
	 * 
	 * 
	 */
	public boolean isTop() {
		return isTop;
	}

	/**
	 * Set the flag of TOP of this fact.
	 * 
	 * @param top
	 */
	public void setTop(boolean top) {
		this.isTop = top;
	}

	/**
	 * Returns true if this fact represents BOTTOM value - The fact is not valid
	 * (e.g. error occured) (bottom of the lattice).
	 * 
	 * 
	 */
	public boolean isBottom() {
		return isBottom;
	}

	/**
	 * Set the flag of BOTTOM of this fact.
	 * 
	 * @param bot
	 */
	public void setBottom(boolean bot) {
		this.isBottom = bot;
	}

	/**
	 * Add an information to the fact.
	 */
	public void addVLA(String var, Access access) {
		HashSet<Access> acc = varLastAccess.get(var);
		if (acc == null) {
			acc = new HashSet<Access>();
			acc.add(access);
			varLastAccess.put(var, acc);
		} else {
			/* if already exists - only update it */
			acc.clear();
			acc.add(access);
		}
	}

	/**
	 * Returns last variable access for the given variable or null.
	 */
	public HashSet<Access> getVLA(String var) {
		return varLastAccess.get(var);
	}

	/**
	 * Set the variables last access map. It joins the accesses of this fact
	 * with the accesses given as parameter. This operation is usefull when
	 * dealing with joining of two(or more) facts from different paths in CFG.
	 * 
	 * @param vla
	 */
	public void joinVLAs(HashMap<String, HashSet<Access>> vla) {
		HashSet<Access> accvla, acc;
		for (String key : vla.keySet()) {
			accvla = vla.get(key);
			acc = varLastAccess.get(key);
			if (acc == null) {
				acc = new HashSet<Access>(accvla);
				varLastAccess.put(key, acc);
			} else {
				acc.addAll(accvla);
			}
		}
	}

	/**
	 * Set the variables last access map.
	 * 
	 * @param vla
	 */
	public void setVLA(HashMap<String, HashSet<Access>> vla) {
		varLastAccess = vla;
	}

	/**
	 * Get the variables last access map carrying by this fact.
	 * 
	 * 
	 */
	public HashMap<String, HashSet<Access>> getVLAcopy() {
		HashMap<String, HashSet<Access>> vla = new HashMap<String, HashSet<Access>>();
		for (String key : varLastAccess.keySet()) {
			vla.put(key, new HashSet<Access>(varLastAccess.get(key)));
		}
		return vla;
	}

	/**
	 * Some human readable represenatation.
	 * 
	 */
	@Override
	public String toString() {
		String str = "\n";
		for (String key : varLastAccess.keySet())
			str += key + ":" + varLastAccess.get(key).toString() + "\n";
		return "Fact: " + str;

	}

}
