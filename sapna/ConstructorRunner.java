//declare a class, add 3 instance varibles, one with literal
//create an instance of Jean , init non default varibles and print all varibles

class Charger
{
	char type='C';
	String colour;
	int quantity;
	public Charger()
	{
	System.out.println("Charger Created");
	}
}
class Claw
{
	int quantity=1;
	String colour;
	double price;
	public Claw()
	{
	System.out.println("Claw Created");
	}
}
class Crow
{
    String colour="Black";
	String type;
	float weight;
	public Crow()
	{
	System.out.println("Crow Created");
	}
	
}
class Clock
{
	String brand="Ajanta";
	float weight;
	String type;
	public Clock()
	{
	System.out.println("Clock Created");
	}
}
class Lolipop
{
	String flavour="strawberry";
    int price;
	String brand;
	public Lolipop()
	{
	System.out.println("Lolipop Created");
	}
	
}
class Jean
{
	String brand="Rio";
	String colour;
	int size;
	public Jean()
	{
	System.out.println("Jean Created");
	}
}
class Keyboard
{
	String colour="Black";
	int keys;
	String brand;
	public Keyboard()
	{
	System.out.println("Keyboard Created");
	}
}
class Mountain
{
	String destination="hill station";
	float distance;
	String journey;
	public Mountain()
	{
	System.out.println("Mountain Created");
	}
}
class Stadium
{
	String location="Bengaluru";
	String name;
	float diameter;
	public Stadium()
	{
	System.out.println("Stadium Created");
	}
}
class Spray
{
	String brand="Camel";
	String colour;
	int quantity;
	public Spray()
	{
	System.out.println("Spray Created");
	}
}

class ConstructorRunner
{
	public static void main(String[] args)
	{
	System.out.println("Running ConstructorRunner");
	
	//charger
	Charger charger=new Charger();
	charger.colour="white";
	charger.quantity=1;
	System.out.println("charger :"+charger.type);
	System.out.println("charger :"+charger.colour);
	System.out.println("charger :"+charger.quantity);
	
	//claw
    Claw claw=new Claw();
	claw.colour="pink";
	claw.price=50;
	System.out.println("claw :"+claw.quantity);
	System.out.println("claw :"+claw.colour);
	System.out.println("claw :"+claw.price);
	
	//crow
	Crow crow=new Crow();
	crow.type="Bird";
	crow.weight=100;
	System.out.println("crow :"+crow.colour);
	System.out.println("crow :"+crow.type);
	System.out.println("crow :"+crow.weight+"g");
	
	//clock
	Clock clock=new Clock();
	clock.weight=200;
	clock.type="wall";
	System.out.println("clock :"+clock.brand);
	System.out.println("clock :"+clock.weight+"g");
	System.out.println("clock :"+clock.type);
	
	//Lolipop
	Lolipop lolipop=new Lolipop();
    lolipop.price=5;
	lolipop.brand="chupachup";
	System.out.println("lolipop :"+lolipop.flavour);
	System.out.println("lolipop :"+lolipop.price);
	System.out.println("lolipop :"+lolipop.brand);
	
	//jean
	Jean jean=new Jean();
	jean.colour="Blue";
	jean.size=26;
	System.out.println("jeans :"+jean.brand);
	System.out.println("jeans :"+jean.colour);
	System.out.println("jeans :"+jean.size);
	
	//keyboard
	Keyboard keyboard=new Keyboard();
	keyboard.keys=146;
	keyboard.brand="HP";
	System.out.println("keyboard :"+keyboard.colour);
	System.out.println("keyboard :"+keyboard.keys);
	System.out.println("keyboard :"+keyboard.brand);
	
	//mountain
	Mountain mountain=new Mountain();
	mountain.distance=1000;
	mountain.journey="Ladakh";
	System.out.println("mountain :"+mountain.destination);
	System.out.println("mountain :"+mountain.distance+"km");
	System.out.println("mountain :"+mountain.journey);
	
	//stadium
	Stadium stadium=new Stadium();
	stadium.name="Chinnaswamy";
	stadium.diameter=3000;
	System.out.println("stadium :"+stadium.location);
	System.out.println("stadium :"+stadium.name);
	System.out.println("stadium :"+stadium.diameter);
	
	//spray
	
	Spray spray=new Spray();
	spray.colour="gold";
	spray.quantity=2;
	System.out.println("spary :"+spray.brand);
	System.out.println("spary :"+spray.colour);
	System.out.println("spary :"+spray.quantity);


	
	
	}
	
}

