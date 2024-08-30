package src.com.xworkz.inherit;

public class Navya {

	Bakery bakery;
	public void cleans()
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
