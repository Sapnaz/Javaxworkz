package com.xworkz.datatypes;

public class MaruthiMandir implements PGRule {

	@Override
	public double costPerMonth() {
		System.out.println("running costPerMonth");
		return 5000;
	}

	@Override
	public boolean wifi() {
		System.out.println("running wifi");
		return true;
	}

}
