package com.xworkz.engineering;

public class SubmarineRunner {

	public static void main(String[] args) {

		Submarine submarine1 = new Submarine("USS Nautilus", "Attack Submarine", 300, 110.0f, true);
		Submarine submarine2 = new Submarine("HMS Vanguard", "Ballistic Missile Submarine", 500, 150.0f, true);
		Submarine submarine3 = new Submarine("K-141 Kursk", "Cruise Missile Submarine", 250, 120.0f, false);

		submarine1.sapna(100, 8500.0f, 20, 30.0f, "General Dynamics", "USA", 1954, true, 12, "Nuclear", 25000.0f, true,
				"Active", true, true, 3, "Steel", true, 4, true, 80000.0f, 25000.0f, true, "Advanced GPS", true, 20,
				true, 150000000, true, true, "Grey", true, 1000.0f, "Nuclear");

		submarine2.sapna(150, 16000.0f, 16, 25.0f, "Barrow-in-Furness", "UK", 1993, true, 16, "Nuclear", 20000.0f, true,
				"Advanced", true, true, 4, "Composite", true, 6, true, 90000.0f, 28000.0f, true,
				"Integrated Navigation", true, 25, true, 200000000, true, true, "Dark Blue", true, 2000.0f, "Nuclear");

		submarine3.sapna(90, 5000.0f, 18, 28.0f, "Sevmash", "Russia", 1994, true, 10, "Diesel-Electric", 18000.0f, true,
				"Standard", true, true, 2, "Titanium", false, 2, true, 60000.0f, 22000.0f, false, "Basic Navigation",
				false, 15, false, 120000000, false, false, "Green", false, 800.0f, "Diesel-Electric");

		Submarine[] submarines = new Submarine[3];
		submarines[0] = submarine1;
		submarines[1] = submarine2;
		submarines[2] = submarine3;

		for (Submarine sub : submarines) {
			sub.display(); 
			System.out.println(); // Adding a blank line for better readability
		}
	}
}
