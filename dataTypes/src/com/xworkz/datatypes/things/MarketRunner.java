package com.xworkz.datatypes.things;

import com.xworkz.datatypes.OnlineMarket;
import com.xworkz.datatypes.SuperMarket;

public class MarketRunner {
	public static void main(String[] args) {

		SuperMarket supermarket= new SuperMarket("Kr Market", "Chickpet", "Vegtable", "All");
		supermarket.show();
		System.out.println("--------------------");
		SuperMarket supermarket1= new SuperMarket("City Market", " Dharmaraya Swamy Temple Rd", "food", "All");
		supermarket1.show();
		System.out.println("--------------------");

		OnlineMarket onlinemarket= new OnlineMarket("Cloths");
		onlinemarket.show();
		System.out.println("--------------------");

		OnlineMarket onlinemarket1= new OnlineMarket("Fruits");
		onlinemarket1.show();

	}
}
