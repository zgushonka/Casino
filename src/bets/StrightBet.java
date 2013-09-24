package bets;

public class StrightBet extends Bet {
	
	private static final int RATE = 35;
		
	public StrightBet (int number, int stake) {
		super (RATE, number, stake);
	}
		
	
	@Override
	protected int calcBetCode(int number) {
		return number;
	}
	
}
