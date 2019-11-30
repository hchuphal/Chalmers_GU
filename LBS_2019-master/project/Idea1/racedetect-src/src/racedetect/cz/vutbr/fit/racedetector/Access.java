package cz.vutbr.fit.racedetector;


/**
 * This class represents one access of a program. The access is defined by
 * ConTest like program location and access flag (read or write).
 * 
 * @author zdenek
 * 
 */
/*
 * SYNCHRONIZATION - inner state is given by: progLoc, mode
 * 
 * immutable class - therefore thread-safe
 */
public class Access {

	/**
	 * Program location on which this access occurs.
	 */
	public final String progLoc;
	/**
	 * Type of this access (read/write/...).
	 */
	public final RaceDetector.Operation mode;

	/**
	 * Constructor.
	 * 
	 * @param loc
	 * @param mod
	 */
	public Access(String loc, RaceDetector.Operation mod) {
		progLoc = loc.intern();
		mode = mod;
	}


	/**
	 * Returns true if the given object is of type Access and program locations
	 * are the same. (modes are not compared because the program location should
	 * be unique with respect to operation)
	 */
	@Override
	public boolean equals(Object ac) {
		if (ac == null || ac.getClass() != ac.getClass())
			return false;
		return progLoc == ((Access) ac).progLoc;
	}

	/**
	 * Returns hashCode of this Object which is actually the hash code of the
	 * program location.
	 */
	@Override
	public int hashCode() {
		return progLoc.hashCode();
	}
	
	/**
	 * Returns the text representation of this access.
	 */
	@Override
	public String toString(){
		return progLoc + "(" + mode + ")";
	}
}
