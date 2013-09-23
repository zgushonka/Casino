package bets;

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
	
	
	
	protected boolean numberMatch() {
		return getNumber() == getWinNumber();
	}

	protected boolean verticalMatch() {
		return (getNumber() + 3) == getWinNumber();
	}
	
	protected boolean horizontalMatch() {
		return (getNumber() + 1) == getWinNumber();
	}
	
	protected boolean cornerlMatch() {
		return (getNumber() + 4) == getWinNumber();
	}
	

}
