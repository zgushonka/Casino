package bets;

public class ParityBet extends StrightBet {
	
	private static final int RATE = 1;

	public ParityBet() {
		super (RATE);
	}
	
	private int calcParity (int a) {
		return a & 1;
		// even = 0
		// odd  = 1
	}
	
	
	@Override
	public boolean setBet (int number) {
		boolean betValid = false;
		
		if ( betValid = isBetValid(number) ) {
			this.number = calcParity(number);
		}
		return betValid;
	}
	
	
	@Override
	public boolean betWin (int winningNumber) {
		int winningNumberParity = calcParity(winningNumber); 

		boolean betWin = (this.number == winningNumberParity );
		return betWin;
	}
	
}
