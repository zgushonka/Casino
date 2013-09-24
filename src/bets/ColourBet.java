package bets;

import java.util.Arrays;
import java.util.List;


public class ColourBet extends Bet {
	
	private static final int RATE = 1;

	public ColourBet(int number, int stake) {
		super (RATE, number, stake);
	}

	private static final List<Integer> blacks = Arrays.asList(2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35);
	
	@Override
	protected int calcBetCode (int number) {
		return blacks.contains(number) ? 1 : 0 ;
		// return 1 for black
		// return 0 for red
	}

}

//red 	1, 3, 5, 7,  9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36
//black	2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35
