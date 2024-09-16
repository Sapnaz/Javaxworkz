package com.xworkz.monday.interfaces;

public class HospitalRuleRunnerimplements implements GovtHospitalRule {

	@Override
	public boolean maintainSilence() {
		System.out.println("maintainSilence is running in HospitalRuleRunner");
		return false;
	}

	@Override
	public int visitorAllowed() {
		System.out.println("visitorAllowed is running in HospitalRuleRunner ");
		return 5;
	}

	@Override
	public boolean Serve() {
		System.out.println("Serve is running in HospitalRuleRunner");
		return false;
	}

	@Override
	public void display() {
		
		
	}
}
