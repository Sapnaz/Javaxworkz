package com.xworkz.datatypes;

public class Yash {
	public void tear(Hat hat)// access var and methods
	{
		if (hat != null) {
			hat.shade();
			System.out.println(hat.color);
		} else {
			System.out.println("Hat is null");
		}
	}
}