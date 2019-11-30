package cz.vutbr.fit.racedetector;

import com.ibm.contest.runtime.*;
import com.ibm.contest.utils.Miscellaneous;
import com.ibm.contest.utils.ObjectEnumerator;

import cz.vutbr.fit.racedetector.RaceDetector.Operation;

public class Eraser implements ThreadBeginListener, ThreadEndListener,
		BeforeVarReadListener, BeforeVarWriteListener,
		BeforeArrayCellReadListener, BeforeArrayCellWriteListener,
		BeforeMonitorEnterListener, AfterMonitorExitListener,
		AfterJoinListener, AfterVarReadListener, AfterVarWriteListener,
		AfterArrayCellReadListener, AfterArrayCellWriteListener {

	/*
	 * --- DEBUG OPTIONS ----------------------------------------
	 */
	/*
	 * debug mode
	 */
	private static final boolean DEBUG = false;

	/* debug listeners - which are called and when - DEBUG must be set */
	private static final boolean DEBUG_LISTENERS = true;

	/*
	 * ----------------------------------------------------------
	 */
	/**
	 * Reference to the code performing detection.
	 */
	EraserDetect detector;
	/**
	 * Reference to the main class enclosing
	 */
	RaceDetector raceDetect;

	/*
	 * ----------------------------------------------------------
	 */

	/*
	 * ----------------------------------------------------------------------------------
	 * CONSTRUCTOR
	 * ----------------------------------------------------------------------------------
	 * 
	 */
	public Eraser() {
		detector = new EraserDetect();
		raceDetect = new RaceDetector(
				RaceDetector.DetectorImplementation.ERASER, detector);
	}

	/*
	 * ----------------------------------------------------------------------------------
	 * MONITOR related operations.
	 * ----------------------------------------------------------------------------------
	 * 
	 */

	/**
	 * When synchronization lock is achieved by thread - update sets of locks.
	 * 
	 */
	public void beforeMonitorEnterEvent(String programLocation, Object lock) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: beforeMonitorEnterEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.monitorEnterEvent(programLocation, ObjectEnumerator
				.getNumber(lock));
	}

	/**
	 * When synchronization lock is released by thread - update sets of locks.
	 * 
	 */
	public void afterMonitorExitEvent(String programLocation, Object lock) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: beforeMonitorExitEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.monitorExitEvent(programLocation, ObjectEnumerator
				.getNumber(lock));
	}

	/*
	 * ----------------------------------------------------------------------------------
	 * THREAD BEGIN END OPERATIONS
	 * ----------------------------------------------------------------------------------
	 * 
	 */

	/**
	 * When new Thread has started.
	 * 
	 */
	public void threadBeginEvent(String programLocation) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: threadBeginEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.threadBeginEvent(programLocation);
	}

	/**
	 * When Thread has terminated.
	 * 
	 */
	public void threadEndEvent() {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: threadEndEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   ");

		detector.threadEndEvent();
	}

	/*
	 * ----------------------------------------------------------------------------------
	 * JOIN SYNCHRONIZATION EVENT
	 * ----------------------------------------------------------------------------------
	 * 
	 */
	public void afterJoinEvent(String programLocation, Thread target,
			long timeout, int nanos, Exception e) {

		if (e != null) {
			if (DEBUG && DEBUG_LISTENERS)
				RaceDetector.printDebug(" Listener: afterJoinEvent "
						+ Miscellaneous.getThreadString(Thread.currentThread())
						+ " UNSUCCESSFUL\n   ");

		} else {
			if (DEBUG && DEBUG_LISTENERS)
				RaceDetector.printDebug(" Listener: afterJoinEvent "
						+ Miscellaneous.getThreadString(Thread.currentThread())
						+ " \n   ");

			detector.threadJoinEvent(programLocation, target);

		}
	}

	/*
	 * ----------------------------------------------------------------------------------
	 * BEFORE READ EVENT OPERATIONS
	 * ----------------------------------------------------------------------------------
	 * 
	 */
	public void beforeVarReadEvent(String programLocation, String varName,
			Object instance, String varType) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: beforeVarReadEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.beforeAccessEvent(programLocation, varName, instance,
				Operation.READ);

	}

	public void beforeArrayCellReadEvent(String programLocation,
			Object arrayRef, int index) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: beforeArrayCellReadEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.beforeAccessEvent(programLocation, String.format("[%1$d]",
				index), arrayRef, Operation.READ);
	}

	/*
	 * ----------------------------------------------------------------------------------
	 * AFTER READ EVENT OPERATIONS
	 * ----------------------------------------------------------------------------------
	 * 
	 */

	public void afterBooleanVarReadEvent(String programLocation,
			String varName, Object instance, boolean value) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: afterBooleanVarReadEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.afterAccessEvent(programLocation);

	}

	public void afterDoubleVarReadEvent(String programLocation, String varName,
			Object instance, double value) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: afterDoubleVarReadEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.afterAccessEvent(programLocation);

	}

	public void afterFloatVarReadEvent(String programLocation, String varName,
			Object instance, float value) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: afterFloatVarReadEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.afterAccessEvent(programLocation);

	}

	public void afterIntegralVarReadEvent(String programLocation,
			String varName, Object instance, long value, int varType) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: afterIntegralVarReadEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.afterAccessEvent(programLocation);

	}

	public void afterRefVarReadEvent(String programLocation, String varName,
			Object instance, Object value, String varType) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: afterRefVarReadEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.afterAccessEvent(programLocation);

		/*
		 * this method takes care about right naming of the arrays
		 */
		RaceDetector.updateArrayInfo(instance, value, varName);

	}

	/*
	 * ----------------------------------------------------------------------------------
	 * BEFORE WRITE EVENT OPERATIONS
	 * ----------------------------------------------------------------------------------
	 * 
	 */

	public void beforeBooleanVarWriteEvent(String programLocation,
			String varName, Object instance, boolean value) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: beforeBooleanVarWriteEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.beforeAccessEvent(programLocation, varName, instance,
				Operation.WRITE);

	}

	public void beforeDoubleVarWriteEvent(String programLocation,
			String varName, Object instance, double value) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: beforeDoubleVarWriteEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.beforeAccessEvent(programLocation, varName, instance,
				Operation.WRITE);

	}

	public void beforeFloatVarWriteEvent(String programLocation,
			String varName, Object instance, float value) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: beforeFloatVarWriteEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.beforeAccessEvent(programLocation, varName, instance,
				Operation.WRITE);

	}

	public void beforeIntegralVarWriteEvent(String programLocation,
			String varName, Object instance, long value, int varType) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: beforeIntegralVarWriteEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.beforeAccessEvent(programLocation, varName, instance,
				Operation.WRITE);

	}

	public void beforeRefVarWriteEvent(String programLocation, String varName,
			Object instance, Object value, String varType) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: beforeRefVarWriteEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.beforeAccessEvent(programLocation, varName, instance,
				Operation.WRITE);

	}

	public void beforeDoubleArrayCellWriteEvent(String programLocation,
			Object arrayRef, int index, double value) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector
					.printDebug(" Listener: beforeDoubleArrayCellWriteEvent "
							+ Miscellaneous.getThreadString(Thread
									.currentThread()) + " \n   "
							+ programLocation);

		detector.beforeAccessEvent(programLocation, String.format("[%1$d]",
				index), arrayRef, Operation.WRITE);

	}

	public void beforeFloatArrayCellWriteEvent(String programLocation,
			Object arrayRef, int index, float value) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector
					.printDebug(" Listener: beforeFloatArrayCellWriteEvent "
							+ Miscellaneous.getThreadString(Thread
									.currentThread()) + " \n   "
							+ programLocation);

		detector.beforeAccessEvent(programLocation, String.format("[%1$d]",
				index), arrayRef, Operation.WRITE);

	}

	public void beforeIntegralArrayCellWriteEvent(String programLocation,
			Object arrayRef, int type, int index, long value) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector
					.printDebug(" Listener: beforeIntegralArrayCellWriteEvent "
							+ Miscellaneous.getThreadString(Thread
									.currentThread()) + " \n   "
							+ programLocation);

		detector.beforeAccessEvent(programLocation, String.format("[%1$d]",
				index), arrayRef, Operation.WRITE);

	}

	public void beforeRefArrayCellWriteEvent(String programLocation,
			Object arrayRef, int index, Object value) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: beforeRefArrayCellWriteEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.beforeAccessEvent(programLocation, String.format("[%1$d]",
				index), arrayRef, Operation.WRITE);

	}

	public void afterDoubleArrayCellReadEvent(String programLocation,
			Object arrayRef, int index, double value) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: afterDoubleArrayCellReadEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.afterAccessEvent(programLocation);

	}

	public void afterFloatArrayCellReadEvent(String programLocation,
			Object arrayRef, int index, float value) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: afterFloatArrayCellReadEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.afterAccessEvent(programLocation);

	}

	public void afterIntegralArrayCellReadEvent(String programLocation,
			Object arrayRef, int type, int index, long value) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector
					.printDebug(" Listener: afterIntegralArrayCellReadEvent "
							+ Miscellaneous.getThreadString(Thread
									.currentThread()) + " \n   "
							+ programLocation);

		detector.afterAccessEvent(programLocation);

	}

	public void afterRefArrayCellReadEvent(String programLocation,
			Object arrayRef, int index, Object value) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: afterRefArrayCellReadEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.afterAccessEvent(programLocation);

		/*
		 * this method takes care about right naming of the arrays
		 */
		RaceDetector.updateArrayInfo(arrayRef, value, index);

	}

	/*
	 * ----------------------------------------------------------------------------------
	 * AFTER WRITE EVENT OPERATIONS
	 * ----------------------------------------------------------------------------------
	 * 
	 */
	public void afterBooleanVarWriteEvent(String programLocation,
			String varName, Object instance, boolean value) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: afterBooleanVarWriteEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.afterAccessEvent(programLocation);

	}

	public void afterDoubleVarWriteEvent(String programLocation,
			String varName, Object instance, double value) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: afterDoubleVarWriteEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.afterAccessEvent(programLocation);

	}

	public void afterFloatVarWriteEvent(String programLocation, String varName,
			Object instance, float value) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: afterFloatVarWriteEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.afterAccessEvent(programLocation);

	}

	public void afterIntegralVarWriteEvent(String programLocation,
			String varName, Object instance, long value, int varType) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: afterIntegralVarWriteEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.afterAccessEvent(programLocation);

	}

	public void afterRefVarWriteEvent(String programLocation, String varName,
			Object instance, Object value, String varType) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: afterRefVarWriteEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.afterAccessEvent(programLocation);

	}

	public void afterDoubleArrayCellWriteEvent(String programLocation,
			Object arrayRef, int index, double value) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector
					.printDebug(" Listener: afterDoubleArrayCellWriteEvent "
							+ Miscellaneous.getThreadString(Thread
									.currentThread()) + " \n   "
							+ programLocation);

		detector.afterAccessEvent(programLocation);

	}

	public void afterFloatArrayCellWriteEvent(String programLocation,
			Object arrayRef, int index, float value) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: afterFloatArrayCellWriteEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.afterAccessEvent(programLocation);

	}

	public void afterIntegralArrayCellWriteEvent(String programLocation,
			Object arrayRef, int type, int index, long value) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector
					.printDebug(" Listener: afterIntegralArrayCellWriteEvent "
							+ Miscellaneous.getThreadString(Thread
									.currentThread()) + " \n   "
							+ programLocation);

		detector.afterAccessEvent(programLocation);

	}

	public void afterRefArrayCellWriteEvent(String programLocation,
			Object arrayRef, int index, Object value) {

		/* debug */
		if (DEBUG && DEBUG_LISTENERS)
			RaceDetector.printDebug(" Listener: afterRefArrayCellWriteEvent "
					+ Miscellaneous.getThreadString(Thread.currentThread())
					+ " \n   " + programLocation);

		detector.afterAccessEvent(programLocation);

	}

}
