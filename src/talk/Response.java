package talk;

public abstract class Response {
	
//	respond to actions
//		RegisterResponse, BetResponse, CommandResponse
	
	public Response (String userid, String answer) {
		setUserid(userid);
		setAnswer(answer);
	}

	public String getUserid() {
		return userid;
	}

	protected void setUserid(String userid) {
		this.userid = userid;
	}
	
	private String userid;
	
	
	
	
	public String getAnswer() {
		return answer;
	}

	protected void setAnswer(String answer) {
		this.answer = answer;
	}

	private String answer;
	
}
