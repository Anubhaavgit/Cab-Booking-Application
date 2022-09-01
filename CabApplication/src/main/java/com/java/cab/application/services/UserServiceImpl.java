package com.java.cab.application.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.cab.application.dao.UserDao;
import com.java.cab.application.entities.Coordinate;
import com.java.cab.application.entities.User;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	UserDao userDao = new UserDao();

	public List<User> getList() {
		return userDao.getList();
	}

	@Override
	public void addUsers(String name, char gender, int age) {
		userDao.addUser(name, gender, age);
	}

	@Override
	public void updateUserLocation(String name, Coordinate location) {
		userDao.updateUserLocation(name, location);

	}

	@Override
	public void findRide(String name, Coordinate location, Coordinate destination) {
		userDao.findRide(name, location, destination);

	}

}
