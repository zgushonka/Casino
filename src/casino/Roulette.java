package casino;

public class Roulette {
	
	public Roulette() {
		// generate ID for log file name
		
		lastSpinResult = -1;	// invalid value for No spin situation
	}
	
	private int lastSpinResult;
	
	public int getLastSpinResult() {
		return lastSpinResult;
	}
	
	private final static int MINIMUM = 1;
	private final static int MAXIMUM = 36;

	public int performSpin() {
		// generate random number
		lastSpinResult = MINIMUM + (int)(Math.random()*MAXIMUM);

		// write number and date to log file
		writeResultToLog();
		
		return lastSpinResult;
	}
	
	private void writeResultToLog() {
		// TODO
	}
	
}
