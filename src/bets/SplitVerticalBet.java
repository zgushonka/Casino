package bets;

public class SplitVerticalBet extends SmallSectorBet {
	
	private static final int RATE = 2;
	
	public SplitVerticalBet () {
		super (RATE);
	}
	

	@Override
	protected int calcBet(int number) {
		
		int betNumber = number;
		betNumber = correctStreet(betNumber);
		
		return betNumber;
	}
	
	
	@Override
	protected boolean calcWin (int winningNumber) {		
		int betNumber = getNumber();
		
		boolean betWin = ( numberMatch() || verticalMatch() );
		
		return betWin;
	}


	

}

//	2 numbers bet vertical (e.g. 1+4, 20+23)
