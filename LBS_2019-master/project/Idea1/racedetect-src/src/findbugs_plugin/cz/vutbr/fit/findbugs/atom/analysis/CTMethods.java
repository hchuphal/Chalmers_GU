package cz.vutbr.fit.findbugs.atom.analysis;

import org.apache.bcel.classfile.ConstantString;
import org.apache.bcel.generic.CPInstruction;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.classfile.ConstantPool;
import edu.umd.cs.findbugs.ba.Hierarchy;
import edu.umd.cs.findbugs.ba.XField;

import org.apache.bcel.generic.*;

import cz.vutbr.fit.racedetector.RaceDetector.Operation;

/**
 * This class provides static operation which makes available parameters of
 * ConTest methods.
 * 
 * @author zdenek
 * 
 */
public class CTMethods {
	private static final boolean DEBUG = false;

	/**
	 * The method takes a handle of the INVOKESTATIC instruction which was
	 * identifiead as call to ConTest. Then according to the type of the method
	 * takes its parameteres from the given constatnt pool and encapsulate them
	 * with CTMethodInfo object - which can be then used to access the parameters.
	 * 
	 * @see CTVarInfo
	 * 
	 * 
	 */
	public static CTVarInfo processVarConTestMethod(String contestMethod,
			InstructionHandle handle, ConstantPool cp, ConstantPoolGen cpg) {
		String varName = null;
		String progLocation = null;
		Operation operation = null;
		
		/***********************************************************************
		 * CONTEST METHODS
		 */
		if ((contestMethod.equals("methodEntry"))
				|| (contestMethod.equals("methodExit"))
				|| (contestMethod.equals("basicBlockEntry")))
			return null;

		if (DEBUG)
			System.out.println(contestMethod + ":");
		
		if (contestMethod.equals("beforeStaticRead")) {
			// beforeStaticRead(
			// java.lang.String varName,
			// java.lang.String programLocation,
			// java.lang.String varType)
			if (DEBUG) {
				System.out.println(" XX Variable: '"
						+ getConTestParameter(cp, handle, 3) + "'");
				System.out.println(" XX ProgramLocation: '"
						+ getConTestParameter(cp, handle, 2) + "'");
				System.out.println(" XX FinalOrVolatile:" + isFieldFinalOrVolatile(cpg, handle, 1)+ "\n");
			}
			
			if (isFieldFinalOrVolatile(cpg, handle, 1))
				return null;

			varName = getConTestParameter(cp, handle, 3);
			progLocation = getConTestParameter(cp, handle, 2);
			operation = Operation.READ;
		}
		if ((contestMethod.equals("beforeStaticWrite_boolean"))
				|| (contestMethod.equals("beforeStaticWrite_byte"))
				|| (contestMethod.equals("beforeStaticWrite_char"))
				|| (contestMethod.equals("beforeStaticWrite_double"))
				|| (contestMethod.equals("beforeStaticWrite_float"))
				|| (contestMethod.equals("beforeStaticWrite_int"))
				|| (contestMethod.equals("beforeStaticWrite_long"))
				|| (contestMethod.equals("beforeStaticWrite_short"))) {
			// beforeStaticWrite_XXX(
			// XXX value,
			// java.lang.String varName,
			// java.lang.String programLocation)
			if (DEBUG) {
				System.out.println(" XX Variable: '"
						+ getConTestParameter(cp, handle, 2) + "'");
				System.out.println(" XX ProgramLocation: '"
						+ getConTestParameter(cp, handle, 1) + "'");
				System.out.println(" XX FinalOrVolatile:" + isFieldFinalOrVolatile(cpg, handle, 1)+ "\n");
			}

			if (isFieldFinalOrVolatile(cpg, handle, 1))
				return null;

			varName = getConTestParameter(cp, handle, 2);
			progLocation = getConTestParameter(cp, handle, 1);
			operation = Operation.WRITE;

		}
		if (contestMethod.equals("beforeStaticWrite_ref")) {
			// beforeStaticWrite_ref(
			// java.lang.Object value,
			// java.lang.String varName,
			// java.lang.String programLocation,
			// java.lang.String varType)
			if (DEBUG) {
				System.out.println(" XX Variable: '"
						+ getConTestParameter(cp, handle, 3) + "'");
				System.out.println(" XX ProgramLocation: '"
						+ getConTestParameter(cp, handle, 2) + "'");
				System.out.println(" XX FinalOrVolatile:" + isFieldFinalOrVolatile(cpg, handle, 2) + "\n");
			}

			if (isFieldFinalOrVolatile(cpg, handle, 2))
				return null;

			varName = getConTestParameter(cp, handle, 3);
			progLocation = getConTestParameter(cp, handle, 2);
			operation = Operation.WRITE;
		}
		if (contestMethod.equals("beforeInstanceRead")) {
			// beforeInstanceRead(
			// java.lang.Object instance,
			// java.lang.String varName,
			// java.lang.String varType,
			// java.lang.String programLocation)
			if (DEBUG) {
				System.out.println(" XX Variable: '"
						+ getConTestParameter(cp, handle, 3) + "'");
				System.out.println(" XX ProgramLocation: '"
						+ getConTestParameter(cp, handle, 1) + "'");
				System.out.println(" XX FinalOrVolatile:" + isFieldFinalOrVolatile(cpg, handle, 3)+ "\n");
			}

			if (isFieldFinalOrVolatile(cpg, handle, 3))
				return null;

			varName = getConTestParameter(cp, handle, 3);
			progLocation = getConTestParameter(cp, handle, 1);
			operation = Operation.READ;
		}
		if ((contestMethod.equals("beforeInstanceWrite_boolean"))
				|| (contestMethod.equals("beforeInstanceWrite_byte"))
				|| (contestMethod.equals("beforeInstanceWrite_char"))
				|| (contestMethod.equals("beforeInstanceWrite_double"))
				|| (contestMethod.equals("beforeInstanceWrite_float"))
				|| (contestMethod.equals("beforeInstanceWrite_int"))
				|| (contestMethod.equals("beforeInstanceWrite_long"))
				|| (contestMethod.equals("beforeInstanceWrite_short"))) {
			// beforeInstanceWrite_XXX(
			// java.lang.Object instance,
			// XXX value,
			// java.lang.String programLocation,
			// java.lang.String varName)
			if (DEBUG) {
				System.out.println(" XX Variable: '"
						+ getConTestParameter(cp, handle, 1) + "'");
				System.out.println(" XX ProgramLocation: '"
						+ getConTestParameter(cp, handle, 2) + "'");
				System.out.println(" XX FinalOrVolatile:" + isFieldFinalOrVolatile(cpg, handle, 4)+ "\n");
			}

			if (isFieldFinalOrVolatile(cpg, handle, 4))
				return null;

			varName = getConTestParameter(cp, handle, 1);
			progLocation = getConTestParameter(cp, handle, 2);
			operation = Operation.WRITE;
		}
		if (contestMethod.equals("beforeInstanceWrite_ref")) {
			// beforeInstanceWrite_ref(
			// java.lang.Object instance,
			// java.lang.Object value,
			// java.lang.String programLocation,
			// java.lang.String varName,
			// java.lang.String varType)
			if (DEBUG) {
				System.out.println(" XX Variable: '"
						+ getConTestParameter(cp, handle, 2) + "'");
				System.out.println(" XX ProgramLocation: '"
						+ getConTestParameter(cp, handle, 3) + "'");
				System.out.println(" XX FinalOrVolatile:" + isFieldFinalOrVolatile(cpg, handle, 4)+ "\n");
			}

			if (isFieldFinalOrVolatile(cpg, handle, 4))
				return null;

			varName = getConTestParameter(cp, handle, 2);
			progLocation = getConTestParameter(cp, handle, 3);
			operation = Operation.WRITE;

		}
		if (contestMethod.equals("beforeArrayCellRead")) {
			// beforeArrayCellRead(
			// java.lang.Object arrayRef,
			// int index,
			// java.lang.String programLocation)
			/* DO NOT USE */
			return null;
			/*
			if (DEBUG) {
				System.out.println(" XX Variable: Array");
				System.out.println(" XX ProgramLocation: '"
						+ getConTestParameter(cp, handle, 1) + "'\n");
			}
			varName = "Array";
			progLocation = getConTestParameter(cp, handle, 1);
			operation = Operation.READ;
			*/
		}
		if ((contestMethod.equals("beforeArrayCellWrite_byte"))
				|| (contestMethod.equals("beforeArrayCellWrite_char"))
				|| (contestMethod.equals("beforeArrayCellWrite_double"))
				|| (contestMethod.equals("beforeArrayCellWrite_float"))
				|| (contestMethod.equals("beforeArrayCellWrite_int"))
				|| (contestMethod.equals("beforeArrayCellWrite_long"))
				|| (contestMethod.equals("beforeArrayCellWrite_ref"))
				|| (contestMethod.equals("beforeArrayCellWrite_short"))) {
			// beforeArrayCellWrite_XXX(
			// java.lang.Object arrayRef,
			// int index,
			// java.lang.String programLocation,
			// XXX value)
			/* DO NOT USE */
			return null;
			/*
			if (DEBUG) {
				System.out.println(" XX Variable: Array");
				System.out.println(" XX ProgramLocation: '"
						+ getConTestParameter(cp, handle, 2) + "'\n");
			}
			varName = "Array";
			progLocation = getConTestParameter(cp, handle, 2);
			operation = Operation.WRITE;
			 */
		}

		if (varName != null)
			return new CTVarInfo(varName, progLocation, operation);
		else
			return null;
	}

	
	public static String processExitMethod(String contestMethod,
			InstructionHandle handle, ConstantPool cp) {
		String progLocation = null;

		if (DEBUG)
			System.out.println(contestMethod + ":");

		/***********************************************************************
		 * CONTEST METHODS
		 */
		if (contestMethod.equals("methodExit")) {
			// methodExit(
			// java.lang.String programLocation,
			// TODO)
			if (DEBUG) {
				System.out.println(" XX ProgramLocation: '"
						+ CTMethods.getConTestParameter(cp, handle, 2) + "'\n");
			}
			progLocation = CTMethods.getConTestParameter(cp, handle, 2);
			
			return progLocation;
		}
		
		return null;
	}
	
