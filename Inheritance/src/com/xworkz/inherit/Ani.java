package src.com.xworkz.inherit;

public class Ani {

	public void chef(Bakery bakery)
	{
		if(bakery != null)
		{
			Bakery.bakes();
			Bakery.display();
		}
		else 
		{
			System.out.println("Bakery is Null");
		}
	}
}
