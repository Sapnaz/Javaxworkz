package com.xworkz.datatypes;

public class ShreePG {
	PGRule pgRule;

	public void SetpgRule(PGRule pgRule) {
		this.pgRule = pgRule;
	}

	public void display() {
		if (pgRule != null) {
			double info = pgRule.costPerMonth();
			boolean info1 = pgRule.wifi();
			if (info1)
				System.out.println("display cost per month");
		} else {
			System.out.println("invalid");
		}
	}
}
