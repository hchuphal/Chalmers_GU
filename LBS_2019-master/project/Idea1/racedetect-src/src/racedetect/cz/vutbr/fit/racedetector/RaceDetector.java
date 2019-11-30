package cz.vutbr.fit.racedetector;

import java.io.*;
import java.util.*;
import java.util.concurrent.locks.*;

import com.ibm.contest.runtime.*;
import com.ibm.contest.utils.*;
import com.ibm.contest.shared.*;

import cz.vutbr.fit.atomicity.*;

/**
 * The main class of the race detector. It takes care of initialization and
 * finalization phase of the detection and implements ConTest listeners. It
 * contains also some common global methods and fields which are used by other
 * classes.
 * 
 * <p>
 * See package description for more info.
 * 
 * @author zdenek
 * 
 */
public class RaceDetector {

	/*
	 * ----------------------------------------------------------
	 */
	/**
	 * A string denoting the current version. Used in information outputs and in
	 * Eclipse plug-in.
	 */
	public static final String VERSION = " RaceDetector for ConTest version: 1.9, FIT VUT Brno (2006-2008)";
	
	/**
	 * A lock which protects the variables controlling the RaceDetector.
	 */
	private static Object settingsLock = new Object();

	/*
	 * --- INPUT OUTPUT OPTIONS ---------------------------------------
	 */
	/** file from which the setting will be taken */
	public static final String PROPERTIES_FILE = "RDKingProperties";

	/** directory name with the race detector input files */
	public static final String RD_DIRECTORY = "race_detector";

	/** file from which the setting will be taken */
	public static final String ATOMICITY_FILE = "atomicity.xml";

	/** file from which the variables which should not be analysed are loaded */
	public static final String OMITVAR_FILE = "omitvariables";

	/**
	 * file from which the variables which should be healed immediately are
	 * loaded
	 */
	public static final String HEALVAR_FILE = "healvariables";

	/** file from which the variables which should be noised are loaded */
	public static final String NOISEVAR_FILE = "noisevariables";

	/** file from which the program location which should be noised are loaded */
	public static final String NOISELOC_FILE = "noiselocations";

	/*
	 * --- VARIABLE LISTS OPTIONS ---------------------------------
	 */
	/**
	 * Enable the usage of a list of variables that should not be analysed. The
	 * intention is to specify variables which produced false alarms in the
	 * previous executions. The alarms for this variables are not produced any
	 * more.
	 */
	static boolean OMIT_VARIABLES = false;

	/**
	 * Enable the usage of a list of variables that should be healed from the
	 * beginning. All the instances of variables names given in a file will be
	 * healed as the race has been already detected on them. In this case, the
	 * healing efficiency can be tested.
	 */
	static boolean HEAL_VARIABLES = false;

	/*
	 * --- NOISE OPTIONS ---------------------------------
	 */
	/**
	 * Enable the usage of noise injecting mechanism.
	 */
	static boolean NOISE = false;
	/**
	 * Enable the usage of random noise injecting mechanism. In such case, a
	 * noise will be inserted in the middle of randomly chosen section that
	 * should be atomic with the intention to increase the probability of race
	 * manifestation.
	 */
	static boolean NOISE_RANDOM = false;
	/**
	 * Enable the usage of a list of variablse that should be focused by noise
	 * injecting mechanism. In such case, a noise will be inserted in the middle
	 * of section that should be atomic with the intention to increase the
	 * probability of race manifestation.
	 */
	static boolean NOISE_VARIABLES = false;

	/**
	 * Enable the usage of a list of program locations that should be focused by
	 * noise injecting mechanism. In such case, a noise will be inserted in the
	 * middle of section that should be atomic with the intention to increase
	 * the probability of race manifestation.
	 */
	static boolean NOISE_PROGLOC = false;

	/**
	 * Frequency of noise injected by the RaceDetector in promile (0 - 1000).
	 */
	static int NOISE_FREQUENCY = 0;

	/*
	 * --- ERASER OPTIONS -----------------------------------------
	 */
	/**
	 * It is common that initialization and use of objects are logically
	 * separated. In such cases second owner should not be burnered with access
	 * checks. To allow this feature set this true. This feature can decrease
	 * the count of false alarms. In most cases it is save to have it enabled.
	 */
	static boolean OWNER_TRANSFER = true;

	/**
	 * Enable Lock determination feature. Algorithm tries to determine which
	 * lock should be locked and produces a suggestion to the programmer.
	 */
	static boolean LOCK_DETERMINE = true;

