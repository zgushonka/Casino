package casino;

public class Player {
	
	private final String name;

	private final String password;
	
	public Player(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean loginOk (String password) {
		return (this.password == password);
	}
	
	
	
}
