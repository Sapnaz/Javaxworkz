package src.com.xworkz.inherit;

public class Dboss {
	private Gun gun;
	publiv void actor()
	{
		this.gun=gun;
	}
	public void jail()
	{
		if(gun !=null)
		{
			gun.fire();
			gun.display();
		}
		else
		{
			System.out.println("Gun Is Null");
		}
	}
}
