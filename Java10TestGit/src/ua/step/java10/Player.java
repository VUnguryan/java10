package ua.step.java10;

import java.util.Date;

public class Player {
	private String name;
	private int age;
	private String sureName;
	private String about;
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
	
	public String getAge() {
		return age;
	}
	public String getAbout() {
		return about;
	}
	public String getSureName() {
		return surName;
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