package bets;

public class StreetBet extends Bet {
	
	private static final int RATE = 11;

	public StreetBet() {
		super (RATE);
	}
	

	@Override
	protected int calcBetCode(int number) {
		int line = (number - 1) / 3;
		return line;
	}

}

//	3 numbers in horizontal line bet
