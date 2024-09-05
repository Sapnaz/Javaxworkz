package com.xworkz.inheritrunner;

import com.xworkz.inherit.GamingLaptop;

public class ElectronicDeviceRunner {
	public static void main(String[] args) {
		GamingLaptop myLaptop = new GamingLaptop();
		myLaptop.turnOn(); // Inherited from Laptop and implemented from ElectronicDevice interface
		myLaptop.carry(); // Implemented from Portable interface
		myLaptop.program(); // Inherited from Laptop
		myLaptop.game(); // Specific to GamingLaptop
	}
}
