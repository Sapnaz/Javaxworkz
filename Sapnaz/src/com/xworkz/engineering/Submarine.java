package com.xworkz.engineering;

public class Submarine {

	private String name;
	private String type;
	private int depth;
	private float length;
	private boolean nuclearPowered;

	private int crewCapacity;
	private float weight;
	private int numberOfTorpedoes;
	private float speed;
	private String manufacturer;
	private String countryOfOrigin;
	private int operationalYear;
	private boolean hasStealthTechnology;
	private int missileCapacity;
	private String propulsionSystem;
	private float maxRange;
	private boolean hasSatelliteCommunication;
	private String sonarType;
	private boolean equippedWithDivingSuit;
	private boolean hasEscapePods;
	private int numberOfDecks;
	private String hullMaterial;
	private boolean equippedWithMedicalFacility;
	private int numberOfLifeboats;
	private boolean hasAntiAircraftSystem;
	private float fuelCapacity;
	private float waterDisplacement;
	private boolean hasAirConditioning;
	private String navigationSystem;
	private boolean equippedWithRadar;
	private int numberOfSensors;
	private boolean hasNightVision;
	private String onboardWeapons;
	private boolean hasHelipad;
	private float cost;
	private boolean hasIntegratedCombatSystem;
	private boolean equippedWithDefensiveCountermeasures;
	private String camouflagePattern;
	private boolean hasAdvancedTrainingFacilities;
	private float onboardStorageCapacity;
	private String propulsionType;

	// Constructor
	public Submarine(String name, String type, int depth, float length, boolean nuclearPowered) {
		System.out.println("Submarine created");
		this.name = name;
		this.type = type;
		this.depth = depth;
		this.length = length;
		this.nuclearPowered = nuclearPowered;
	}

	public void sapna(int crewCapacity, float weight, int numberOfTorpedoes, float speed, String manufacturer,
			String countryOfOrigin, int operationalYear, boolean hasStealthTechnology, int missileCapacity,
			String propulsionSystem, float maxRange, boolean hasSatelliteCommunication, String sonarType,
			boolean equippedWithDivingSuit, boolean hasEscapePods, int numberOfDecks, String hullMaterial,
			boolean equippedWithMedicalFacility, int numberOfLifeboats, boolean hasAntiAircraftSystem,
			float fuelCapacity, float waterDisplacement, boolean hasAirConditioning, String navigationSystem,
			boolean equippedWithRadar, int numberOfSensors, boolean hasNightVision, float cost, boolean hasIntegratedCombatSystem,
			boolean equippedWithDefensiveCountermeasures, String camouflagePattern,
			boolean hasAdvancedTrainingFacilities, float onboardStorageCapacity, String propulsionType) {
		this.crewCapacity = crewCapacity;
		this.weight = weight;
		this.numberOfTorpedoes = numberOfTorpedoes;
		this.speed = speed;
		this.manufacturer = manufacturer;
		this.countryOfOrigin = countryOfOrigin;
		this.operationalYear = operationalYear;
		this.hasStealthTechnology = hasStealthTechnology;
		this.missileCapacity = missileCapacity;
		this.propulsionSystem = propulsionSystem;
		this.maxRange = maxRange;
		this.hasSatelliteCommunication = hasSatelliteCommunication;
		this.sonarType = sonarType;
		this.equippedWithDivingSuit = equippedWithDivingSuit;
		this.hasEscapePods = hasEscapePods;
		this.numberOfDecks = numberOfDecks;
		this.hullMaterial = hullMaterial;
		this.equippedWithMedicalFacility = equippedWithMedicalFacility;
		this.numberOfLifeboats = numberOfLifeboats;
		this.hasAntiAircraftSystem = hasAntiAircraftSystem;
		this.fuelCapacity = fuelCapacity;
		this.waterDisplacement = waterDisplacement;
		this.hasAirConditioning = hasAirConditioning;
		this.navigationSystem = navigationSystem;
		this.equippedWithRadar = equippedWithRadar;
		this.numberOfSensors = numberOfSensors;
		this.hasNightVision = hasNightVision;
		this.onboardWeapons = onboardWeapons;
		this.hasHelipad = hasHelipad;
		this.cost = cost;
		this.hasIntegratedCombatSystem = hasIntegratedCombatSystem;
		this.equippedWithDefensiveCountermeasures = equippedWithDefensiveCountermeasures;
		this.camouflagePattern = camouflagePattern;
		this.hasAdvancedTrainingFacilities = hasAdvancedTrainingFacilities;
		this.onboardStorageCapacity = onboardStorageCapacity;
		this.propulsionType = propulsionType;
	}

	public void display() {
		System.out.println("Submarine Details:");
		System.out.println("Name: " + this.name);
		System.out.println("Type: " + this.type);
		System.out.println("Depth: " + this.depth + " meters");
		System.out.println("Length: " + this.length + " meters");
		System.out.println("Nuclear Powered: " + this.nuclearPowered);
		System.out.println("Crew Capacity: " + this.crewCapacity);
		System.out.println("Weight: " + this.weight + " tons");
		System.out.println("Number of Torpedoes: " + this.numberOfTorpedoes);
		System.out.println("Speed: " + this.speed + " knots");
		System.out.println("Manufacturer: " + this.manufacturer);
		System.out.println("Country of Origin: " + this.countryOfOrigin);
		System.out.println("Operational Year: " + this.operationalYear);
		System.out.println("Has Stealth Technology: " + this.hasStealthTechnology);
		System.out.println("Missile Capacity: " + this.missileCapacity);
		System.out.println("Propulsion System: " + this.propulsionSystem);
		System.out.println("Max Range: " + this.maxRange + " km");
		System.out.println("Has Satellite Communication: " + this.hasSatelliteCommunication);
		System.out.println("Sonar Type: " + this.sonarType);
		System.out.println("Equipped with Diving Suit: " + this.equippedWithDivingSuit);
		System.out.println("Has Escape Pods: " + this.hasEscapePods);
		System.out.println("Number of Decks: " + this.numberOfDecks);
		System.out.println("Hull Material: " + this.hullMaterial);
		System.out.println("Equipped with Medical Facility: " + this.equippedWithMedicalFacility);
		System.out.println("Number of Lifeboats: " + this.numberOfLifeboats);
		System.out.println("Has Anti-Aircraft System: " + this.hasAntiAircraftSystem);
		System.out.println("Fuel Capacity: " + this.fuelCapacity + " liters");
		System.out.println("Water Displacement: " + this.waterDisplacement + " tons");
		System.out.println("Has Air Conditioning: " + this.hasAirConditioning);
		System.out.println("Navigation System: " + this.navigationSystem);
		System.out.println("Equipped with Radar: " + this.equippedWithRadar);
		System.out.println("Number of Sensors: " + this.numberOfSensors);
		System.out.println("Has Night Vision: " + this.hasNightVision);
		System.out.println("Onboard Weapons: " + this.onboardWeapons);
		System.out.println("Has Helipad: " + this.hasHelipad);
		System.out.println("Cost: $" + this.cost);
		System.out.println("Has Integrated Combat System: " + this.hasIntegratedCombatSystem);
		System.out.println("Equipped with Defensive Countermeasures: " + this.equippedWithDefensiveCountermeasures);
		System.out.println("Camouflage Pattern: " + this.camouflagePattern);
		System.out.println("Has Advanced Training Facilities: " + this.hasAdvancedTrainingFacilities);
		System.out.println("Onboard Storage Capacity: " + this.onboardStorageCapacity + " cubic meters");
		System.out.println("Propulsion Type: " + this.propulsionType);
	}
}
