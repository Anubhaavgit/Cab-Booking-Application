package com.java.cab.application.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.java.cab.application.entities.Coordinate;
import com.java.cab.application.entities.User;

@Repository
public class UserDao {

	private List<User> UserList;

	public UserDao() {
		UserList = new ArrayList<>();
	}

	public List<User> getList() {
		return UserList;
	}

	public void setList(List<User> list) {
		this.UserList = list;
	}

	public void addUser(String name, char gender, int age) {
		User user1 = new User();
		user1.setName(name);
		user1.setAge(age);
		user1.setGender(gender);
		UserList.add(user1);
	}

	public void updateUserLocation(String name, Coordinate location) {
		for (User user : UserList) {
			if (user.getName() == name) {
				user.setLocation(location);
			}
		}
	}

	public void findRide(String name, Coordinate location, Coordinate destination) {
		for (User user : UserList) {
			if (user.getName() == name) {
				user.setDestination(destination);
			}
		}
	}
}
