package talk;

public class BetRequest extends Request {
	
	public BetRequest (String userid, String password, String tableType, String betType, int stake, int number) {
		setUserid(userid);
		setPlayerPassword(password);
		setTableType(tableType);
		setBetType(betType);
		setStake(stake);
		setNumber(number);
	}
	
//	- take Bet from user
//		UUID
//		password
//		table type
//		bet type
//		stake
//		number
	
}
