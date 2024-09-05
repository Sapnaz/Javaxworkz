package com.xworkz.inherit;

public class Bakery {
	private String name;
	private String location;
	private String type;
	
	public Bakery()
	{
		System.out.println("created bakery with no arguments");
	}
	public Bakery(String name,String location,String type)
	{
		super();
		this.name=name;
		this.location=location;
		this.type=type;
		System.out.println("created bakery");
	}
	public void bakes()
	{
		System.out.println("Running bakes in bakery");
	}
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.location);
		System.out.println(this.type);
		
		
	}
	
}
