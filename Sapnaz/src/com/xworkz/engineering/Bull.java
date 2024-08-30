package com.xworkz.engineering;

public class Bull extends Product {
    int age;                
    double weight;        
    String breed;           
    boolean isTrained;     
    String color;           

    void graze() 
    {  
        System.out.println("The bull is grazing.");
    }

    void roar() 
    {  
        System.out.println("The bull is roaring.");
    }

    void run() 
    {  
        System.out.println("The bull is running.");
    }

    void pullCart() 
    {  
        System.out.println("The bull is pulling a cart.");
    }

    void plowField() 
    { 
        System.out.println("The bull is plowing the field.");
    }
}

