package bets;

// superclass for Split and Corner Bets
public abstract class SmallSectorBet extends Bet {
	
	// constructor for subclasses
	protected SmallSectorBet (int rate) {
		super (rate);
	}
	
	
	protected int correctColumn(int betNumber) {
		// move in middle Column if number is in last
		boolean numberInLastColumn = ( (betNumber - 1) % 3 == 2 ) ;
		if ( numberInLastColumn ) {
			betNumber--;
		}
		return betNumber;
	}	
	
	
	protected int correctStreet(int betNumber) {
		// move one step Up if number is in last street
		boolean numberInLastStreet = ( (betNumber - 1) / 3 == 11 ) ;
		if ( numberInLastStreet ) {
			betNumber -= 3;
		}
		return betNumber;
	}
	
	protected final int NO_SHIFT 			= 0;	
	protected final int HORIZONTAL_SHIFT 	= 1;
	protected final int VERTICAL_SHIFT 		= 3;
	protected final int CORNER_SHIFT 		= 4;
	
	protected boolean numberMatchWith(int shift) {
		return (getBetCode() + shift) == getWinningNumber();
	}
	
}
