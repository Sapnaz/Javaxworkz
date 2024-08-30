package com.xworkz.datatypes;

public class Colgate {
	
		private String company;
		private boolean salt;
		
		public Colgate(String company)
		{
			this.company=company;
			System.out.println("Running Toothpaste");
		}
		
		public Colgate(String company,boolean salt)
		{
			this.company=company;
			this.salt=salt;
			System.out.println("Running Toothpaste");
		}
		
		public void display()
		{
			System.out.println("Running Display");
			System.out.println("company :"+this.company);
			System.out.println("salt :"+this.salt);
			
		}
	}


