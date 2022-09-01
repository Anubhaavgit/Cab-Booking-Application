package com.java.cab.application.services;

import java.util.List;

import com.java.cab.application.entities.Coordinate;
import com.java.cab.application.entities.User;

public interface UserService {
	public List<User> getList();

	public void addUsers(String name, char gender, int age);

	public void updateUserLocation(String name, Coordinate location);

	public void findRide(String name, Coordinate location, Coordinate destination);
}
