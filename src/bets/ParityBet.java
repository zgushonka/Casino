package bets;

public class ParityBet extends Bet {
	
	private static final int RATE = 1;

	public ParityBet() {
		super (RATE);
	}
	
	
	@Override
	protected int calcBet (int number) {
		return number & 1;
		// even = 0
		// odd  = 1
	}
	
}
