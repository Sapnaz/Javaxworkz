package com.xworkz.engineering;

public class Plant 
{
	private float height;
	private int age;
	private String species;
	private int leaf_count;
	private float root_depth;
	private String color;
	private float growth_rate;
	private float water_requirement;
	private float sunlight_requirement;
	private String flowering_season;
	
	public Plant(float height,int age,String species,int leaf_count,float root_depth,String color,float growth_rate,float water_requirement,float sunlight_requirement,String flowering_season)
	{
		System.out.println("Created palnt");
		this.height=height;
		this.age=age;
		this.species=species;
		this.leaf_count=leaf_count;
		this.root_depth=root_depth;
		this.color=color;
		this.growth_rate=growth_rate;
		this.water_requirement=water_requirement;
		this.sunlight_requirement=sunlight_requirement;
		this.flowering_season=flowering_season;

	}
	
	public void display()
	{
		
	System.out.println("Height :"+this.height);
	System.out.println("Age :"+this.age);
	System.out.println("Specie :"+this.species);
	System.out.println("Leaf_Count :"+this.leaf_count);
	System.out.println("Root_Depth :"+this.root_depth);
	System.out.println("Color :"+this.color);
	System.out.println("Growth_rate :"+this.growth_rate);
	System.out.println("water_requirement :"+this.water_requirement);
	System.out.println("Sunlight_Requirement :"+this.sunlight_requirement);
	System.out.println("Flowering_Season :"+this.flowering_season);

	}
}
