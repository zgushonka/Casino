package bets;

public class ColumnBet extends Bet {
		
	private static final int RATE = 2;

	public ColumnBet() {
		super (RATE);
	}
	

	@Override
	protected int calcBet(int number) {
		int line = (number - 1) % 3;
		return line;
	}

}

//	1/3 numbers bet in line
