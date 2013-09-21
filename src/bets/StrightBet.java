package bets;

public class StrightBet extends Bet {
	
	private static final int RATE = 35;
	
	private static final int MIN_NUMBER = 1;
	private static final int MAX_NUMBER = 36;
	
	protected int number; 
	
	public StrightBet () {
		super (RATE);
	}
	
	// constructor for subclasses
	protected StrightBet (int rate) {
		super (rate);
	} 
	
	boolean setNumber(int number) {
		
		boolean isBetValid = false;
				
		if ( (MIN_NUMBER <= number) && (number >= MAX_NUMBER) ) {
			this.number = number;
			isBetValid = true;
		} 
		
		return isBetValid;
	}
	
	@Override
	public boolean betWin(int winningNumber) {
		boolean betWin = false;
		
		if (this.number == winningNumber) {
			betWin = true;
		}
		
		return betWin;
	}

}
