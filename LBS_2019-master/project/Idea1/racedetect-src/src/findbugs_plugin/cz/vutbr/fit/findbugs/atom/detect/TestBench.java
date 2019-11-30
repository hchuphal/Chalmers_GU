package cz.vutbr.fit.findbugs.atom.detect;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//import cz.vutbr.fit.findbugs.atom.detect.AtomCollection;
import cz.vutbr.fit.atomicity.AtomicityCollection;
import cz.vutbr.fit.racedetector.*;

/**
 * Just for debugging purposes...
 * 
 * @author zdenek
 *
 */
public class TestBench {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AtomCollection ac = new AtomCollection();
		AtomicityCollection atc;
		int i;

		for (i = 0; i < 5; i++)
			ac
					.add(
							new Access(
									"/home/zdenek/documents/diplomka/shadows/findbugs1/bytecode_pokusy/tmp Test1.java test1() 14 "
											+ i, RaceDetector.Operation.READ),
							new Access(
									"/home/zdenek/documents/diplomka/shadows/findbugs1/bytecode_pokusy/tmp Test1.java test1() 11 "
											+ i, RaceDetector.Operation.READ));

		// make double
		ac
				.add(
						new Access(
								"/home/zdenek/documents/diplomka/shadows/findbugs1/bytecode_pokusy/tmp Test1.java test1() 14 2",
								RaceDetector.Operation.READ),
						new Access(
								"/home/zdenek/documents/diplomka/shadows/findbugs1/bytecode_pokusy/tmp Test1.java test1() 9 1",
								RaceDetector.Operation.READ));
		// make multi
		ac
				.add(
						new Access(
								"/home/zdenek/documents/diplomka/shadows/findbugs1/bytecode_pokusy/tmp Test1.java test1() 14 3",
								RaceDetector.Operation.WRITE),
						new Access(
								"/home/zdenek/documents/diplomka/shadows/findbugs1/bytecode_pokusy/tmp Test1.java test1() 15 2",
								RaceDetector.Operation.EXIT));
		ac
				.add(
						new Access(
								"/home/zdenek/documents/diplomka/shadows/findbugs1/bytecode_pokusy/tmp Test1.java test1() 14 3",
								RaceDetector.Operation.WRITE),
						new Access(
								"/home/zdenek/documents/diplomka/shadows/findbugs1/bytecode_pokusy/tmp Test1.java test1() 16 2",
								RaceDetector.Operation.WRITE));

		atc = ac.getAtomicityCol();
		System.out.println("XXX" + atc.getDebugText());
		 
		/** ************************************************************************** */
		/* ulozeni do souboru */
		BufferedWriter fd;
		String dirName = "atomicity";
		/* if doesn't exist directory atomicity - make it */
		File dir = new File(dirName);
		if (!dir.exists()) {
			dir.mkdir();
		}

		String fName = dirName + File.separator + "atomicity.txt";

		/* create and open apropriate file */
		try {
			fd = new BufferedWriter(new FileWriter(fName));
			System.out.println(" Opened file: " + fName);
		} catch (Exception exc) {
			System.err.println(" Failed to open file:" + fName);
			return;
		}

		/** ************************ */
		atc.storeAtomicityToFile(fd, false);

		/* close the file */
		try {
			fd.close();
		} catch (Exception exc) {
			System.err.println(" Failed to close file:" + fName);
		}
		/** ******************************************************************* */

		atc = new AtomicityCollection();
		System.out.println("XXX" + atc.getDebugText());

		BufferedReader br;
		/* proceed only if the atomicity directory exists */
		if (dir.exists()) {
			System.out.println("Restoring atomicity from files...");

			/* open the file */
			try {
				FileReader fr = new FileReader(fName);
				br = new BufferedReader(fr);
			} catch (Exception exc) {
				System.err.println(" Failed to open file: " + fName);
				return;
			}

			atc.restoreAtomicityFromFile(br);

			/* close the file */
			try {
				fd.close();
			} catch (Exception exc) {
				System.err.println(" Failed to close file:" + fName);
			}
		}

		System.out.println("XXX" + atc.getDebugText());
		System.out.println("done");
	}

}
