package src.com.xworkz.inheritRunner;

import src.com.xworkz.inherit.Lakshmi;
import src.com.xworkz.inherit.Megha;
import src.com.xworkz.inherit.WashingMachine;

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
