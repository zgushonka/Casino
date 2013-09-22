package bets;

public class HalfBet extends Bet {	
	
	private static final int RATE = 1;

	public HalfBet () {
		super (RATE);
	}

	@Override
	protected int calcBet(int number) {
		if (number < 19) {
			return 0;
		}
		return 1;
	}	

}

//	half numbers bet
