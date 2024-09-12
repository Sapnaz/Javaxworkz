package com.xworkz.datatypes;

//Object/Class Block
public class Bottle {
	int num;

	{
		System.out.println("Object block is called.");
		num = 100; // Initialize instance variable
	}

	public Bottle() {
		System.out.println("Constructor is called.");
	}

	public void display() {
		System.out.println("The value of num is: " + num);
	}
}
