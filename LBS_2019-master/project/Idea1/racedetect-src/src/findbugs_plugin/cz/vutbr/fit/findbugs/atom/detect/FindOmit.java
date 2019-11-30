package cz.vutbr.fit.findbugs.atom.detect;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Set;

import edu.umd.cs.findbugs.FieldAnnotation;
import edu.umd.cs.findbugs.BytecodeScanningDetector;
import edu.umd.cs.findbugs.BugReporter;

import org.apache.bcel.classfile.Field;




public class FindOmit extends BytecodeScanningDetector {

	Set<FieldAnnotation> volatileOrFinalFields = new HashSet<FieldAnnotation>();

	public FindOmit(BugReporter bugReporter) {

	}

	@Override
	public void visit(Field obj) {
		super.visit(obj);

		FieldAnnotation f = FieldAnnotation.fromVisitedField(this);

		int flags = obj.getAccessFlags();
		boolean volatileField = (flags & ACC_VOLATILE) != 0;
		boolean finalField = (flags & ACC_FINAL) != 0;
		if (volatileField || finalField) {
			volatileOrFinalFields.add(f);
		}
	}

	@Override
	public void sawOpcode(int seen) {
		// nothing
	}

	@Override
	public void report() {
		/** ************************************************************************** */
		BufferedWriter fd;
		//String dirName = TraceWriter.getContestDirectory().getParent()+ File.separator + "race_detector";
		//System.out.println(dirName);
		String dirName = "race_detector";
		/* if doesn't exist directory atomicity - make it */
		File dir = new File(dirName);
		if (!dir.exists()) {
			dir.mkdir();
		}

		String fName = dirName + File.separator + "omitvariables";

		/* create and open apropriate file */
		try {
			fd = new BufferedWriter(new FileWriter(fName));
		} catch (Exception exc) {
			System.err.println(" Failed to open file:" + fName);
			return;
		}

		/** ************************ */
		System.out.println(" Storing " + volatileOrFinalFields.size() + " variables to be omitted into the file: " + fName);
		try {
			for (FieldAnnotation f : volatileOrFinalFields)
				fd.write(String.format("%s.%s%n", f.getClassName(), f
						.getFieldName()));
		} catch (Exception exc) {
			System.err.println(" Failed to write to file:" + fName);
			return;
		}

		/* close the file */
		try {
			fd.close();
		} catch (Exception exc) {
			System.err.println(" Failed to close file:" + fName);
		}

	}

}
