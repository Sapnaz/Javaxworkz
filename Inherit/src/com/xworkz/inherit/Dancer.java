package com.xworkz.inherit;

public class Dancer {
	public void use(Belt belt)
	{
		belt.tie();
		if(belt instanceof LeatherBelt)//check instanceof
		{
			LeatherBelt leatherBelt=(LeatherBelt)belt;
			leatherBelt.clip();
		}
	}
}
