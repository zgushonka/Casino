package bets;

public class StrightBet extends Bet {
	
	private static final int RATE = 35;
		
	public StrightBet () {
		super (RATE);
	}
		
	
	@Override
	protected int calcBetCode(int number) {
		return number;
	}
	
}
