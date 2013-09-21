package bets;

public class StrightBet extends Bet {
	
	private static final int RATE = 35;
		
	public StrightBet () {
		super (RATE);
	}
	
	
	// constructor for subclasses
	protected StrightBet (int rate) {
		super (rate);
	} 	
	
	
	
	@Override
	public boolean setBet(int number) {
		boolean BetValid = false;
				
		if ( BetValid = isBetValid(number) ) {
			this.number = number;
		} 
		return BetValid;
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
