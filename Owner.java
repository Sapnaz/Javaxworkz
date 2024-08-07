//Association as literals
//Owner : name,age,gender : constructor
//Declare a method to print details

class Owner
{
	String name;
	int age;
	String gender;
	Owner(String name,int age,String gender)
	{
	this.name=name;
	this.age=age;
	this.gender=gender;
	}
    public void printOwnerDetails() 
	{
        System.out.println("Owner Name: " + this.name + ", Age: " + this.age + ", Gender: " + this.gender);
    }
}
	




