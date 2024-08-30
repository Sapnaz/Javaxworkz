package com.xworkz.engineering;

public class SandalRunner {

	public static void main(String[] args) {

		        Sandal[] sandals = new Sandal[5];
		        sandals[0] = new Sandal("Bata", 'M', 799.99, "Black");
		        sandals[1] = new Sandal("Nike", 'L', 1599.49, "White");
		        sandals[2] = new Sandal("Adidas", 'S', 1299.99, "Blue");
		        sandals[3] = new Sandal("Puma", 'M', 899.99, "Red");
		        sandals[4] = new Sandal("Reebok", 'L', 1199.49, "Green");

		        Market[] markets = new Market[5];
		        markets[0] = new Market("Sarojini", "Delhi");
		        markets[1] = new Market("Dadar", "Mumbai");
		        markets[2] = new Market("Chickpet", "Bangalore");
		        markets[3] = new Market("Lajpat Nagar", "Delhi");
		        markets[4] = new Market("T Nagar", "Chennai");

		        SideDish[] sideDishes = new SideDish[5];
		        sideDishes[0] = new SideDish("Paneer Tikka", 250.00, "Vegetarian");
		        sideDishes[1] = new SideDish("Chicken Wings", 300.00, "Non-Vegetarian");
		        sideDishes[2] = new SideDish("Aloo Tikki", 100.00, "Vegetarian");
		        sideDishes[3] = new SideDish("Fish Fry", 350.00, "Non-Vegetarian");
		        sideDishes[4] = new SideDish("Samosa", 50.00, "Vegetarian");

		        for (Sandal sandal : sandals) {
		            if (sandal != null) {
		                sandal.show();
		            } else {
		                System.out.println("Data is null");
		            }
		        }

		        for (Market market : markets) {
		            if (market != null) {
		                market.show();
		            } else {
		                System.out.println("Data is null");
		            }
		        }

		        for (SideDish sideDish : sideDishes) {
		            if (sideDish != null) {
		                sideDish.show();
		            } else {
		                System.out.println("Data is null");
		            }
		        }
		    }
	}


