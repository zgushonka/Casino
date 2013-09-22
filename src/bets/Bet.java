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
	
		
	
	//	storage for bet number
	// if success returns true
	private int number;
	protected boolean setBet(int number) {
		boolean BetValid = isNumberValid(number);
				
		if ( BetValid ) {
			this.number = number;
		} 
		return BetValid;
	}
	
	
	
	//	win predicate
	protected boolean betWin(int winningNumber) {
		boolean betWin = false;
		
		if ( isNumberValid(winningNumber) ) {
			betWin = (this.number == calcBet(winningNumber) );
		}
		
		return betWin;
	}
	
	
	
	//	calculate bet number for each bet type
	abstract protected int calcBet(int number);
	
	
	
}











