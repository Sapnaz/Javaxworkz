package com.xworkz.engineering;

	public class Sweet extends Halwa 
	{
	    String flavor;           
	    int sweetnessLevel;      
	    boolean hasDryFruits;    

	    void prepare()
	    {  
	        System.out.println("Preparing " + flavor + " halwa with sweetness level " + sweetnessLevel + ".");
	    }

	    void serve()
	    {  
	        String dryFruitsText = hasDryFruits ? "with dry fruits" : "without dry fruits";
	        System.out.println("Serving " + flavor + " halwa " + dryFruitsText + ".");
	    }
	}

