package bets;

public class SplitVerticalBet extends SmallSectorBet {
	
	private static final int RATE = 17;
	
	public SplitVerticalBet () {
		super (RATE);
	}
	

	@Override
	protected int calcBetCode(int number) {
		return correctStreet(number);
	}
	
	
	@Override
	protected boolean compareBetWithWin () {
		
		boolean betWin = ( 	numberMatchWith(NO_SHIFT) ||
							numberMatchWith(VERTICAL_SHIFT) );
		
		return betWin;
	}


	

}

//	2 numbers bet vertical (e.g. 1+4, 20+23)
