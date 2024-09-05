package com.xworkz.inheritrunner;

import com.xworkz.inherit.Belt;
import com.xworkz.inherit.Dancer;
import com.xworkz.inherit.LeatherBelt;

public class BeltRunner {

	public static void main(String[] args) {
		Belt belt1 = new Belt();
		LeatherBelt leatherbelt1=new LeatherBelt();
		Dancer dancer=new Dancer();
		System.out.println("using Belt");
		dancer.use(belt1);
		System.out.println("using LeatherBelt");
		dancer.use(leatherbelt1);
		
	}

}
