//Country : name , continent, State:literal
//Declare a method to print details

class Country {
    private String name;
    private String continent;
    private State state;

    public Country(String name, String continent, State state)
	{
        this.name = name;
        this.continent = continent;
        this.state = state;
    }

    
    public void printDetails() 
	{
        System.out.println("Country Name: " + this.name);
        System.out.println("Continent: " + this.continent);
        if (this.state != null) {
            this.state.printDetails();
        } 
		else 
		{
            System.out.println("No state information available.");
        }
    }

}