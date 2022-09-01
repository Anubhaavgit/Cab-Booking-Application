package com.java.cab.application.services;

import java.util.List;

import com.java.cab.application.entities.Coordinate;
import com.java.cab.application.entities.CabDriver;

public interface DriverService {
	public List<CabDriver> getList();

	public void addDriver(String name, char gender, int age, String carName, String carNumber, Coordinate location,
			boolean status,int earnings);
}
