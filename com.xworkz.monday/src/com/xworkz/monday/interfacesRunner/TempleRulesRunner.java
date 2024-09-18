package com.xworkz.monday.interfacesRunner;

import com.xworkz.monday.interfaces.KeralaTemples;
import com.xworkz.monday.interfaces.TempleImplementation;

public class TempleRulesRunner {
	public static void main(String[] args) {
		KeralaTemples keralaTemples=new TempleImplementation();
		keralaTemples.Display();
		keralaTemples.avoidDisturbances();
		keralaTemples.dressModestly();
		keralaTemples.followTimings();
		keralaTemples.giveDonationsProperly();
		keralaTemples.maintainCleanliness();
		keralaTemples.maintainSilence();
		keralaTemples.noEatingInsideTemple();
		keralaTemples.noPhotography();
		keralaTemples.participateInPrayers();
		keralaTemples.removeFootwear();
	}
}

