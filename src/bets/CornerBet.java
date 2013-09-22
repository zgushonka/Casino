package bets;

public class CornerBet extends SmallSectorBet {	
	
	private static final int RATE = 8;

	public CornerBet () {
		super (RATE);
	}

	
	@Override
	protected int calcBet(int number) {
		
		int betNumber = number;
		betNumber = correctColumn(betNumber);
		betNumber = correctStreet(betNumber);
		
		return betNumber;
	}
	
}

//	4 number bet (e.g. 1+2+4+5, 20+21+23+34)
