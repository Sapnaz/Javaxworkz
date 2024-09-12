package com.xworkz.inherit;

public class Police {
	public void worker(Gun gun)
	{
		if(gun !=null)
		{
			gun.fire();
			gun.display();
		}
		else
		{
			System.out.println("Work is Null");
		}
	}

}
