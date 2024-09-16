package com.xworkz.monday.interfacesRunner;

import com.xworkz.monday.interfaces.AIT;
import com.xworkz.monday.interfaces.CollegeImplementation;

public class CollegeRulesRunner {

	public static void main(String[] args) {
		AIT ait =new CollegeImplementation();
		ait.attendClasses();
		ait.display();
		ait.followLabSafety();
		ait.followLibraryRules();
		ait.maintainCleanliness();
		ait.maintainDiscipline();
		ait.noMobilePhones();
		ait.noSmoking();
		ait.noSmoking();
		ait.participateInExtracurriculars();
		ait.wearUniform();
	}

}
