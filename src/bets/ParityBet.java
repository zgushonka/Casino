package bets;

public class ParityBet extends StrightBet {
	
	private static final int RATE = 1;

	public ParityBet() {
		super (RATE);
		// even = 0
		// odd  = 1
	}
	
	public int calcParity (int a) {
		return a & 1;
	}
	
	public boolean setParity (int number) {
		this.number = calcParity(number);
		return true;
	}
	
	@Override
	public boolean betWin (int winningNumber) {
		int winningNumberParity = calcParity(winningNumber); 

		boolean betWin = (this.number == winningNumberParity );
		return betWin;
	}
	
}
