//State: name,language: constructor CapitalCity : literal
//Declare a method to print details

class State 
{
    String name;
    String language;
    CapitalCity capitalCity;

    State(String name, String language, CapitalCity capitalCity) 
	{
     this.name = name;
     this.language = language;
     this.capitalCity = capitalCity;
    }

    public void printDetails()
	{
        System.out.println("State Name: " + this.name);
        System.out.println("Language: " + this.language);
        this.capitalCity.printDetails();
        
    }
}
