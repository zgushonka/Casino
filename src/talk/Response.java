package talk;

public abstract class Response {
	
//	respond to actions
//		RegisterResponse, BetResponse, CommandResponse
	
	public Response (String userid, String command, String answer) {
		setUserid(userid);
		setCommand(command);
		setAnswer(answer);
	}

	public String getUserid() {
		return userid;
	}

	protected void setUserid(String userid) {
		this.userid = userid;
	}
	
	
	
	
	
	public String getAnswer() {
		return answer;
	}

	protected void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getCommand() {
		return command;
	}

	protected void setCommand(String command) {
		this.command = command;
	}

	private String userid;
	private String answer;	
	private String command;
	
}
