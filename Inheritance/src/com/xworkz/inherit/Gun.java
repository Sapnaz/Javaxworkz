package src.com.xworkz.inherit;
//Gun -->private name,countryMade,type, fire(),display();

//Soldier:local var,Police: paramater,Dboss:instance variable,Godse: return-type

//WashingMachine ---> brand,type,capacity, rinse(),show();


//Megha:local var,Lakshmi: paramater,Abhishek:instance variable,Bhukima: return-type ,Nayana: local var

//Own type --> three variables, two methods

//Own 4 classes to use as local,paramater,instance and return-type
public class Gun {
	private String name;
	private String countryMade;
	private String type;
	
	public Gun(String name,String countryMade, String type)
	{
		this.name=name;
		this.countryMade=countryMade;
		this.type=type;
		System.out.println("Gun Created");
	}
	public void fire()
	{
		System.out.println("created fire");
		
	}
	public void display()
	{
		system.out.println(this.name);
		system.out.println(this.countryMade);
		system.out.println(this.type);
	}
}
