package com.xworkz.inherit;

public class WashingMachine {
	
			private String brand;
			private String type;
			private float price;
			
			public WashingMachine() {
				System.out.println("Washing machine with no args");
			}
			
			
			
			public WashingMachine(String brand, String type,float price) {
				super();
				this.brand = brand;
				this.type = type;
				this.price = price;
			}

			public static void rinse()
			{
				System.out.println("Running a rinse in Washing machine");
			}
			
			public void show()
			{
				System.out.println(this.brand);
				System.out.println(this.type);
				System.out.println(this.price);
			}
		
}


