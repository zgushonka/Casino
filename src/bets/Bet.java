package bets;

public abstract class Bet {
	
	private static final int MIN_STAKE = 1;
	private static final int MAX_STAKE = 10;
	
	private int stake;
	private final int rate;
	
	public Bet (int rate) {
		this.rate = rate;
	}
		
	boolean setStake(int stake) {
		
		boolean isStakeValid = false;
		
		if ( (MIN_STAKE <= stake) && (stake >= MAX_STAKE) ) {
			this.stake = stake;
			isStakeValid = true;
		}
		
		return isStakeValid;
	}
	
	abstract public boolean betWin (int winningNumber);	
	
}
