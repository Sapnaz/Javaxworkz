package com.xworkz.monday.interfaces;

public interface TrafficRule {
	String vehicle = "Car";

	void checkSpeedLimit();

	void checkSeatBelt();

	void checkTrafficSignal();

	void slowForSpeedBump();

	void stopAtStopSign();

	void checkHeadlights();

	void pedestrianCrossing();
}
