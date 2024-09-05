package com.xworkz.datatypes;

public class Gun {
		private String name;
		private String countryMade;
		private String type;

		public Gun() {
			System.out.println("creating a Gun with no args");
		}

		public Gun(String name, String countryMade, String type) {
			super();
			this.name = name;
			this.countryMade = countryMade;
			this.type = type;
		}

		public void fire() {
			System.out.println("Running a fire in Gun");
		}

		public void display()
		{
			System.out.println("Running a display in Gun");
			System.out.println(this.name);
			System.out.println(this.countryMade);
			System.out.println(this.type);
		}
	}

