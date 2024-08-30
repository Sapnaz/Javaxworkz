//16 Real World Objects
//Declare below class , add three instance variables in each class
//Declare Explicit const with a Message
//Create the instance Print the default-values for below classes

class Rupee
{
	String currency;
	double price;
	String type;
	public Rupee()
	{
	 System.out.println("Rupee Created");
	}
}
class AirCondition
{ 
	String brand;
	int quantity;
	double price;
	public AirCondition()
	{
	 System.out.println("AirCondition Created");
	}
}
class AutoDriver
{
	String name;
	int age;
	int weight;
	public AutoDriver()
	{
	 System.out.println("AutoDriver Created");
	}
}
class Rapido
{	
	String name;
	int vehicleNo;
	double charge;
	public Rapido()
	{
	 System.out.println("Rapido Created");
	}
}
class CabCompany
{	
	String CompName;
	int VehicleNo;
	double charge;
	public CabCompany()
	{
	 System.out.println("CabCompany Created");
	}
}
class BMTC
{
	String destination;
	String colour;
	int busNo;
	public BMTC()
	{
	 System.out.println("BMTC Created");
	}
}
class FoodDeliveryCompany
{
	String name;
	String foodType;
	double price;
	public FoodDeliveryCompany()
	{
	 System.out.println("FoodDeliveryCompany Created");
	}
}
class MainRunner1
{
	public static void main(String[] args)
	{
		System.out.println("Running mainRunner");
		
		//Rupee()
		
		Rupee rupee=new Rupee();
		System.out.println("rupee :"+rupee.currency);
		System.out.println("rupee :"+rupee.price);
		System.out.println("rupee :"+rupee.type);
		rupee.currency="INR";
		rupee.price=100;
		rupee.type="Note";
		System.out.println("rupee :"+rupee.currency);
		System.out.println("rupee :"+rupee.price);
		System.out.println("rupee :"+rupee.type);
		
		//AirCondition() 
		
		AirCondition airConditioner=new AirCondition();
		System.out.println("airConditioner :"+airConditioner.brand);
		System.out.println("airConditioner :"+airConditioner.quantity);
		System.out.println("airConditioner :"+airConditioner.price);
		airConditioner.brand="WhirlPool";
		airConditioner.quantity=1;
		airConditioner.price=25000;
		System.out.println("airConditioner :"+airConditioner.brand);
		System.out.println("airConditioner :"+airConditioner.quantity);
		System.out.println("airConditioner :"+airConditioner.price);
		
		//AutoDriver()
		
		AutoDriver autoDriver=new AutoDriver();
		autoDriver.name="Arun";
		autoDriver.age=34;
		autoDriver.weight=75;
		System.out.println("autoDriver:"+autoDriver.name);
		System.out.println("autoDriver:"+autoDriver.age);
		System.out.println("autoDriver:"+autoDriver.weight);
		
		//Rapido()
		
		Rapido rapido=new Rapido();
		rapido.name="Nithin";
		rapido.vehicleNo=3456;
		rapido.charge=70;
		System.out.println("rapido:"+rapido.name);
		System.out.println("rapido:"+rapido.vehicleNo);
		System.out.println("rapido:"+rapido.charge);
		
		//CabCompany()
		
		CabCompany cabCompany=new CabCompany();
		cabCompany.CompName="Uber";
		cabCompany.VehicleNo=7865;
		cabCompany.charge=140;
		System.out.println("cabCompany:"+cabCompany.CompName);
		System.out.println("cabCompany:"+cabCompany.VehicleNo);
		System.out.println("cabCompany:"+cabCompany.charge);
		
		//BMTC()
		
		BMTC bmtc=new BMTC();
		System.out.println("bmtc:"+bmtc.destination);
		System.out.println("bmtc:"+bmtc.colour);
		System.out.println("bmtc:"+bmtc.busNo);
		bmtc.destination="Bengaluru";
		bmtc.colour="Red";
		bmtc.busNo=76594;
		System.out.println("bmtc:"+bmtc.destination);
		System.out.println("bmtc:"+bmtc.colour);
		System.out.println("bmtc:"+bmtc.busNo);
		 
		//FoodDeliveryCompany
		 
		FoodDeliveryCompany foodDeliveryCompany=new FoodDeliveryCompany();
		System.out.println("foodDeliveryCompany:"+foodDeliveryCompany.name);
		System.out.println("foodDeliveryCompany:"+foodDeliveryCompany.foodType);
		System.out.println("foodDeliveryCompany:"+foodDeliveryCompany.price);
		foodDeliveryCompany.name="Swiggy";
		foodDeliveryCompany.foodType="Vegetarian";
		foodDeliveryCompany.price=240;
		System.out.println("foodDeliveryCompany:"+foodDeliveryCompany.name);
		System.out.println("foodDeliveryCompany:"+foodDeliveryCompany.foodType);
		System.out.println("foodDeliveryCompany:"+foodDeliveryCompany.price);
		 		
	}
}