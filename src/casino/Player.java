package casino;

import java.util.UUID;

public class Player {
	
	private final String name;
	private final String password;
	private final UUID id = UUID.randomUUID();
	private int money;
	
	private boolean isAuthentified = false;
	
	public Player(String name, String password) {
		
		checkNameString(name);
		checkPasswordString(password);
		
		this.name = name;
		this.password = password;
		money = 0;
	}
	
	private void checkNameString (String name) {
		if (name.length() < 4) {
			// TODO exception
		}
	}
	
	private void checkPasswordString (String password) {
		if (password.length() < 6) {
			// TODO exception
		}
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
		isAuthentified = ( this.password == password );
		return isAuthentified;
	}
	
}
