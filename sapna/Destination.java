class Paint
{
	public static void clean(String brand)
	{
		System.out.println("Running clean from paint with the string parameter");
		System.out.println("Brand:" + brand);
	}
	public static void brush(String brand,String colour)
	{
		System.out.println("Running brush from paint with the two string parameter");
		System.out.println("Brand:" + brand +"Colour:" + colour);
	}
	public static void broom(String brand,int price)
	{
		System.out.println("Running broom from paint with the string and int parameter ");
		System.out.println("Brand: " + brand + " Price: " + price);

	}
	public static void sweep(String color,String type,int price)
	{
		System.out.println("Running sweep from paint with the two string and int parameter ");
		System.out.println("Color: " + color + " Type: " + type + " Price: " + price);

	}
}
class Train
{
	public static void book(String source,String destination)
	{
		System.out.println("Running book from Train with two String Parameter");
		System.out.println("Source: "+source +"Destination: "+destination);
	}
	public static void book(String source,String destination,int quantity)
	{
		System.out.println("Running book from Train with two String and int Parameter");
		System.out.println("Source: "+source + "Destination: "+destination + "Quantity: "+quantity);
	}
	public static void book(String source,String destination,int quantity,int price)
	{
		System.out.println("Running book from Train with two String and two int Parameter");
		System.out.println("Source: "+source + "Destination: "+destination + "Quantity: "+quantity +"Price: "+ price);
	}
	public static void cancel(int ticketNo)
	{
		System.out.println("Running cancel from Train with int Parameter");
		System.out.println("Ticket no: "+ticketNo);
	}
	public static void cancel(String source,String destination)
	{
		System.out.println("Running cancel from Train with two String Parameter");
		System.out.println("Source: "+source +"Destination: "+destination);
	}
}
class Destination
{
	public static void paris (String name)
	{
		System.out.println("Running paris from Destination with String parameter");
		System.out.println("Name: "+name);
	}
	public static void london(int age)
	{
		System.out.println("Running london from Destination With int parameter");
		System.out.println("Age: "+age);
	}
	public static void dubai(long phoneNo)
	{
		System.out.println("Running dubai from Destination with long parameter");
		System.out.println("Phoneno: "+phoneNo);
	}
	public static void swizerLand(String transportation)
	{
		System.out.println("Running swizerLand from Destination with String parameter");
		System.out.println("Transportation: "+transportation);
	}
	public static void turkey(String stay)
	{
		System.out.println("Running turkey from Destination with String parameter");
		System.out.println( "Stay: "+ stay);
	}
	
	
}
