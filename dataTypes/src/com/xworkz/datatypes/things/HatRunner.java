package com.xworkz.datatypes.things;
import com.xworkz.datatypes.Hat;
import com.xworkz.datatypes.Rajkumar;
import com.xworkz.datatypes.Upendra;
import com.xworkz.datatypes.Yash;
public class HatRunner {

	public static void main(String[] args) {
		Upendra upendra=new Upendra();
		upendra.wear();//-->Hat-->shade(),color//local
		
		Yash yash=new Yash();
		Hat hat=new Hat();
		yash.tear(hat);//parameter
		
		Rajkumar rajkumar=new Rajkumar();
		Hat hat2=new Hat();
		rajkumar.hat=hat2;                  
		rajkumar.fold();//instance
	}

}
