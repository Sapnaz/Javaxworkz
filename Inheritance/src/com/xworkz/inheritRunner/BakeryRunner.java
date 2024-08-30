package src.com.xworkz.inheritRunner;

import src.com.xworkz.inherit.Ani;
import src.com.xworkz.inherit.Bakery;
import src.com.xworkz.inherit.Navya;
import src.com.xworkz.inherit.Raksha;
import src.com.xworkz.inherit.String;
import src.com.xworkz.inherit.sapna;

public class BakeryRunner {
		public class BakeryRunner {

			public static void main(String[] args) {
				Bakery bakery=new Bakery();
				bakery.bakes();
				bakery.display();
				
				sapna sapna=new sapna();
				sapna.Bakery()
				sapna.eat();
				
				Ani ani=new Ani();
				ani.chef(bakery);
				
				Navya navya=new Navya();
				navya.cleans();
				
				Raksha raksha=new Raksha();
				raksha.monitor(bakery);
						

			}

		}
	}

}
