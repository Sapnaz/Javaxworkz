package com.xworkz.engineering;

public class ChickenRunner {
	
	    public static void main(String[] args) {
	       
	        Chicken chicken = new Chicken();
	        chicken.name = "Henrietta";
	        chicken.age = 2;
	        chicken.weight = 3.5;
	        chicken.breed = "Leghorn";
	        chicken.color = "White";
	        chicken.isEggLaying = true;
	        chicken.eggsLaid = 10;
	        chicken.isVaccinated = true;
	        chicken.diet = "corn";
	        chicken.isFreeRange = true;
	        chicken.wingSpan = 1.2;

	        chicken.cluck();
	        chicken.layEgg();
	        chicken.peck();
	        chicken.fly();
	        chicken.eat();
	        chicken.showDetails();

	       
	        Food f = new Chicken();
	        f.name = "Clucky";
	        
	        Chicken castedChicken = (Chicken) f;
	        castedChicken.age = 3;
	        castedChicken.weight = 4.2;
	        castedChicken.breed = "Rhode Island Red";
	        castedChicken.color = "Red";
	        castedChicken.isEggLaying = false;
	        castedChicken.eggsLaid = 0;
	        castedChicken.isVaccinated = false;
	        castedChicken.diet = "grains";
	        castedChicken.isFreeRange = false;
	        castedChicken.wingSpan = 0.9;

	        castedChicken.cluck();
	        castedChicken.layEgg();
	        castedChicken.peck();
	        castedChicken.fly();
	        castedChicken.eat();
	        f.showDetails();
	    }
	}
