package com.xworkz.monday.interfaces;

public class TrafficImplementation implements TrafficPolice {

	@Override
	public void checkSpeedLimit() {
		System.out.println("Running checkSpeedLimit");
	}

	@Override
	public void checkSeatBelt() {
		System.out.println("Running checkSeatBelt");
	}

	@Override
	public void checkTrafficSignal() {
		System.out.println("Running checkTrafficSignal");
	}

	@Override
	public void slowForSpeedBump() {
		System.out.println("Running slowForSpeedBump");
	}

	@Override
	public void checkHeadlights() {
		System.out.println("Running checkHeadlights");
	}

	@Override
	public void pedestrianCrossing() {
		System.out.println("Running pedestrianCrossing");
	}

	@Override
	public void checkDrunkDriving() {
		System.out.println("Running checkDrunkDriving");

	}

	@Override
	public void checkMobileUsage() {
		System.out.println("Running checkMobileUsage");
	}

	@Override
	public void checkLaneDiscipline() {
		System.out.println("Running checkLaneDiscipline");
	}

	@Override
	public void checkOvertaking() {
		System.out.println("Running checkOvertaking");
	}

	@Override
	public void checkHelmet() {
		System.out.println("Running checkHelmet");

	}

	@Override
	public void checkHornUsage() {
		System.out.println("running checkHornUsage");

	}

	@Override
	public void checkParking() {
		System.out.println("running checkParking");

	}

	@Override
	public void display() {
		System.out.println("running display");

	}

	@Override
	public void stopAtStopSign() {
		System.out.println("running stopAtStopSign");

	}

}