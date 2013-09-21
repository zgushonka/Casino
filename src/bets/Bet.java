package bets;

public abstract class Bet {
			
	
	private final int rate;
	public Bet (int rate) {
		this.rate = rate;
	}
	
	
	
	private static final int MIN_STAKE = 1;
	private static final int MAX_STAKE = 10;
	private int stake;
	boolean setStake(int stake) {
		boolean isStakeValid = false;
		
		if ( (MIN_STAKE <= stake) && (stake >= MAX_STAKE) ) {
			this.stake = stake;
			isStakeValid = true;
		}
		return isStakeValid;
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
