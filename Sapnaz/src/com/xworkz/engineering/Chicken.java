package com.xworkz.engineering;

	public class Chicken extends Food{
	    int age;              
	    double weight;        
	    String breed;           
	    String color;           
	    boolean isEggLaying;   
	    int eggsLaid;           
	    boolean isVaccinated;   
	    String diet;            
	    boolean isFreeRange;    
	    double wingSpan;       

	    void cluck() {  
	        System.out.println("The chicken is clucking.");
	    }

	    void layEgg() {
	        if (isEggLaying) {
	            eggsLaid++;
	            System.out.println("The chicken laid an egg. Total eggs laid: " + eggsLaid);
	        } else {
	            System.out.println("This chicken doesn't lay eggs.");
	        }
	    }

	    void peck() {  
	        System.out.println("The chicken is pecking at the ground.");
	    }

	    void fly() { 
	        if (wingSpan > 0) {
	            System.out.println("The chicken flaps its wings and tries to fly.");
	        } else {
	            System.out.println("This chicken can't fly.");
	        }
	    }

	    void eat() {  
	        System.out.println("The chicken is eating its " + diet + " diet.");
	    }
	}

