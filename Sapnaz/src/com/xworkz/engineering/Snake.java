package com.xworkz.engineering;

public class Snake {
	private String name;
	private int length;
	private String type;

	public Snake(String name, int length, String type)
		{
		this.name=name;
		this.length=length;
		this.type=type;
		System.out.println("Created Snake");
		}
		
		public void display() {
			
			System.out.println("Name :"+this.name);
			System.out.println("Lentgh :"+this.length);
			System.out.println("Type :"+this.type);
			
		}
}
