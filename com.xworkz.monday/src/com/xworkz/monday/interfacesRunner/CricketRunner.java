package com.xworkz.monday.interfacesRunner;

import com.xworkz.monday.interfaces.BCCI;
import com.xworkz.monday.interfaces.CricketRule;
import com.xworkz.monday.interfaces.kaCricket;

public class CricketRunner {

	public static void main(String[] args) {
		CricketRule cricketRule=new kaCricket();
		BCCI bcci=new BCCI();
		bcci.setcricketRule(cricketRule);
		bcci.check();
	}

}
