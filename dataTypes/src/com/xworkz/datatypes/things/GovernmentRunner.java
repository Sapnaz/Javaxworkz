package com.xworkz.datatypes.things;

import com.xworkz.datatypes.CentralGovernment;
import com.xworkz.datatypes.StateGovernment;

public class GovernmentRunner {

			public static void main(String[] args) {

				StateGovernment stategovernment= new StateGovernment("TamilNadu", 234, "MK. Stalin", "Muthusamy");
				stategovernment.display(); 
				System.out.println("---------------");

				StateGovernment stategovernment1= new StateGovernment("Kerala", 140, "Pinarayi Vijayan", "EP. Jayarajan");
				stategovernment1.display();
				System.out.println("----------------");

				CentralGovernment centralgovernment= new CentralGovernment("Andhra Pradesh", 175);
				centralgovernment.display();
				System.out.println("----------------");

				CentralGovernment centralgovernment1= new CentralGovernment("Karnataka", 224);
				centralgovernment1.display();

			}
	}


