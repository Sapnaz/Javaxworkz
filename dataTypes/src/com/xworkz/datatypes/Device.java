package com.xworkz.datatypes;

	// Trying to extend the final class
		class Device extends Chip {   // This will cause a compilation error
		    public void display() {
		        System.out.println("This is a sports car.");
		    }
		}

