package ua.step.java10;

import java.util.Date;

public class Player {
	private String name;
	private Date registration;
	public Player(String name, Date registration) {
		super();
		this.name = name;
		this.registration = registration;
	}
	public String getName() {
		return name;
	}
	public Date getRegistration() {
		return registration;
	}
	
}
