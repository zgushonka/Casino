package talk;

public class RegisterRequest extends Request {
	
//	- register Player
//		set Player Name
//		set Password
	
	public RegisterRequest (String playerName, String newPassword) {
		setPlayerName(playerName);
		setPlayerPassword(newPassword);		
	}
	
}
