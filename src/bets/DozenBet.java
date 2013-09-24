package bets;

public class DozenBet extends Bet {
	
	private static final int RATE = 2;
	
	public DozenBet (int number, int stake) {
		super (RATE, number, stake);
	}
	

	@Override
	protected int calcBetCode (int number) {
		
		int sector;
		
		if (number < 13) {
			sector = 0;
		}
		else if (number < 25) {
			sector = 1;
		} else {
			sector = 2;
		}
		
		return sector;
	}
	
}

//	1/3 numbers bet  1..12  13..24  25..36
//				bet		0		1		2
