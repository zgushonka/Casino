package bets;

public class StreetBet extends Bet {
	
	private static final int RATE = 11;

	public StreetBet() {
		super (RATE);
	}
	

	@Override
	protected int calcBetCode(int number) {
		// shift to zero and divide on streets count
		int street = (number - 1) / 3;
		return street;
	}

}

//	3 numbers in horizontal line bet
