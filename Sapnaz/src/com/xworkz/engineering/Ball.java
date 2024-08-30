package com.xworkz.engineering;

public class Ball {

	private String brand;
	private String color;
	private float radius;
	private String material;
	private String type;
	private int weight;
	private boolean isInflated;
	private float bounceHeight;

	private String manufacturer;
	private String countryOfOrigin;
	private String sportType;
	private String usage;
	private float diameter;
	private float circumference;
	private int airPressure;
	private int stitchCount;
	private String surfaceType;
	private String coreMaterial;
	private float price;
	private String retailLocation;
	private boolean isWaterResistant;
	private String durabilityRating;
	private boolean isOfficialSize;
	private boolean isOfficialWeight;
	private String recommendedAgeGroup;

	public Ball(String brand, String color, float radius, String material, String type, int weight, boolean isInflated,
			float bounceHeight) {
		System.out.println("Ball created");
		this.brand = brand;
		this.color = color;
		this.radius = radius;
		this.material = material;
		this.type = type;
		this.weight = weight;
		this.isInflated = isInflated;
		this.bounceHeight = bounceHeight;
	}

	public void Attributes(String manufacturer, String countryOfOrigin, String sportType, String usage, float diameter,
			float circumference, int airPressure, int stitchCount, String surfaceType, String coreMaterial, float price,
			String retailLocation, boolean isWaterResistant, String durabilityRating, boolean isOfficialSize,
			boolean isOfficialWeight, String recommendedAgeGroup) {
		this.manufacturer = manufacturer;
		this.countryOfOrigin = countryOfOrigin;
		this.sportType = sportType;
		this.usage = usage;
		this.diameter = diameter;
		this.circumference = circumference;
		this.airPressure = airPressure;
		this.stitchCount = stitchCount;
		this.surfaceType = surfaceType;
		this.coreMaterial = coreMaterial;
		this.price = price;
		this.retailLocation = retailLocation;
		this.isWaterResistant = isWaterResistant;
		this.durabilityRating = durabilityRating;
		this.isOfficialSize = isOfficialSize;
		this.isOfficialWeight = isOfficialWeight;
		this.recommendedAgeGroup = recommendedAgeGroup;
	}

	public void display() {
		System.out.println("Ball Details:");
		System.out.println("Brand: " + this.brand);
		System.out.println("Color: " + this.color);
		System.out.println("Radius: " + this.radius + " cm");
		System.out.println("Material: " + this.material);
		System.out.println("Type: " + this.type);
		System.out.println("Weight: " + this.weight + " g");
		System.out.println("Is Inflated: " + this.isInflated);
		System.out.println("Bounce Height: " + this.bounceHeight + " m");

		System.out.println("Manufacturer: " + this.manufacturer);
		System.out.println("Country of Origin: " + this.countryOfOrigin);
		System.out.println("Sport Type: " + this.sportType);
		System.out.println("Usage: " + this.usage);
		System.out.println("Diameter: " + this.diameter + " cm");
		System.out.println("Circumference: " + this.circumference + " cm");
		System.out.println("Air Pressure: " + this.airPressure + " psi");
		System.out.println("Stitch Count: " + this.stitchCount);
		System.out.println("Surface Type: " + this.surfaceType);
		System.out.println("Core Material: " + this.coreMaterial);
		System.out.println("Price: $" + this.price);
		System.out.println("Retail Location: " + this.retailLocation);
		System.out.println("Is Water Resistant: " + this.isWaterResistant);
		System.out.println("Durability Rating: " + this.durabilityRating);
		System.out.println("Is Official Size: " + this.isOfficialSize);
		System.out.println("Is Official Weight: " + this.isOfficialWeight);
		System.out.println("Recommended Age Group: " + this.recommendedAgeGroup);
	}

}
