package bets;

public class DozenBet extends Bet {
	
	private static final int RATE = 2;
	
	public DozenBet () {
		super (RATE);
	}
	

	@Override
	protected int calcBet (int number) {
		if (number < 13) {
			return 0;
		}
		else if (number < 25) {
			return 1;
		} else {
			return 2;
		}
	}
	
}

//	1/3 numbers bet  1..12  13..24  25..36
//				bet		0		1		2
