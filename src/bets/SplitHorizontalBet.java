package bets;

public class SplitHorizontalBet extends SmallSectorBet {
	
	private static final int RATE = 2;
	
	public SplitHorizontalBet () {
		super (RATE);
	}
	

	@Override
	protected int calcBet(int number) {
		
		int betNumber = number;
		betNumber = correctColumn(betNumber);
		
		return betNumber;
	}
	
}

//	2 numbers bet horizontal (e.g. 1+2, 20+21)
