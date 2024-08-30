//Hotel : name:literal, Owner:literal
//Declare a method to print details

class Hotel 
{
    String name;
    Owner owner;
	
    public Hotel(String name, Owner owner) 
	{
        this.name = name;
        this.owner = owner;
    }

    public void printHotelDetails() 
	{
        System.out.println("Hotel Name: " + this.name);
        
    }

    
}
