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
		
		
		int userMoney = 0;
		
		for (int i = 1; i < 37; i++) {
			
			int winInSpin = bet01.calcBetResult(i); 
			
			userMoney += winInSpin;
			
			System.out.println("winNumber is " +i+ "    winInSpin " +winInSpin+ "     current ballance =  " +userMoney);
		}

		
		
	  	number = 1;
		stake = 1;
		userMoney = 0;
		
		Bet bet02 = new ColourBet(number, stake);
	 
		Roulette roulette = new Roulette();
		
		// perform random roulette spin (croupie logic)
		
		
		
		int spinCount = 10;
		for (int i = 1; i < spinCount; i++) {
			
			int winNumber = roulette.performSpin();
			int winInSpin = bet02.calcBetResult(winNumber);
			
			userMoney += winInSpin;
			
			System.out.println("Spin number " +i+ "    winNumber is " +winNumber+ "    winInSpin " +winInSpin+ "   current ballance =  " + userMoney);
		}
	/*	*/	
	}

}
