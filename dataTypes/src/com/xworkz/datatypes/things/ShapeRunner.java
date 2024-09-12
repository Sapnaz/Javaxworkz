package com.xworkz.datatypes.things;

import com.xworkz.datatypes.Shape;

public class ShapeRunner {

		    public static void main(String[] args) {
		        Shape shape = new Shape();
		        System.out.println("Circle Area: " + shape.area(5));         // Circle area
		        System.out.println("Rectangle Area: " + shape.area(5, 10));  // Rectangle area
		        System.out.println("Triangle Area: " + shape.area(5, 10, "triangle")); // Triangle area
		    }
		}






