package com.xworkz.datatypes.things;

import com.xworkz.datatypes.LuluMall;
import com.xworkz.datatypes.MallRule;
import com.xworkz.datatypes.Prasanna;

public class MallRunner {
	public static void main(String[] args) {
		MallRule mallRule1 = new Prasanna();
		System.out.println(mallRule1.validId());
		LuluMall lulumall = new LuluMall();
		lulumall.setRule(mallRule1);
		lulumall.display();

	}

}
