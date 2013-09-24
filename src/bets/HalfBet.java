package bets;

public class HalfBet extends Bet {	
	
	private static final int RATE = 1;

	public HalfBet (int number, int stake) {
		super (RATE, number, stake);
	}

	@Override
	protected int calcBetCode(int number) {
		if (number < 19) {
			return 0;
		}
		return 1;
	}	

}

//	half numbers bet
