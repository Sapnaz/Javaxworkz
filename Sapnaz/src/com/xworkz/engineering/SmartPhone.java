package com.xworkz.engineering;

public class SmartPhone extends Gadget {
	    String brand;            
	    int storageCapacity;     
	    int batteryLife;         
	    double screenSize;       

	    void makeCall(String number)
	    {  
	        System.out.println("Calling " + number + " using the " + brand + " smartphone.");
	    }

	    void takePhoto() 
	    { 
	        System.out.println("Taking a photo with the " + screenSize + "-inch screen smartphone.");
	    }
	}



