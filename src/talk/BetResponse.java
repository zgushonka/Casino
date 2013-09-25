package talk;

public class BetResponse extends Response {
	
	public BetResponse (String userid, String command, String answer, int stake, int number, String betType) {
		super (userid, command, answer);
		setStake(stake);
		setNumber(number);
		setBetType(betType);
	}
	
	public int getStake() {
		return stake;
	}
	protected void setStake(int stake) {
		this.stake = stake;
	}
	
	public int getNumber() {
		return number;
	}
	protected void setNumber(int number) {
		this.number = number;
	}

	public String getBetType() {
		return betType;
	}
	protected void setBetType(String betType) {
		this.betType = betType;
	}

	private int stake;
	private int number;
	private String betType;
		
	
}
