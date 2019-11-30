package cz.vutbr.fit.racedetector;

import javolution.util.*;
import java.util.*;
import java.io.*;

/**
 * A set of variable names which are given in the file and can be used by
 * RaceDetector in several cases. (a set of variables that should be ommited or
 * healed from the beginning).
 * 
 * @author zdenek
 * 
 */
/* SYNCHRONIZATION - NOT thread safe - adding of all VarNames must be done before accessing */
public class RDVarSet {

	public static final boolean DEBUG = false;
	
	/* a set of variables */
	private FastMap<String, Object> variables;

	/**
	 * constructor
	 */
	public RDVarSet() {
	}

	/**
	 * Loads a list of variable names from the given file. The format of the
	 * file is expected as follows:
	 * <ul>
	 * <li> Each variable on its own line.
	 * <li> class_name->variable_name
	 * </ul>
	 * 
	 * @param fd
	 * @return number of read records
	 */
	public int getVarSetFromFile(BufferedReader fd) {
		variables = new FastMap<String, Object>();
		variables.setKeyComparator(FastComparator.IDENTITY);

		if (fd == null)
			return -1;
		
		int count = 0;
		String str, varN;
		StringTokenizer st;

		try {
			while ((str = fd.readLine()) != null) {
				if (str.length() == 0)
					continue;
				st = new StringTokenizer(str, "->");
				// skip the instance name if present
				if (st.countTokens() == 2) 
					varN = st.nextToken();
				else{
					varN = st.nextToken();
					varN = varN.intern();
					variables.put(varN, null);
					count++;
					if (DEBUG)
						System.out.println(" added variable: " + varN);
				}
			}
		} catch (IOException e) {
			variables = null;
			return -1;
		}
		
		if (count == 0)
			variables = null;
		return count;
	}

	/**
	 * Returns true if the given variable description leads to the variable
	 * which is stored in this class. The canonical name of the class and
	 * variable name is used. Instance can be null in the case of static field.
	 * 
	 * @param varName
	 *
	 */
	public boolean isVarInSet(String varName) {
		if (variables == null)
			return false;
		varName = varName.intern();
		return (variables.containsKey(varName));
	}

}
