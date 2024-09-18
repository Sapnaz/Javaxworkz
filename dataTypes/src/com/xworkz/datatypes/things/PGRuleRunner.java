package com.xworkz.datatypes.things;

import com.xworkz.datatypes.MaruthiMandir;
import com.xworkz.datatypes.PGRule;
import com.xworkz.datatypes.ShreePG;

public class PGRuleRunner {
	public static void main(String[] args) {
		PGRule pgrule = new MaruthiMandir();
		System.out.println(pgrule.costPerMonth());
		System.out.println(pgrule.wifi());
		ShreePG shreePG = new ShreePG();
		shreePG.display();
		shreePG.SetpgRule(pgrule);
	}
}
