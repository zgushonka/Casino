package bets;

public class ColourBet extends Bet {
	
	private static final int RATE = 1;

	public ColourBet() {
		super (RATE);
	}
	
	
	private static final int colourFor[] = {
//		0	1	2	3	4	5	6	7	8	9	10	11	12
		0,	1,	0,	1,	0,	1,	0,	1,	0,	1,	0,	0,	1,
			
//			13	14	15	16	17	18	19	20	21	22	23	24
			0,	1,	0,	1,	0,	1,	1,	0,	1,	0,	1,	0,
			
//			25	26	27	28	29	30	31	32	33	34	35	36
			1,	0,	1,	0,	0,	1,	0,	1,	0,	1,	0,	1
	};
	
	@Override
	protected int calcBetCode (int number) {
		return colourFor[number];
		// black = 0
		// red	 = 1
	}

}

//red 	1, 3, 5, 7,  9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36
//black	2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35
