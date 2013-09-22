package bets;

public class StrightBet extends Bet {
	
	private static final int RATE = 35;
		
	public StrightBet () {
		super (RATE);
	}
		
	
	@Override
	protected int calcBet(int number) {
		return number;
	}
	
	
	// constructor for subclasses
	protected StrightBet (int rate) {
		super (rate);
	}
	
}
