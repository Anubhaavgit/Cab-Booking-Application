package com.java.cab.application.driver;

import java.util.List;

import com.java.cab.application.entities.CabDriver;
import com.java.cab.application.entities.Coordinate;
import com.java.cab.application.entities.User;
import com.java.cab.application.ride.Validator.RideValidator;
import com.java.cab.application.services.DriverServiceImpl;
import com.java.cab.application.services.UserServiceImpl;

public class Driver {

	UserServiceImpl userService = new UserServiceImpl();
	DriverServiceImpl driverService = new DriverServiceImpl();

	public void run() {
		userService.addUsers("Abhishek", 'M', 23);
		userService.addUsers("Rahul", 'M', 29);
		userService.addUsers("Nandini", 'F', 22);

		userService.updateUserLocation("Abhishek", new Coordinate(0, 0));
		userService.updateUserLocation("Rahul", new Coordinate(10, 0));
		userService.updateUserLocation("Nandini", new Coordinate(15, 6));

		driverService.addDriver("Driver1", 'M', 22, "Swift", "KA-01-12345", new Coordinate(10, 1), true,0);
		driverService.addDriver("Driver2", 'M', 29, "Swift", "KA-01-12345", new Coordinate(11, 10), true,0);
		driverService.addDriver("Driver3", 'M', 24, "Swift", "KA-01-12345", new Coordinate(5, 3), true,0);

		userService.findRide("Abhishek", new Coordinate(0, 0), new Coordinate(20, 1));
		userService.findRide("Rahul", new Coordinate(10, 0), new Coordinate(15, 3));
		userService.findRide("Nandini", new Coordinate(15, 6), new Coordinate(20, 4));

		List<User> UserList = userService.getList();
		List<CabDriver> DriverList = driverService.getList();

		RideValidator ride=new RideValidator();
		ride.rideValidation(UserList, DriverList);//To check for ride
		
		DriverList.stream().forEach(i->System.out.println(i.getName()+" earns"+" $"+i.getEarnings()));
	}
}
