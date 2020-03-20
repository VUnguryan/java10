package ua.step.java10;

import java.util.Date;

public class Player {
	private String vunguryan;
	private String name;
	private String description;
	private Date created;
	private int balance;

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

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}