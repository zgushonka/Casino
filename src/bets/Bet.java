package bets;

import java.util.UUID;

//	Base Class for all Bets
public abstract class Bet {
	
	
	
	public boolean createBet (int number, int stake) {
		
		boolean betAccepted = setStake(stake) && setBet(number);
		
		return betAccepted;
	}	
	
	
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
	
//	Constructor. 
	protected Bet (int rate) {
		this.rate = rate;
	}
	
	
	
	private int stake;
	
	private boolean setStake(int stake) {
		boolean StakeValid = isStakeValid(stake);
		if ( StakeValid ) {
			this.stake = stake;
		}
		return StakeValid;
	}
	
	
	
	//	storage for bet number
	private int number;
	//	betCode used for win decision
	private int betCode;
	
	private boolean setBet(int number) {
		boolean BetValid = isNumberValid(number);
				
		if ( BetValid ) {
			this.number = number;
			this.betCode = calcBetCode(number);
		} 
		return BetValid;
	}
	
	public int getNumber() {
		return number;
	 }
	
	protected int getBetCode() {
		return betCode;
	}
	
	
	//	win predicate
	private int winningNumber;
	private UUID id = UUID.randomUUID();
	
	//	did we win? True or False
	private boolean checkForWin(int winningNumber) {
		
		// here we can check WinNumber for Valid Value
		
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


	public UUID getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
	
	
	
}