	/**
	 * Returns the String loaded by LDC at 'index' instructions before the
	 * invoking of ConTestMethod. (for example index=1 -> the last parameter of
	 * the function, index=2 -> the parameter before the last, etc.) Otherwise
	 * returns null.
	 * 
	 * @param ins
	 * @param index
	 * @return
	 */
	private static String getConTestParameter(ConstantPool cp,
			InstructionHandle ins, int index) {

		InstructionHandle ih;
		try {
			ih = ins;
			for (int i = 0; i < index; i++) {
				ih = ih.getPrev();
			}
			CPInstruction cpins = (CPInstruction) ih.getInstruction();
			ConstantString c = (ConstantString) cp
					.getConstant(cpins.getIndex());
			return c.getConstantValue(cp).toString();

		} catch (Exception e) {
			return null;
		}

	}

	private static boolean isFieldFinalOrVolatile(ConstantPoolGen cpg, InstructionHandle ins, int index){
		InstructionHandle ih;
		try{
			ih = ins;
			for (int i = 0; i < index; i++) {
				ih = ih.getNext();
			}
			FieldInstruction fins = (FieldInstruction) ih.getInstruction();
			XField xf = null;
			try{
				xf = Hierarchy.findXField(fins, cpg);
			} catch (ClassNotFoundException cnfe){
				if (DEBUG)
					System.out.println(" OOOOO- ClassNotFoundException");
				return false;
			}
			if (xf != null){
				if (xf.isVolatile())
					return true;
				if (xf.isFinal())
					return true;
			}
			else if (DEBUG)
				System.out.println(" OOOOO- ClassNotFoundException");

		} catch (Exception e) {
			if (DEBUG)
				System.out.println(" OOOOO- Exception" + e);
			return false;
		}
		return false;
	}
}
