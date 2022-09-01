package com.java.cab.application.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CabDriver {

	@Id
	@Column(length = 50)
	private String name;

	private char gender;
	private int age;
	private String carName;
	private String carNumber;
	private Coordinate location;
	private boolean status;
	private int earnings;
	public String getName() {
		return name;
	}

	public CabDriver(String name, char gender, int age, String carName, String carNumber, Coordinate location,
			boolean status, int earnings) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.carName = carName;
		this.carNumber = carNumber;
		this.location = location;
		this.status = status;
		this.earnings=earnings;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public Coordinate getLocation() {
		return location;
	}

	public void setLocation(Coordinate location) {
		this.location = location;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getEarnings() {
		return earnings;
	}

	public void setEarnings(int earnings) {
		this.earnings = earnings;
	}
}
