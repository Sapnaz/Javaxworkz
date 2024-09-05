package com.xworkz.inheritRunner;

import com.xworkz.inherit.WashingMachine;
import com.xworkz.inherit.Abhishek;
import com.xworkz.inherit.Lakshmi;

import com.xworkz.inherit.Megha;

public class washingmachineRunner {

	public static void main(String[] args) {
		WashingMachine washingmachine=new WashingMachine();
		washingmachine.rinse();
		washingmachine.show();
		
		Megha megha=new Megha();
		megha.wash();
		
		Lakshmi lakshmi=new Lakshmi();
		lakshmi.dry(washingmachine);
		
		Abhishek abhishek=new Abhishek();
		abhishek.soak(washingmachine);
		
		Bhoomika bhoomika=new bhoomika();
		bhoomika.dry();
		
		Nayana nayana=new Nayana();
		nayana.spin(washingmachine);
				
	}

}
