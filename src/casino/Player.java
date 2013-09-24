package casino;

import java.util.UUID;

public class Player {
	
	private final String name;
	private final String password;
	private final UUID id = UUID.randomUUID();
	private int money;
	
	private boolean isAuthentified = false;
	
	public Player(String name, String password) {
		
		checkName(name);
		checkPassword(password);
		
		this.name = name;
		this.password = password;
		money = 0;
	}
	
		
	private void checkPassword(String password) {
		// TODO Auto-generated method stub
		
	}


	private void checkName(String name2) {
		// TODO Auto-generated method stub
		
	}


	public String getName() {
		return name;
	}
	
	

	public UUID getId() {
		return id;
	}

	
	
	
	public int getMoney() {
		return money;
	}
	
	// package access level (for Croupie)
	protected void applyBetResult(int result) {
		this.money += result;
	}
	
	
	
	
	public boolean isPasswordOk (String password) {
		isAuthentified = this.password == password;
		return isAuthentified;
	}
	
}
