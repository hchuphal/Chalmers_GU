package cz.vutbr.fit.racedetector;

import javolution.util.*;
import java.io.*;

import com.ibm.contest.utils.ProgramLocationParser;
import com.ibm.contest.utils.QuickRandom;
import com.ibm.contest.utils.Noise;
import com.ibm.contest.utils.DisabledOperationException;

/**
 * <p>
 * This class implements the noise injection based on ConTest util.Noise class.
 * The noise is injected into places within atomic sections with intention to
 * increase the probability of data race manifestation.
 * 
 * <p>
 * Copied from the ConTest JavaDoc of <i>util.Noise</i> class: Instruct the user to set
 * the <b>frequency parameter to zero</b> (the strength, noise type and
 * halt-one-thread parameters would still be consulted by the methods of this
 * class). Similarly the user should be instructed to disable other extensions
 * that do noise.
 * 
 * @author zdenek
 * 
 */
public class NoiseInjection {

	public static final boolean DEBUG = false;


	/*
	 * quick and thread safe random generator - only newInstance method is not
	 * thread safe
	 */
	private static QuickRandom rand = QuickRandom.newInstance(123);

	/*
	 * Locations where the noise can be injected.
	 */
	private static FastSet<String> locations = new FastSet<String>()
			.setValueComparator(FastComparator.IDENTITY);

	public NoiseInjection(int frequency) {
		rand = QuickRandom.newInstance((int) System.currentTimeMillis());
		rand.setFrequency(RaceDetector.NOISE_FREQUENCY);
	}

	/**
	 * Inserts with predefined probability the noise with predefined strength to
	 * the thread which calls this method if a variable is specified.
	 */
	public static void randInjectNoise() {
		// with a probability given by noiseFrequency
		if (rand.nextPace()){
			Noise.makeNoise();
			try{
				Noise.makeNoiseHalt();
			} catch (DisabledOperationException e){}
		}
	}

	/**
	 * Inserts with predefined probability the noise with predefined strength to
	 * the thread which calls this method if a variable is specified.
	 */
	public static void progLocInjectNoise(String progLocation) {
		// with a probability given by noiseFrequency
		if (locations.contains(progLocation)){
			Noise.makeNoise();
			try{
				Noise.makeNoiseHalt();
			} catch (DisabledOperationException e){}
		}
	}


	/**
	 * Takes each line from the input file and tries if the line contains valid
	 * program location. If so the string is interned and puts to the set of
	 * locations that will be focused by the noise.
	 * 
	 * @param fd Given file to read from.
	 * @return Count of valid program locations read from the given file
	 */
	public static int getLocationsFromFile(BufferedReader fd) {
		if (fd == null)
			return -1;

		int count = 0;
		String str;

		try {
			while ((str = fd.readLine()) != null) {
				try {
					new ProgramLocationParser(str);
				} catch (Exception e) {
					System.out.println(" String : '" + str
							+ "' is not a valid program location.");
					continue;
				}
				locations.add(str.intern());
				count++;
				if (DEBUG)
					System.out.println(" added location: " + str);
			}
		} catch (IOException e) {
			return -1;
		}
		return count;

	}
}