	/*
	 * --- ATOMRACE OPTIONS -----------------------------------------
	 */
	/**
	 * Turn AtomRace to work in the first "learning" phase. In this phase where
	 * AtomRace only identify atomicities which were broken during the execution
	 * and these save to the file and prepare for removing from the set of
	 * atomicities.
	 * <p>
	 * Otherwise it works in "detection" phase.
	 */
	static boolean ATOMRACE_LEARN = true;

	/**
	 * Turn AtomRace to try avoid even the first occurence of the race. The
	 * algorithm does not know at the time of suspected access if it can cause a
	 * race. Therefore it blocks the suspected access till the threads which are
	 * in the critical section does not leave it.
	 */
	static boolean ATOMRACE_IMMHEAL = false;

	/*
	 * --- ATOMICITY OPTIONS -----------------------------------------
	 */
	/**
	 * Turn on the atomicity. This causes that the atomicity xml will be loaded
	 * and prepared for use. Atomicity is enabled when healing or AtomRace is
	 * specified.
	 */
	static boolean ATOMICITY = false;

	/*
	 * --- HEALING OPTIONS ----------------------------------------
	 */
	/**
	 * Enable the healing feature. (ATOMICITY must be also enabled.)
	 * 
	 */
	static boolean HEALING = false;

	/**
	 * Methods of healing:
	 * <ul>
	 * <li>THREADS - Method based on the utilization of other processors (cores)
	 * in the system. <li>YELD - The method try to influence scheduler by
	 * calling <i>yield</i> before thread enters the critical section which
	 * should be executed atomicaly. Threfore the thread should receive a new
	 * full window which should be used for the problematic operation. <li>
	 * PRIORITY - Method that influences scheduler by the increasing the
	 * priority of the thread entering critical section to maximum and take it
	 * back when the thread leaves the section. <li>YELDPRIORITY - Method that
	 * influences scheduler by the increasing the priority of the thread
	 * entering critical section to maximum, call <i>yield</i> to receive full
	 * window from scheduler and take it back when the thread leaves the
	 * section. <li>YIELDTHREADS - Method based on the utilization of other
	 * processors (cores) in the system. It starts threads and call <i>yield</i>
	 * to enable them to start. <li>NEWMUTEX - Healing method which uses a new
	 * explicit lock to guard the variable. A lock si obtained every time the
	 * variable is accessed. The healing is based on the idea that lock is not
	 * released within the critical sections which should be done atomicaly <li>
	 * OTYIELD - Healing method that uses <i>yield</i> called on the threads
	 * trying to access the variable while another trhead is inside a critical
	 * section that should be executed atomicaly. <li>OTWAIT - Healing method
	 * that uses <i>wait</i> called on the threads trying to access the variable
	 * while another trhead is inside a critical section that should be executed
	 * atomicaly. <li>OTSTRONGYIELD - Healing method that simulates explicit
	 * locks without using java.util.concurrent.
	 * </ul>
	 */
	public enum HealingMethod {
		THREADS, YIELD, PRIORITY, YIELDPRIORITY, YIELDTHREADS, NEWMUTEX, SEMAPHORE, OTYIELD, OTWAIT, OTSTRONGYIELD
	}

	/**
	 * Method that is used to heal the Race. (HEALING and ATOMICITY must be
	 * enabled.)
	 * 
	 */
	public static HealingMethod HEALING_METHOD = HealingMethod.NEWMUTEX;

	/**
	 * Available implementations of race detecting algorithms.
	 * 
	 */
	public static enum DetectorImplementation {
		ERASER, ATOMRACE
	}

	/**
	 * Read operation.
	 */
	public static enum Operation {
		READ, WRITE, EXIT
	}

	/**
	 * Algorithm that will be used for race detecting.
	 */
	protected static DetectorImplementation DETECTOR;

	/**
	 * Instance of used detector.
	 */
	protected static Detector detector;

	/*
	 * ----------------------------------------------------------
	 */

	/* output file */
	private static LogProducer logProducer;

	/* structure to maintain atomicity related information */
	protected static final AtomicityCollection atomicity = new AtomicityCollection();

	/* structure to maintain information concerning array's names */
	private static final WeakIdentityHashMap arrays = new WeakIdentityHashMap(
			40);
	private static final ReentrantReadWriteLock arraysLock = new ReentrantReadWriteLock();

