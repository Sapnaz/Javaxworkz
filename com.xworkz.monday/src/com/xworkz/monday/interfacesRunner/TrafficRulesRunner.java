package com.xworkz.monday.interfacesRunner;

import com.xworkz.monday.interfaces.TrafficImplementation;
import com.xworkz.monday.interfaces.TrafficPolice;

public class TrafficRulesRunner {
	public static void main(String[] args) {
		TrafficPolice trafficPolice=new TrafficImplementation();
		trafficPolice.checkDrunkDriving();
		trafficPolice.checkHeadlights();
		trafficPolice.checkHelmet();
		trafficPolice.checkHornUsage();
		trafficPolice.checkLaneDiscipline();
		trafficPolice.checkMobileUsage();
		trafficPolice.checkOvertaking();
		trafficPolice.checkParking();
		trafficPolice.checkSeatBelt();
		trafficPolice.checkSpeedLimit();
		trafficPolice.checkTrafficSignal();
		trafficPolice.display();
		trafficPolice.pedestrianCrossing();
		trafficPolice.slowForSpeedBump();
		trafficPolice.stopAtStopSign();
		
			
	}
	
}
