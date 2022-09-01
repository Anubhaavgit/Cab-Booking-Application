package com.java.cab.application.dao;

import java.util.ArrayList;
import java.util.List;

import com.java.cab.application.entities.Coordinate;
import com.java.cab.application.entities.CabDriver;

public class DriverDao {
	private List<CabDriver> DriverList;

	public DriverDao() {
		DriverList = new ArrayList<>();
	}

	public List<CabDriver> getList() {
		return DriverList;
	}

	public void setList(List<CabDriver> list) {
		this.DriverList = list;
	}

	public void addUser(String name, char gender, int age, String carName, String carNumber, Coordinate location,
			boolean status,int earnings) {
		CabDriver driver1 = new CabDriver(name, gender, age, carName, carNumber, location, status,earnings);
		DriverList.add(driver1);
	}
}
