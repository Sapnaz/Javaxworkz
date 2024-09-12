package com.xworkz.datatypes.things;

import com.xworkz.datatypes.Pen;

public class PenRunner {
	public static void main(String[] args) {
		// Static block will be executed when the class is loaded, before creating any
		// object
		Pen.display(); // Output: Static block is called.

	}
}
