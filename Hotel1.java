//Hotel : name:literal, Owner:literal
//Declare a method to print details

class Hotel1 
{
    String name;
    Owner owner;
	
    Hotel1(String name, Owner owner) 
	{
        this.name = name;
        this.owner = owner;
    }

    public void printHotelDetails() 
	{
        System.out.println("Hotel Name: " + this.name);
		//if (this.owner != null) 
		//{
           this.owner.printOwnerDetails();
        //} 
		//else 
		//{
        //System.out.println("No owner information available.");
		//}
     }
		   
}
