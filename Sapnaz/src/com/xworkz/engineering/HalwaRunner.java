package com.xworkz.engineering;

public class HalwaRunner 
{
		    public static void main(String[] args)
		    {
	        
	        Halwa h = new Halwa();
	        h.name = "Gajar Halwa";
	       
	        Sweet p = new Sweet();
	        p.name = "Badam Halwa";
	        p.flavor = "Almond";
	        p.sweetnessLevel = 7;
	        p.hasDryFruits = false;
	        p.prepare();
	        p.serve();
	        p.showDetails();
	    }
	}



