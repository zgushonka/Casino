package bets;

import java.util.UUID;

//	Base Class for all Bets
public abstract class Bet {

	//	returns stake*rate if win
	//	OR  
	//	-stake if lose
	public int calcBetResult (int winningNumber) {
		
		boolean betWin = checkForWin (winningNumber);
		
		//	evaluate win coins
		int betResult = 0;
		
		if (betWin) {
			betResult = stake * rate;
		} else {
			betResult = stake * -1;
		}
		
		return betResult;
	}	
	
	
//	stake to win ratio
	private final int rate;
	
//	Constructor
	protected Bet (int rate, int number, int stake) {
		this.rate = rate;
		createBet (number, stake);
	}
	
	
	private void createBet (int number, int stake) {
		setStake(stake);
		setBet(number);		
	}	
	
	
	
	private int stake;
	
	private void setStake(int stake) {
		if ( !isStakeValid(stake) ) {
			// TODO exception
		}
		
		this.stake = stake;
	}
	
	
	
	//	storage for bet number
	private int number;
	//	betCode used for win decision
	private int betCode;
	
	private void setBet(int number)
	{
		if ( !isNumberValid(number) ) {
			// TODO exception
		}
		
		this.number = number;
		this.betCode = calcBetCode(number);
	}
	
	public int getNumber() {
		return number;
	 }
	
	protected int getBetCode() {
		return betCode;
	}
	
	
	//	win predicate
	private int winningNumber;
	
	//	did we win? True or False
	private boolean checkForWin(int winningNumber) {
		
		// here we can check WinNumber for Valid Value if necessary
		
		this.winningNumber = winningNumber; 
	
		boolean	betWin = compareBetWithWin();
		return betWin;
	}
		
	protected int getWinningNumber() {
		return winningNumber;
	}


	//	same for all bets, except Split and Corner
	protected boolean compareBetWithWin() {
		return getBetCode() == calcBetCode( getWinningNumber() );
	}
	
	
	
	//	calculate bet number for each bet type
	abstract protected int calcBetCode(int number);
	
	
	
	//	stake must be less than 10 coins
	private static final int MIN_STAKE = 1;
	private static final int MAX_STAKE = 10;
	
	private boolean isStakeValid(int stake) {
		return (MIN_STAKE <= stake) && (stake <= MAX_STAKE);
	}

	
	
	//	numbers in roulette is between 1 and 36
	//	zero disabled
	private static final int MIN_NUMBER = 1;
	private static final int MAX_NUMBER = 36;
	
	protected boolean isNumberValid(int number) {
		return ( (MIN_NUMBER <= number) && (number <= MAX_NUMBER) );
	}


	private UUID id = UUID.randomUUID();
	
	public UUID getId() {
		return this.id;
	}
	
	
	
}











