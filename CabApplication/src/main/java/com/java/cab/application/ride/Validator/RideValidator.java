package com.java.cab.application.ride.Validator;

import java.util.List;

import com.java.cab.application.bill.BillCalculator;
import com.java.cab.application.distance.Distance;
import com.java.cab.application.entities.CabDriver;
import com.java.cab.application.entities.User;



/*This Class check whether or not a ride is possible for the user 
and if possible, then it calculates the price and further proceedings.*/

public class RideValidator {
	
	public void rideValidation(List<User> UserList, List<CabDriver> DriverList ) {
		for (User user : UserList) {
			boolean flag = false;
			for (CabDriver driver : DriverList) {
				int price = 0;
				if (driver.getStatus()) {
					if (Distance.distanceCalculator(user.getLocation(), driver.getLocation()) <= 5) {
						driver.setStatus(false);
						flag = true;
						
						price = BillCalculator.calculateBill(user.getLocation(),user.getDestination());
						System.out.println("Ride started for "+user.getName());
						System.out.println("Price to be paid by "+ user.getName()+ " $"+(int)price);
						user.setLocation(user.getDestination());
						int earning=driver.getEarnings();
						driver.setEarnings(earning+price);
						driver.setStatus(true);
						break;
					}
				}
			}
			if (!flag) {
				System.out.println("No cab found for "+ user.getName());
			}
		}
	}
}
