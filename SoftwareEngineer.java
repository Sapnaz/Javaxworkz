//SoftwareEnginner: name,experience,designation,salary : constructor
//Declare a method to print details

class SoftwareEngineer {
    String name;
    String experience;
    String designation;
    double salary;

    public SoftwareEngineer(String name, String experience, String designation, double salary) 
	{
        this.name = name;
        this.experience = experience;
        this.designation = designation;
        this.salary = salary;
    }

    public void printDetails() 
	{
        System.out.println("Engineer Name: " + this.name);
        System.out.println("Experience: " + this.experience);
        System.out.println("Designation: " + this.designation);
        System.out.println("Salary: " + this.salary);
    }

   
}
