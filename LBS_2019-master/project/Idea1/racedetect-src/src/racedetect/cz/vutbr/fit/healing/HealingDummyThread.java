package cz.vutbr.fit.healing;

import cz.vutbr.fit.racedetector.RaceDetector;

/**
 * <p>
 * This class implements dummy threads which are started on the machines with
 * more processors (cores) to utilize them except one devoted for thread in the
 * critical section.
 * 
 * <p>
 * Threads are initialized and forced to wait till someone call <i>goAll</i>
 * then they forced to wait by <i>stopAll</i> method. A wait-notifyAll aproach
 * is used for the synchronization.
 * 
 * @author zdenek
 * 
 */
public class HealingDummyThread extends Thread {

	/* debug mode - to put details in output files set to true */
	private static final boolean DEBUG = false;

	public int num = 0;

	/* contain number of threads currently under healing */
	private static int counter = 0;

	/* state variable - if to end them */
	private static volatile boolean end = false;

	/* state variable - if to force them wait */
	private static volatile boolean wait = true;

	/* synchronization object */
	private static final Object SYNC = new Object();

	/**
	 * Runs dummy thread.
	 * 
	 */
	public void run() {

		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Thread.currentThread().setDaemon(true);
		
		/* "never" ending loop */
		while (!end) {

			/* if wait is set - wait */
			synchronized (SYNC) {
				if (wait) {
					if (DEBUG)
						RaceDetector.printDebug("waiting " + this);

					while (wait) {
						try {
							SYNC.wait();
						} catch (InterruptedException e) {
						}
					}

					if (DEBUG)
						RaceDetector.printDebug("resuming " + this);
				}
			}

			/* simulate some usefull work on some variable */
			if (!end) {
				num = 10;
				num += num;
				num += 3 * num;
			}

		}
	}

	/**
	 * Runs all waiting threads.
	 * 
	 */
	public static void goAll() {
		synchronized (SYNC) {
			wait = false;
			counter++;
			if (counter == 1)
				/* run threads */
				SYNC.notifyAll();

		}
	}

	/**
	 * Stops all running threads.
	 * 
	 */
	public static void stopAll() {
		synchronized (SYNC) {
			counter--;
			if ((counter == 0) && (!end))
				/* suspend threads */
				wait = true;
		}
	}

	/**
	 * Finnish all threads.
	 * 
	 */
	public static void endAll() {
		synchronized (SYNC) {
			wait = false;
			end = true;
			/* run threads */
			SYNC.notifyAll();
		}
	}
}
