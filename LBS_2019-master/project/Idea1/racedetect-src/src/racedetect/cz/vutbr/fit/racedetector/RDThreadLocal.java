package cz.vutbr.fit.racedetector;

/**
 * This class extends ThreadLocal used for storing variables local for a thread.
 * 
 * @author zdenek
 * 
 */
public class RDThreadLocal extends ThreadLocal<RDThread> {

	/**
	 * Returns RDThread subclass according to the activated detector.
	 */
	public RDThread initialValue() {
		return RaceDetector.detector.getNewThread();
	}

}
