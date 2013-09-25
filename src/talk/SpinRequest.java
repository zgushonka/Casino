package talk;

public class SpinRequest extends Request {
	/*
	- all bets done, perform spin (test table)
		UUID
		password
	/*	*/
	
	public SpinRequest (String userid, String password) {
		setUserid(userid);
		setPlayerPassword(password);
	}
	
}
