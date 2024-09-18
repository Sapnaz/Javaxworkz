package com.xworkz.monday.interfaces;

public class FoodSafetyDepartment {
	public HotelRule hotelRule;
	public void inspection(HotelRule hotelRule) {
		this.hotelRule=hotelRule;
		System.out.println("Running inspection");
	}
}
