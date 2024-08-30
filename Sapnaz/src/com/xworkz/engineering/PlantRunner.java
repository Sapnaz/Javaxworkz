package com.xworkz.engineering;

public class PlantRunner {

	public static void main(String[] args) {

		Plant rose = new Plant(150.0f, 5, "Rose", 200, 50.0f, "Red", 10.0f, 5.0f, 6.0f, "Spring");
		Plant tulip = new Plant(120.0f, 3, "Tulip", 100, 40.0f, "Yellow", 8.0f, 4.0f, 5.0f, "Summer");
		Plant sunflower = new Plant(180.0f, 7, "Sunflower", 300, 60.0f, "Yellow", 12.0f, 6.0f, 8.0f, "Autumn");

		Plant[] plants = new Plant[3];
		plants[0] = rose;
		plants[1] = tulip;
		plants[2] = sunflower;

		for (Plant plant : plants) {
			plant.display(); // Displaying the plant details
		}
	}
}
