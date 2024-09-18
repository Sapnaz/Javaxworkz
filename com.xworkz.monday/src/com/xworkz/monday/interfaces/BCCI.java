package com.xworkz.monday.interfaces;

public class BCCI {
	private CricketRule cricketRule;
	public void setcricketRule(CricketRule cricketRule)
	{
		this.cricketRule=cricketRule;
	}
	public void check()
	{
		System.out.println("running class");
		if(cricketRule!=null)
		{
			System.out.println("cricket is not null");
			cricketRule.powerPlay();
		}
		else
		{
			System.out.println("cricket is null");
		}
	}
}
