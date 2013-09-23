package bets;

public class LineBet extends Bet {

	private static final int RATE = 5;

	public LineBet() {
		super (RATE);
	}
	

	@Override
	protected int calcBetCode(int number) {
		// shift to zero and divide to line count
		int line = (number - 1) / 6;
		return line;
	}

}

//	6 numbers bet
