package bets;

public class SplitHorizontalBet extends SmallSectorBet {
	
	private static final int RATE = 17;
	
	public SplitHorizontalBet () {
		super (RATE);
	}
	

	@Override
	protected int calcBetCode(int number) {
		return correctColumn(number);
	}
	
	
	@Override
	protected boolean compareBetWithWin () {
		
		boolean betWin = (	numberMatchWith(NO_SHIFT) ||
							numberMatchWith(HORIZONTAL_SHIFT) );
		
		return betWin;
	}

	
}

//	2 numbers bet horizontal (e.g. 1+2, 20+21)
