package com.xworkz.monday.interfacesRunner;

import com.xworkz.monday.interfaces.KSR;
import com.xworkz.monday.interfaces.RailwayImplementation;

public class RailwayRulesRunner {

	public static void main(String[] args) {
		KSR ksr=new RailwayImplementation();
		ksr.avoidCarryingProhibitedItems();
		ksr.avoidMisuseOfEmergencyChain();
		ksr.avoidDangerousTravel();
		ksr.avoidRestrictedAreas();
		ksr.carryValidTicket();
		ksr.display();
		ksr.followBoardingSafety();
		ksr.followQueueDiscipline();
		ksr.followRailwayStaffInstructions();
		ksr.followTrainTimings();
		ksr.maintainCleanliness();
		ksr.noSmoking();
		ksr.useDesignatedCrossings();
		ksr.respectReservedSeating();

	}

}
