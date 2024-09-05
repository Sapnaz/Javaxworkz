package com.xworkz.datatypes;

public class WashingMachine {
	
		private String brand;
		private String type;
		private int capacity;

		public WashingMachine() {
			System.out.println("Creating a washing machine with no args");
		}



		public WashingMachine(String brand, String type, int capacity) {
			super();
			this.brand = brand;
			this.type = type;
			this.capacity = capacity;
		}

		public void rinse()
		{
			System.out.println("Running a rinse in Washing machine");
		}

		public void show()
		{
			System.out.println(this.brand);
			System.out.println(this.type);
			System.out.println(this.capacity);
		}
	}

