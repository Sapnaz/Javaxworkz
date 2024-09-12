package com.xworkz.datatypes;
// Static Block
public class Chips {
	static int num;

	static {
		System.out.println("Static block is called.");
		num = 42; // Initialize static variable
	}

	public static void display() {
		System.out.println("The value of num is: " + num);
	}
}
