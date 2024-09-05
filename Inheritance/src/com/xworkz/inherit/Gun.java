package com.xworkz.inherit;
//Gun -->private name,countryMade,type, fire(),display();
//Soldier:local var,Police: paramater,Dboss:instance variable,Godse: return-type
//WashingMachine ---> brand,type,capacity, rinse(),show();
//Megha:local var,Lakshmi: paramater,Abhishek:instance variable,Bhukima: return-type ,Nayana: local var
//Own type --> three variables, two methods
//Own 4 classes to use as local,paramater,instance and return-type

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
