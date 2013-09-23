package bets;

public class CornerBet extends SmallSectorBet {	
	
	private static final int RATE = 8;

	public CornerBet () {
		super (RATE);
	}

	
	@Override
	protected int calcBetCode(int number) {
		int betNumber = number;
		betNumber = correctColumn(betNumber);
		betNumber = correctStreet(betNumber);
		
		return betNumber;
	}
	
	
	@Override
	protected boolean compareBetWithWin () {
		
		boolean betWin = ( 	numberMatchWith(NO_SHIFT) ||
							numberMatchWith(VERTICAL_SHIFT) ||
							numberMatchWith(HORIZONTAL_SHIFT) ||
							numberMatchWith(CORNER_SHIFT) );
		
		return betWin;
	}
	
}

//	4 number bet (e.g. 1+2+4+5, 20+21+23+34)
