package ua.step.java10;

import java.util.Date;

public class Player {
	private String name;
	private String description;
	private Date registration1;

	public Player(String name, Date registration) {
		super();
		this.name = name;
		this.registration1 = registration;
	}

	public String getName() {
		return name;
	}

	public Date getRegistration() {
		return registration1;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}