package com.xworkz.datatypes;

public class LuluMall {
	public MallRule mallRule;

	public void setRule(MallRule mallRule) {
		this.mallRule = mallRule;
	}

	public void display() {
		if (mallRule != null) {
			boolean number = mallRule.validId();
			if (number)
				System.out.println("validId");
		} else {
			System.out.println("invalidId");
		}
	}
}
