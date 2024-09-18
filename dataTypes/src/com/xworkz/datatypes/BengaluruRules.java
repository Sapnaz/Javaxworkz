package com.xworkz.datatypes;

public class BengaluruRules {
	public TrafficRules trafficrules;

	public void setRules(TrafficRules trafficrules) {
		this.trafficrules = trafficrules;
	}

	public void PoliceCheck() {

		if (trafficrules != null) {
			String number = trafficrules.licenseNo();
			if (number != null)
				System.out.println("valid licenseNo");
		} else {
			System.out.println("invalid licenseNo");
		}
	}
}
