package com.xworkz.datatypes;

//Static Block
public class Pen {
	// Static variable
	static int num;

	// Static block to initialize the static variable
	static {
		System.out.println("Static block is called.");
		num = 42; // Initialize static variable
	}

	// Static method
	public static void display() {
		System.out.println("The value of num is: " + num);
	}
}
