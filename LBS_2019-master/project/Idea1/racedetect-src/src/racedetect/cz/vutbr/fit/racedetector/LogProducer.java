package cz.vutbr.fit.racedetector;

import java.io.*;
import java.util.concurrent.*;

/**
 * A simple tool for writing to specified file. Writing to the file can be
 * potentionally slow and shouldn't be done by producing thread - therefore this
 * job is delegated to LoggerThread controlled by the LogProducer.
 * 
 * @author zdenek
 * 
 */
/*
 * SYNCHRONIZATION - immutable inner state
 * 
 * synchronization is delegated to LinkedBlockingQueue and poison pill
 */

public class LogProducer {

	/*
	 * --- DEBUG OPTIONS ----------------------------------------
	 */
	/* debug mode - to put details in output files set to true */
	private static final boolean DEBUG = false;
	
	/**
	 * Delimiter - if this delimiter is taken from the queue - file is closed
	 * and thread terminated.
	 */
	public final String POISON_PILL = "end";

	/* Queue of waiting messages - also used for synchronization */
	private final LinkedBlockingQueue<String> queue;

	/* thread that writes to the file */
	private final LoggerThread loggerThread;

	/* output file */
	private final BufferedWriter outputFile;

	/* end of the computation - queue is empty */
	public volatile boolean isLoggerDone = false;

	/**
	 * Constructor prepare the LoggerThread.
	 * 
	 * @param oFile
	 *            Specified output file
	 */
	public LogProducer(BufferedWriter oFile) {
		queue = new LinkedBlockingQueue<String>();
		loggerThread = new LoggerThread();
		loggerThread.setDaemon(true);
		outputFile = oFile;
	}

	/**
	 * Starts the LoggerThread.
	 * 
	 */
	public void startLog() {
		loggerThread.start();
	}

	/**
	 * Add a message to the queue.
	 * 
	 * @param msg
	 *            Text to be written.
	 */
	public void queueMsg(String msg) {
		while (true) {
			try {
				queue.put(msg);
				if (DEBUG){
					System.out.println(" LogProducer PUT:" + msg);
					System.out.flush();
				}
				break; /* well done - leave */
			} catch (InterruptedException e) {
				/* retry */
			}
		}
	}

	/**
	 * Wait for the end of LoggerThread which is writing the output file.
	 * 
	 */
	public void waitTillEnd() {
		while (true) {
			try {
				loggerThread.join();
				break;
			} catch (InterruptedException e) {
				/* retry */
			}
		}
	}

	/**
	 * Thread which writes to the file.
	 * 
	 * This thread is a daemon thread.
	 */
	private class LoggerThread extends Thread {

		/* main loop */
		public void run() {
			String msg;

			try {
				while (true) {
					/* take the first message from the queue */
					try {
						msg = queue.take();
						if (DEBUG){
							System.out.println(" LogProducer TAKE: " + msg);
							System.out.flush();
						}
						
						/* if the end of the computation - escape the loop */
						if (msg.equals(POISON_PILL))
							break;
						/* write message */
						outputFile.write(msg);
						outputFile.flush();
					} catch (InterruptedException ie) {
						/* consumed */
					} catch (IOException ioe) {
						System.err
								.println("RaceDetector: Unable write to output file.");
					}
				}
			} finally {
				/* close the file before exit */
				try {
					outputFile.write(String.format("Race detection done.%n"));
					outputFile.close();
					isLoggerDone = true;
				} catch (IOException e) {
					/* consumed */
				}
			}
		}
	}
}
