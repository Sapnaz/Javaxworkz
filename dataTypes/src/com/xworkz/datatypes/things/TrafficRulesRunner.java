package com.xworkz.datatypes.things;

import com.xworkz.datatypes.BengaluruRules;
import com.xworkz.datatypes.RajajinagarTrafficRules;
import com.xworkz.datatypes.TrafficRules;

public class TrafficRulesRunner {
	public static void main(String[] args) {
		TrafficRules trafficRules = new RajajinagarTrafficRules();
		System.out.println(trafficRules.licenseNo());
		BengaluruRules bengaluruRules = new BengaluruRules();
		bengaluruRules.setRules(trafficRules);
		bengaluruRules.PoliceCheck();
	}

}
