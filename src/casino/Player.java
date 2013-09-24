package casino;

import java.util.UUID;

public class Player {
	
	private final String name;

	private final String password;
	
	private final UUID id = UUID.randomUUID();
	
	public Player(String name, String password) {
		this.name = name;
		this.password = password;
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
