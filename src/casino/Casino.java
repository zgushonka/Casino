package casino;
import bets.*;

//	Oleksandr Buravlyov
//	Roulette for GlobalLogic Dojo Competition
//	20 September 2013




public class Casino {
	
	public static void main(String[] args) {
		
		Bet bet01 = new ColumnBet();
		
		boolean betCreated = bet01.createBet(1, 1);
		System.out.println("betCreated - " + betCreated);
		
		for (int winNumber = 1; winNumber < 37; winNumber++) {
			int win = bet01.calcBetResult(winNumber);
			System.out.println("win for " + winNumber + "        " + win);
		}
		
	}

}
