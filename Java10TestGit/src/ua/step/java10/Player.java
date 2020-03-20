package ua.step.java10;

import java.util.Date;

public class Player {
	private String le;
	private String name;
	private String description;
	private Date created;
	private String balance;

	public Player(String name, Date registration) {
		this.name = name;
		this.created = registration;
	}

	public String getName() {
		return name;
	}

	public Date getRegistration() {
		return created;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
	
}