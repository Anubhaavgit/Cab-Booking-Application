package com.java.cab.application.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@Column(length = 50)
	private String name;

	private char gender;
	private int age;
	private Coordinate location;
	private Coordinate destination;

	public String getName() {
		return name;
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

	public Coordinate getLocation() {
		return location;
	}

	public void setLocation(Coordinate location) {
		this.location = location;
	}

	public Coordinate getDestination() {
		return destination;
	}

	public void setDestination(Coordinate destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", gender=" + gender + ", age=" + age + ", location=" + location
				+ ", destination=" + destination + "]";
	}

}
