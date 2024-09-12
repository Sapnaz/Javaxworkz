package com.xworkz.datatypes;
// (Method Overloading)
public class Shape {
	    //  area of a circle
	    public double area(double radius) {
	        return Math.PI * radius * radius;
	    }

	    // Overloaded method to calculate the area of a rectangle
	    public double area(double length, double width) {
	        return length * width;
	    }

	    public double area(double base, double height, String triangle) 
	    {
	        return 0.5 * base * height;
	    }
	}

	