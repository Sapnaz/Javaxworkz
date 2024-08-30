package com.xworkz.engineering;


public class Product extends Bulb {
    int wattage; 

    void turnOn()
    { 
        System.out.println("The bulb is now on, consuming " + wattage + " watts.");
    }
}

