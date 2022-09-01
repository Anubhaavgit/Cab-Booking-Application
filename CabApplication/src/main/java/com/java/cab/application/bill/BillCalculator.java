package com.java.cab.application.bill;

import com.java.cab.application.entities.Coordinate;

public class BillCalculator {
	public static int calculateBill(Coordinate location,Coordinate destination) {
		int x1 = location.getX();
		int x2 = destination.getX();
		int y1 = location.getY();
		int y2 = destination.getY();
		return (int)Math.ceil(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)));
	}
}
