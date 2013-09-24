package bets;

public class ParityBet extends Bet {
	
	private static final int RATE = 1;

	public ParityBet (int number, int stake) {
		super (RATE, number, stake);
	}
	
	
	@Override
	protected int calcBetCode (int number) {
		return number & 1;
		// even = 0
		// odd  = 1
	}
	
}
