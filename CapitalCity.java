//CapitalCity: name,population
//Declare a method to print details

class CapitalCity 
{
    String name;
    int population;

    public CapitalCity(String name, int population) 
	{
        this.name = name;
        this.population = population;
    }

    public void printDetails() 
	{
        System.out.println("Capital City Name: " + this.name);
        System.out.println("Population: " + this.population);
    }

 }
