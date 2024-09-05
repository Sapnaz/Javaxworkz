package com.xworkz.inherit;

//Base class
class Laptop implements ElectronicDevice {
	public void turnOn() {
		System.out.println("Laptop is turning on...");
	}

	public void program() {
		System.out.println("Programming on Laptop...");
	}
}