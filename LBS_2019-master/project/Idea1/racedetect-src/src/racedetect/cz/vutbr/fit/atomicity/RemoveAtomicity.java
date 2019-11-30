package cz.vutbr.fit.atomicity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * This class implements a tool for removing violated atomicities from the set
 * of atomicities to be checked.
 * 
 * <p>
 * The first argument represents the XML file that should be modify and the
 * second arguments represents the file with the violated atomicities.
 * 
 * @author zdenek
 * 
 */
public class RemoveAtomicity {

	/**
	 * The main program. Opens and load both XML files, remove from the first
	 * atomicity collection all atomicities present also in the second and store
	 * the new atomicity to the first XML file.
	 * <p>
	 * The first argument represents the XML file that should be modify and the
	 * second arguments represents the file with the violated atomicities.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedReader br2 = null;
		BufferedWriter bw = null;
		AtomicityCollection atomicity = new AtomicityCollection();
		AtomicityCollection atomicityToRemove = new AtomicityCollection();

		if (args.length < 2) {
			System.err
					.println(" Remove all atomicities contain in 'file2' from atomicities contain in 'file1'.");
			System.err.println("  Usage: RemoveAtomicity file1 file2");
			System.err
					.println("   file1, file2 - must be XML files with atomicities.");
			System.exit(10);
		}

		// try to open the files
		/* open the file1 */
		try {
			FileReader fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
		} catch (Exception exc) {
			System.err.println(" Failed to open file: " + args[0]);
			System.exit(10);
		}

		if (!atomicity.restoreAtomicityFromFile(br)) {
			System.err.println(" Problem processing: " + args[0]);
		} else
			System.out.println(" Loaded "
					+ atomicity.getAtomicityCollectionSize()
					+ " atomicities from the file '" + args[0] + "'.");
		/* close the file */
		try {
			br.close();
		} catch (Exception exc) {
			System.err.println(" Failed to close file:" + args[0]);
		}

		/* open the file2 */
		try {
			FileReader fr = new FileReader(args[1]);
			br2 = new BufferedReader(fr);
		} catch (Exception exc) {
			System.err.println(" Failed to open file: " + args[1]);
			System.exit(10);
		}

		if (!atomicityToRemove.restoreAtomicityFromFile(br2)) {
			System.err.println(" Problem processing: " + args[1]);
		} else
			System.out.println(" Loaded "
					+ atomicityToRemove.getAtomicityCollectionSize()
					+ " atomicities from the file '" + args[1] + "'.");

		/* close the file */
		try {
			br2.close();
		} catch (Exception exc) {
			System.err.println(" Failed to close file:" + args[1]);
		}

		/* remove the atomicities */
		System.out.println(" Removing atomicities...");
		atomicity.removeAll(atomicityToRemove);

		/* store the new atomicity to file1 */
		/* create and open apropriate file */
		try {
			bw = new BufferedWriter(new FileWriter(args[0]));
			System.out.println(" Opened file: " + args[0]);
		} catch (Exception exc) {
			System.err.println(" Failed to open file:" + args[0]);
			System.exit(10);
		}

		atomicity.storeAtomicityToFile(bw, false);

		System.out.println(" Stored " + atomicity.getAtomicityCollectionSize()
				+ " atomicities to the file '" + args[0] + "'.");

		/* close the file */
		try {
			bw.close();
		} catch (Exception exc) {
			System.err.println(" Failed to close file:" + args[0]);
		}

	}
}
