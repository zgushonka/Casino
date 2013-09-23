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
		
		
		Roulette roulette = new Roulette();
		
		int win = 0;
		
		for (int i = 1; i < 50; i++) {
			
			int winNumber = roulette.performSpin();
			win += bet01.calcBetResult(winNumber);
			
			System.out.println("Spin number " + i + ", winNumber is " + winNumber + ", current ballance =  " + win);
		}
		
	}

}
