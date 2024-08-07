//Company : id,name,location: constructor ,SoftwareEnginner:literal
//Declare a method to print details
class Company {
    int id;
    String name;
    String location;
    SoftwareEngineer softwareEngineer;

    public Company(int id, String name, String location, SoftwareEngineer softwareEngineer) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.softwareEngineer = softwareEngineer;
    }

    public void printDetails() 
	{
        System.out.println("Company ID: " + this.id);
        System.out.println("Company Name: " + this.name);
        System.out.println("Location: " + this.location);
       
        this.softwareEngineer.printDetails();
        
    }

    
}
