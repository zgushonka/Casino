package casino;
import bets.*;

//	Oleksandr Buravlyov
//	Roulette for GlobalLogic Dojo Competition
//	20 September 2013




public class Casino {
	
	public static void main(String[] args) {
		
		int number = 1;
		int stake = 1;
		
		Bet bet01 = new StrightBet(number, stake);		
		
		
		int useMoney = 0;
		
		for (int i = 1; i < 37; i++) {
			
			int winInSpin = bet01.calcBetResult(i); 
			
			useMoney += winInSpin;
			
			System.out.println("winNumber is " +i+ "    winInSpin " +winInSpin+ "     current ballance =  " +useMoney);
		}

		
	/*	
		Roulette roulette = new Roulette();
		
		for (int i = 1; i < 50; i++) {
			
			int winNumber = roulette.performSpin();
			useMoney += bet01.calcBetResult(winNumber);
			
			System.out.println("Spin number " + i + ", winNumber is " + winNumber + ", current ballance =  " + useMoney);
		}
	*/	
	}

}
