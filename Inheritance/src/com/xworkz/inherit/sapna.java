package com.xworkz.inherit;

public class Police {

	public void hold(Gun gun)
	{
		if(gun !=null)
		{
			gun.fire();
			gun.display();
		}
		else {
			System.out.println("Gun is Null");
		}

	}

}