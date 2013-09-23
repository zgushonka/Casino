package bets;

//	Base Class for all Bets
public abstract class Bet {

	
	//	stake to win ratio
	private final int rate;
	protected Bet (int rate) {
		this.rate = rate;
	}
	
	
	
	//	stake must be less than 10 coins
	private static final int MIN_STAKE = 1;
	private static final int MAX_STAKE = 10;
	private boolean isStakeValid(int stake) {
		return (MIN_STAKE <= stake) && (stake >= MAX_STAKE);
	}
		
	
	
	private int stake;
	private boolean setStake(int stake) {
		boolean StakeValid = isStakeValid(stake);
		if ( StakeValid ) {
			this.stake = stake;
		}
		return StakeValid;
	}
		
	
	
	//	numbers in roulette is between 1 and 36
	//	zero disabled
	private static final int MIN_NUMBER = 1;
	private static final int MAX_NUMBER = 36;
	protected boolean isNumberValid(int number) {
		return ( (MIN_NUMBER <= number) && (number >= MAX_NUMBER) );
	}
	
		
	
	//	storage for bet number/code number
	//	if success returns true
	private int number;
	private int betCode;
	protected boolean setBet(int number) {
		boolean BetValid = isNumberValid(number);
				
		if ( BetValid ) {
			this.number = number;
			this.betCode = calcBet(number);
		} 
		return BetValid;
	}
	
	
	protected int getNumber() {
		return number;
	}
	
	protected int getBetCode() {
		return betCode;
	}
	
	
	//	win predicate
	private int winningNumber;
	private boolean betWin(int winningNumber) {
		boolean betWin = false;
		
		if ( isNumberValid(winningNumber) ) {
			this.winningNumber = winningNumber; 
			betWin = calcWin(winningNumber);
		}
		
		return betWin;
	}
	
	
	protected int getWinNumber() {
		return winningNumber;
	}



	protected boolean calcWin(int winningNumber) {
		return this.number == calcBet(winningNumber);
	}
	
	
	
	//	calculate bet number for each bet type
	abstract protected int calcBet(int number);
	
	
	
}