	/*
	 * --------------------------------------------------------------------------
	 * -------- Constructor and destructor.
	 * --------------------------------------
	 * --------------------------------------------
	 */

	/**
	 * Main constructor called by ConTest. Method open the log file and register
	 * java shutdown hook for the RaceDetector. It is able to execute things
	 * before the start of instrumented program and prepare hook for executing
	 * things at the end of instrumented program. Properties from
	 * <i>KingProperties</i> file is read and set accordingly.
	 * 
	 * 
	 */
	public RaceDetector(DetectorImplementation detectorType,
			Detector detectorInstance) {
		int count;

		DETECTOR = detectorType;
		detector = detectorInstance;

		VerbosePrinter
				.verbosePrint(
						VERSION,
						VerbosePrinter.INFORMATORY);

		/* get settings */
		synchronized (settingsLock) {
			/* set RD behaviour according to the KingProperties file */
			Properties setting = null;
			try {
				File kp = findFile(PROPERTIES_FILE);
				setting = new EnhancedProperties(kp, true);
				VerbosePrinter.verbosePrint("Found properties file at "
						+ kp.getAbsoluteFile().getParent(),
						VerbosePrinter.INFORMATORY);

			} catch (IOException e) {
				VerbosePrinter.verbosePrint(
						"Properties file not found, using default settings",
						VerbosePrinter.INFORMATORY);
				setting = new Properties();
			}

			if (!setInitSetting(setting)) {
				System.err
						.println(" RaceDetector - INITIALIZATION FAILED! EXITING...");
				System.exit(-1);
			}
		}

		/* if ATOMICITY is enabled - try to fill the structure */
		BufferedReader br = null;
		boolean problem = false;
		String file;
		String fileName = TraceWriter.getContestDirectory().getParent()
				+ File.separator + RD_DIRECTORY;
		/* if doesn't exist directory - end */
		File dir = new File(fileName);
		if (!dir.exists()) {
			// System.err.println(" Could not find directory: " + fileName);
			problem = true;
		} else {
			VerbosePrinter
					.verbosePrint("Found RaceDetector settings directory "
							+ dir.getAbsoluteFile(), VerbosePrinter.INFORMATORY);
		}

		if (ATOMICITY && !problem) {

			file = fileName + File.separator + ATOMICITY_FILE;
			/* proceed only if the atomicity directory exists */
			if ((new File(file).exists())) {
				VerbosePrinter.verbosePrint("Restoring atomicity from file "
						+ file, VerbosePrinter.INFORMATORY);
				/* open the file */
				try {
					FileReader fr = new FileReader(file);
					br = new BufferedReader(fr);
				} catch (Exception exc) {
					System.err.println(" Failed to open file: " + file);
					problem = true;
				}

				if (!atomicity.restoreAtomicityFromFile(br))
					problem = true;
				else
					VerbosePrinter.verbosePrint("  Loaded "
							+ atomicity.getKeySet().size() + " atomicities",
							VerbosePrinter.INFORMATORY);

				/* close the file */
				try {
					br.close();
				} catch (Exception exc) {
					// System.err.println(" Failed to close file:" + fileName);
				}
			} else {
				VerbosePrinter.verbosePrint(
						"File with atomicity does not found: " + file,
						VerbosePrinter.INFORMATORY);
			}
			/* if there was problem with loading atomicity */
			if (problem) {
				System.err
						.println(" A problem occured during load of atomicity.");
			}
		}

		/* VARIABLES NOT TO BE ANALYSED */
		/* if a list of variables are given try to fill the structure */
		if (OMIT_VARIABLES && !problem) {
			file = fileName + File.separator + OMITVAR_FILE;
			count = 0;
			if ((new File(file)).exists()) {
				VerbosePrinter.verbosePrint(
						"Reading variables to be omited from the file " + file,
						VerbosePrinter.INFORMATORY);
				/* open the file */
				try {
					FileReader fr = new FileReader(file);
					br = new BufferedReader(fr);
					count = RDVariableCollection.omitVariables
							.getVarSetFromFile(br);
					VerbosePrinter.verbosePrint("  Loaded " + count
							+ " variables", VerbosePrinter.INFORMATORY);
				} catch (Exception exc) {
					System.err.println(" Failed to open file: " + file);
					problem = true;
				}
			}
		}

		/* VARIABLES TO BE HEALED FROM THE BEGINNING */
		if (HEAL_VARIABLES && !problem) {
			count = 0;
			file = fileName + File.separator + HEALVAR_FILE;
			if ((new File(file)).exists()) {
				VerbosePrinter.verbosePrint(
						"Reading variables to be healed from the file " + file,
						VerbosePrinter.INFORMATORY);
				/* open the file */
				try {
					FileReader fr = new FileReader(file);
					br = new BufferedReader(fr);
					count = RDVariableCollection.healVariables
							.getVarSetFromFile(br);
					VerbosePrinter.verbosePrint("  Loaded " + count
							+ " variables", VerbosePrinter.INFORMATORY);
				} catch (Exception exc) {
					System.err.println(" Failed to open file: " + file);
					problem = true;
				}
			}
		}

		/* VARIABLES TO BE DISTURBED BY INJECTING A NOISE */
		if (NOISE_VARIABLES && !problem) {
			count = 0;
			file = fileName + File.separator + NOISEVAR_FILE;
			if ((new File(file)).exists()) {
				VerbosePrinter.verbosePrint(
						"Reading variables to inject noise to from the file "
								+ file, VerbosePrinter.INFORMATORY);
				/* open the file */
				try {
					FileReader fr = new FileReader(file);
					br = new BufferedReader(fr);
					count = RDVariableCollection.noiseVariables
							.getVarSetFromFile(br);
					VerbosePrinter.verbosePrint("  Loaded " + count
							+ " variables.", VerbosePrinter.INFORMATORY);
				} catch (Exception exc) {
					System.err.println(" Failed to open file: " + file);
					problem = true;
				}
			}
		}

		/* PROGRAM LOCATION TO BE DISTURBED BY INJECTING A NOISE */
		if (NOISE_PROGLOC && !problem) {
			count = 0;
			file = fileName + File.separator + NOISELOC_FILE;
			if ((new File(file)).exists()) {
				VerbosePrinter.verbosePrint(
						"Reading program locations to inject noise to from the file "
								+ file, VerbosePrinter.INFORMATORY);
				/* open the file */
				try {
					FileReader fr = new FileReader(file);
					br = new BufferedReader(fr);
					count = NoiseInjection.getLocationsFromFile(br);
					VerbosePrinter
							.verbosePrint("  Loaded " + count
									+ " program locations.",
									VerbosePrinter.INFORMATORY);
				} catch (Exception exc) {
					System.err.println(" Failed to open file: " + file);
					problem = true;
				}
			}
		}

		/* add shutdown hook to perform finalization of RaceDetector */
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				RaceDetector.raceDetectorFinnish();
			}
		});

	}

	/**
	 * Finish all the work. Method called during finalization. Log file is
	 * closed.
	 * 
	 * 
	 */
	private static void raceDetectorFinnish() {

		/* start ending the logger */
		logProducer.queueMsg(logProducer.POISON_PILL);
		/* if needed save the results of AtomRace learning */
		if (ATOMICITY && ATOMRACE_LEARN) {
			/* ulozeni do souboru */
			BufferedWriter fd;
			String dirName = TraceWriter.getContestDirectory() + File.separator
					+ "raceDetectorAtomicity";
			/* if doesn't exist directory atomicity - make it */
			File dir = new File(dirName);
			if (!dir.exists()) {
				dir.mkdir();
			}

			String fName = dirName + File.separator + "violated_"
					+ TestID.getTestId() + ".xml";

			/* create and open apropriate file */
			try {
				fd = new BufferedWriter(new FileWriter(fName));
				System.out.println(" Opened file: " + fName);
			} catch (Exception exc) {
				System.err.println(" Failed to open file:" + fName);
				return;
			}

			/** ************************ */
			AtomRaceDetect.violatedAtomicityCol.storeAtomicityToFile(fd,
					ATOMRACE_LEARN);

			/* close the file */
			try {
				fd.close();
			} catch (Exception exc) {
				System.err.println(" Failed to close file:" + fName);
			}

		}
		/* wait till logger will not be done */
		logProducer.waitTillEnd();
	}

	/**
	 * In the case of usage the AtomRace this method marks the run as the run
	 * where the error has been detected.
	 */
	public static void setRunAsFail() {
		AtomRaceDetect.violatedAtomicityCol.correctRun = false;
	}

	/*
	 * --------------------------------------------------------------------------
	 * -------- Setting the behavior of the RaceDetector.
	 * ------------------------
	 * ----------------------------------------------------------
	 */

	/**
	 * Set detector -(Eraser / AtomRace). Do not use this method - it is only
	 * for testing purposes. Setting of detector is done by processing
	 * RDKingProperties file.
	 */
	public static void setDetectorType(Detector det) {
		detector = det;
	}

	private static boolean setInitSetting(Properties setting) {
		String value;

		VerbosePrinter.verbosePrint("rdDetector = " + DETECTOR,
				VerbosePrinter.INFORMATORY);
		/***********************************************************************
		 * ERASER DETECTOR SETTING
		 */
		if (DETECTOR == DetectorImplementation.ERASER) {
			value = (String) setting.get("rdOwnerTransfer");
			if (value != null) {
				if (value.equalsIgnoreCase("true")) {
					OWNER_TRANSFER = true;
				} else if (value.equalsIgnoreCase("false")) {
					OWNER_TRANSFER = false;
				}
			}
			VerbosePrinter.verbosePrint("rdOwnerThransfer = " + OWNER_TRANSFER,
					VerbosePrinter.INFORMATORY);

			value = (String) setting.get("rdLockDetermine");
			if (value != null) {
				if (value.equalsIgnoreCase("true")) {
					LOCK_DETERMINE = true;
				} else if (value.equalsIgnoreCase("false")) {
					LOCK_DETERMINE = false;
				}
			}
			VerbosePrinter.verbosePrint("rdLockDetermine = " + LOCK_DETERMINE,
					VerbosePrinter.INFORMATORY);

		}
		/***********************************************************************
		 * ATOMRACE detector setting
		 */
		if (DETECTOR == DetectorImplementation.ATOMRACE) {
			ATOMICITY = true;
			value = (String) setting.get("rdAtomRaceLearn");
			if (value != null) {
				if (value.equalsIgnoreCase("true"))
					ATOMRACE_LEARN = true;
				if (value.equalsIgnoreCase("false"))
					ATOMRACE_LEARN = false;
			}
			VerbosePrinter.verbosePrint("rdAtomRaceLearn = " + ATOMRACE_LEARN,
					VerbosePrinter.INFORMATORY);
			value = (String) setting.get("rdAtomImmediateHealing");
			if (value != null) {
				if (value.equalsIgnoreCase("true"))
					ATOMRACE_IMMHEAL = true;
				if (value.equalsIgnoreCase("false"))
					ATOMRACE_IMMHEAL = false;
			}
			VerbosePrinter.verbosePrint("rdAtomImmediateHealing = "
					+ ATOMRACE_IMMHEAL, VerbosePrinter.INFORMATORY);

		}

		/***********************************************************************
		 * HEALING setting
		 */
		value = (String) setting.get("rdHealing");
		if (value != null) {
			if (value.equalsIgnoreCase("true")) {
				HEALING = true;
			} else if (value.equalsIgnoreCase("false")) {
				HEALING = false;
			}
		}
		VerbosePrinter.verbosePrint("rdHealing = " + HEALING,
				VerbosePrinter.INFORMATORY);
		if (HEALING) {
			ATOMICITY = true;
			value = (String) setting.get("rdHealingMethod");
			if (value != null) {
				if (value.equalsIgnoreCase("yield"))
					HEALING_METHOD = HealingMethod.YIELD;
				if (value.equalsIgnoreCase("priority"))
					HEALING_METHOD = HealingMethod.PRIORITY;
				if (value.equalsIgnoreCase("yieldpriority"))
					HEALING_METHOD = HealingMethod.YIELDPRIORITY;
				if (value.equalsIgnoreCase("newmutex"))
					HEALING_METHOD = HealingMethod.NEWMUTEX;
				if (value.equalsIgnoreCase("otyield"))
					HEALING_METHOD = HealingMethod.OTYIELD;
				if (value.equalsIgnoreCase("otwait"))
					HEALING_METHOD = HealingMethod.OTWAIT;
				if (value.equalsIgnoreCase("threads"))
					HEALING_METHOD = HealingMethod.THREADS;
				if (value.equalsIgnoreCase("yieldthreads"))
					HEALING_METHOD = HealingMethod.YIELDTHREADS;
				if (value.equalsIgnoreCase("semaphore"))
					HEALING_METHOD = HealingMethod.SEMAPHORE;
			}
			VerbosePrinter.verbosePrint("rdHealingMethod = " + HEALING_METHOD,
					VerbosePrinter.INFORMATORY);
		}

		/***********************************************************************
		 * VARIABLE SETS SETTING
		 */
		value = (String) setting.get("rdOmitVariables");
		if (value != null) {
			if (value.equalsIgnoreCase("true"))
				OMIT_VARIABLES = true;
			if (value.equalsIgnoreCase("false"))
				OMIT_VARIABLES = false;
		}
		VerbosePrinter.verbosePrint("rdOmitVariables = " + OMIT_VARIABLES,
				VerbosePrinter.INFORMATORY);
		value = (String) setting.get("rdHealVariables");
		if (value != null) {
			if (value.equalsIgnoreCase("true"))
				HEAL_VARIABLES = true;
			if (value.equalsIgnoreCase("false"))
				HEAL_VARIABLES = false;
		}
		VerbosePrinter.verbosePrint("rdHealVariables = " + HEAL_VARIABLES,
				VerbosePrinter.INFORMATORY);

		/***********************************************************************
		 * NOISE SETS SETTING
		 */
		value = (String) setting.get("rdNoiseVariables");
		if (value != null) {
			if (value.equalsIgnoreCase("true")) {
				NOISE = true;
				NOISE_VARIABLES = true;
			}
			if (value.equalsIgnoreCase("false"))
				NOISE_VARIABLES = false;
		}
		VerbosePrinter.verbosePrint("rdNoiseVariables = " + NOISE_VARIABLES,
				VerbosePrinter.INFORMATORY);
		value = (String) setting.get("rdNoiseRandom");
		if (value != null) {
			if (value.equalsIgnoreCase("true")) {
				NOISE = true;
				NOISE_RANDOM = true;
			}
			if (value.equalsIgnoreCase("false"))
				NOISE_RANDOM = false;
		}
		VerbosePrinter.verbosePrint("rdNoiseRandom = " + NOISE_RANDOM,
				VerbosePrinter.INFORMATORY);
		value = (String) setting.get("rdNoiseProgLoc");
		if (value != null) {
			if (value.equalsIgnoreCase("true")) {
				NOISE = true;
				NOISE_PROGLOC = true;
			}
			if (value.equalsIgnoreCase("false"))
				NOISE_PROGLOC = false;
		}
		VerbosePrinter.verbosePrint("rdNoiseProgLoc = " + NOISE_PROGLOC,
				VerbosePrinter.INFORMATORY);
		value = (String) setting.get("rdNoiseFrequency");
		if (value != null) {
			try {
				NOISE_FREQUENCY = Integer.parseInt(value);
			} catch (Exception e) {
				// ignore it
			}
		}
		VerbosePrinter.verbosePrint("rdNoiseFrequency = " + NOISE_FREQUENCY,
				VerbosePrinter.INFORMATORY);

		/***********************************************************************
		 * OUTPUT FILE
		 */
		/* output file position */
		BufferedWriter outputFile;
		String filename = TraceWriter.getContestDirectory() + File.separator
				+ "raceDetectorReport";
		/* if doesn't exist directory racedetect - make it */
		File dir = new File(filename);
		if (!dir.exists()) {
			dir.mkdir();
		}
		filename += File.separator + "racedetect_" + TestID.getTestId()
				+ ".txt";
		try {
			/* current directory */
			outputFile = new BufferedWriter(new FileWriter(filename));
		} catch (IOException e) {
			System.err.println(" RaceDetector was unable to open output file.");
			System.err.println(" Output file name: '" + filename + "'.");
			return false;
		}

		/* construct and start the logger */
		logProducer = new LogProducer(outputFile);
		logProducer.startLog();

		return true;
	}

	/*
	 * --------------------------------------------------------------------------
	 * -------- IDENTIFIERS
	 * ------------------------------------------------------
	 * ----------------------------
	 */
	/**
	 * Returns unique string representation of a variable. The identityHashCode
	 * method returns the same value for this string if it represents the same
	 * variable.
	 * 
	 */
	protected static String getVarIdentifier(Object instance, String varName) {
		String str;

		if (instance == null) {
			/* static variable */
			str = varName;
		} else {
			/* non static variable */

			str = (String.format("%1$s->%2$s", Miscellaneous
					.getValueObjectString(instance), varName)).intern();
		}

		// System.out.println(str + " - " + System.identityHashCode(str) +
		// ObjectEnumerator.getNumber(instance));

		return str;
	}

	/**
	 * Returns string representation of the variable - without instance
	 * (instance is needed for array processing).
	 * 
	 */
	protected static String getProperVarName(Object instance, String varName) {
		String str = varName;
		String array = null;

		/* array handling */
		if (instance != null) {
			if (instance.getClass().isArray()) {
				try {
					arraysLock.readLock().lock();
					array = (String) arrays.get(instance);
				} finally {
					arraysLock.readLock().unlock();
				}

				/* local array cell - do not proceed */
				if (array == null)
					return null;

				/* an array cell - construct proper varName */
				str = String.format("%1$s%2$s", array, varName).intern();
			}

		}

		// if (!varName.equals("Airlines.numLoop"))
		// System.out.println(instance + " : " + varName + " - " + str + " X " +
		// System.identityHashCode(str));

		return str;

	}

	/**
	 * Collect the information about array. This information is used for
	 * getProperVarName.
	 * 
	 */
	protected static void updateArrayInfo(Object instance, Object value,
			String varName) {

		if (value == null)
			return;

		/* check if it is an array */
		if (value.getClass().isArray()) {
			// System.out.println(instance + " : " + value + " : " + varName);
			if (instance == null) {
				/* static array */
				try {
					/* array */
					arraysLock.writeLock().lock();
					if (!arrays.containsKey(value)) {
						arrays.put(value, varName);
					}
				} finally {
					arraysLock.writeLock().unlock();
				}
			} else {
				/* nonstatic array */
				try {
					/* array */
					arraysLock.writeLock().lock();
					if (!arrays.containsKey(value)) {
						arrays.put(value, String.format("%1$s->%2$s",
								Miscellaneous.getValueObjectString(instance),
								varName));
					}
				} finally {
					arraysLock.writeLock().unlock();
				}
			}
		}
	}

	/**
	 * Collect the information about array. This information is used for
	 * getProperVarName. For second and deeper level of arrays.
	 * 
	 */
	protected static void updateArrayInfo(Object instance, Object value,
			int index) {

		if (value == null)
			return;

		/* check if it is an array */
		if (value.getClass().isArray()) {

			try {
				/* array */
				arraysLock.writeLock().lock();
				if (!arrays.containsKey(value)) {
					arrays.put(value, String.format("%1$s[%2$d]", arrays
							.get(instance), index));
				}
			} finally {
				arraysLock.writeLock().unlock();
			}
		}
	}

	/*
	 * --------------------------------------------------------------------------
	 * -------- PRINT OPERATIONS
	 * ------------------------------------------------
	 * ----------------------------------
	 */

	/**
	 * Used for printing warnings.
	 */
	protected static void printWarning(String varIdentifier, Thread thread,
			String programLocation, String details) {

		logProducer
				.queueMsg(String
						.format(
								"Race possible for variable '%1$s' %n  Race caused by thread : '%2$s' at line : '%3$s' %n%4$s %n%n",
								varIdentifier, Miscellaneous
										.getThreadString(thread),
								new ProgramLocationParser(programLocation)
										.getSourceLocation(), details));
	}

	/**
	 * Used for printing warnings.
	 */
	protected static void printWarning(String varIdentifier,
			String raceDescription) {

		logProducer.queueMsg(String.format(
				"Race possible for variable '%1$s' %n%2$s%n", varIdentifier,
				raceDescription));
	}

	/*
	 * --------------------------------------------------------------------------
	 * -------- PRINT DEBUG OPERATIONS
	 * ------------------------------------------
	 * ----------------------------------------
	 */

	/**
	 * Used for printing debug info.
	 */
	public static void printDebug(String text) {

		logProducer.queueMsg(String.format("=== %1$s %n", text));

	}

	/**
	 * Returns the file which is expected to contains the setting of the
	 * RaceDetector.
	 * 
	 * @return
	 * @throws FileNotFoundException
	 */
	private File findFile(String fileName) throws FileNotFoundException {
		String classPath = System.getProperty("java.class.path");
		String delimiter = System.getProperty("path.separator");
		/* till there is more tokens */
		for (StringTokenizer st = new StringTokenizer(classPath, delimiter); st
				.hasMoreTokens();) {
			/* enter the directory */
			File dir = new File(st.nextToken());
			if (dir.isFile()) {
				dir = dir.getParentFile();
			}
			/* or open the file */
			File propFile = new File(dir, fileName);
			if (propFile.isFile()) {
				return propFile;
			}
		}
		/* if the file was not find */
		throw new FileNotFoundException();
	}
}
