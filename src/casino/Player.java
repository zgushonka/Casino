package casino;

import java.util.UUID;

public class Player {
	
	private final String name;
	private final String password;
	private final UUID id = UUID.randomUUID();
	private int money;
	
	
	
	public Player(String name, String password) {
		this.name = name;
		this.password = password;
		money = 0;
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
	void applyBetResult(int result) {
		this.money += result;
	}
	
	
	
	
	public boolean passwordIsValid (String password) {
		return (this.password == password);
	}
	
}
