package com.xworkz.inheritrunner;
import com.xworkz.inherit.Bike;
import com.xworkz.inherit.Car;

public class VehicleRunner {
	
	    public static void main(String[] args) {
	        Car car = new Car();
	        Bike bike = new Bike();

	        car.start();  // Inherited from Vehicle
	        car.drive();  // Specific to Car

	        bike.start(); 
	        bike.ride(); 
	    }
	}


