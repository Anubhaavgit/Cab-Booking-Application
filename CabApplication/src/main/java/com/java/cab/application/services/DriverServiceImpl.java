package com.java.cab.application.services;

import java.util.List;

import com.java.cab.application.dao.DriverDao;
import com.java.cab.application.entities.Coordinate;
import com.java.cab.application.entities.CabDriver;

public class DriverServiceImpl implements DriverService {

	DriverDao driverDao = new DriverDao();

	@Override
	public List<CabDriver> getList() {
		return driverDao.getList();
	}

	@Override
	public void addDriver(String name, char gender, int age, String carName, String carNumber, Coordinate location,
			boolean status,int earnings) {
		driverDao.addUser(name, gender, age, carName, carNumber, location, status,earnings);
	}

}
