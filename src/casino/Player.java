package casino;

import java.util.UUID;

public class Player {
	
	private final String name;

	private final String password;
	
	private final UUID id;
	
	public Player(String name, String password) {
		this.name = name;
		this.password = password;
		
		id = UUID.randomUUID();

	}
	
	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public boolean loginOk (String password) {
		return (this.password == password);
	}
	
}
