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
	
	
	@Override
	protected boolean calcWin (int winningNumber) {		
		int betNumber = getNumber();
		
		boolean betWin = ( numberMatch() || horizontalMatch() );
		
		return betWin;
	}

	
}

//	2 numbers bet horizontal (e.g. 1+2, 20+21)
