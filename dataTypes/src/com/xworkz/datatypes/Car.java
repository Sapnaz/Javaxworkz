package com.xworkz.datatypes;

public class Car {
	String brand;
	String model;
	int year;

	public Car() {

		this("Unknown", "Unknown", 2024);
		System.out.println("Default Car constructor called.");
	}

	public Car(String brand) {

		this(brand, "Unknown", 2024);
		System.out.println("Car brand: " + brand);
	}

	Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		System.out.println("Car: " + brand + " " + model + " " + year);
	}
}
