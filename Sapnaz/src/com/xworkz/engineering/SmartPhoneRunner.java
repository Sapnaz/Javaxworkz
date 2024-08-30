package com.xworkz.engineering;

public class SmartPhoneRunner {

	public static void main(String[] args)
	{
		
		       
		        SmartPhone phone = new SmartPhone();
		        phone.name = "SmartPhone Model X";
		        phone.brand = "BrandX";
		        phone.storageCapacity = 128;
		        phone.batteryLife = 24;
		        phone.screenSize = 6.5;

		        phone.makeCall("123-456-7890");
		        phone.takePhoto();
		        phone.showDetails();

		        
		        Gadget p = new SmartPhone();
		        p.name = "SmartPhone Model Y";
		        ((SmartPhone)p).brand = "BrandY";
		        ((SmartPhone)p).storageCapacity = 256;
		        ((SmartPhone)p).batteryLife = 30;
		        ((SmartPhone)p).screenSize = 6.8;

		        ((SmartPhone)p).makeCall("987-654-3210");
		        ((SmartPhone)p).takePhoto();
		        p.showDetails();
		    }


	}


