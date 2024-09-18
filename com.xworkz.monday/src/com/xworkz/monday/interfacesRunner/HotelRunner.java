package com.xworkz.monday.interfacesRunner;

import com.xworkz.monday.interfaces.CanaraHotelRule;
import com.xworkz.monday.interfaces.FoodSafetyDepartment;
import com.xworkz.monday.interfaces.HotelRule;

public class HotelRunner {

	public static void main(String[] args) {
		HotelRule hotelRule=new CanaraHotelRule();
		FoodSafetyDepartment foodSafetyDepartrment=new FoodSafetyDepartment();
		foodSafetyDepartrment.inspection(hotelRule);
	}

}
