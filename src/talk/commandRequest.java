package talk;

public class commandRequest extends Request {
	/*
	- all bets done, perform spin (test table)
		UUID
		password
	/*	*/
	
	public commandRequest (String userid, String password, String command) {
		setUserid(userid);
		setPlayerPassword(password);
		setCommand(command);
	}
	
}
