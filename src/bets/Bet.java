package bets;

public abstract class Bet {
			
	
	private final int rate;
	public Bet (int rate) {
		this.rate = rate;
	}
	
	
	
	private static final int MIN_STAKE = 1;
	private static final int MAX_STAKE = 10;
	private boolean isStakeValid(int stake) {
		return (MIN_STAKE <= stake) && (stake >= MAX_STAKE);
	}
		
	
	private int stake;
	private boolean setStake(int stake) {
		boolean StakeValid;
		if ( StakeValid = isStakeValid(stake) ) {
			this.stake = stake;
		}
		return StakeValid;
	}
	
	
	
	private static final int MIN_NUMBER = 1;
	private static final int MAX_NUMBER = 36;
	protected boolean isBetValid(int number) {
		return ( (MIN_NUMBER <= number) && (number >= MAX_NUMBER) );
	}
	
	
	
	protected int number;
	abstract public boolean setBet (int number);
	
	
	
	abstract public boolean betWin (int winningNumber);	
	
	
}
