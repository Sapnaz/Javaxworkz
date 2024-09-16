package com.xworkz.monday.interfacesRunner;

import com.xworkz.monday.interfaces.GovtHospitalRule;
import com.xworkz.monday.interfaces.HospitalRuleRunnerimplements;

public class HospitalRuleRunner {
	public static void main(String[] args) {
		GovtHospitalRule govtHospitalRule=new HospitalRuleRunnerimplements();
		govtHospitalRule.maintainSilence();
		govtHospitalRule.visitorAllowed();
		govtHospitalRule.Serve();
		System.out.println(govtHospitalRule.STATE);

	}
}
