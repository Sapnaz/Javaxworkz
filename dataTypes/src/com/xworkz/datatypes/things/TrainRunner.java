package com.xworkz.datatypes.things;

import com.xworkz.datatypes.MetroTrain;
import com.xworkz.datatypes.SubUrbanTrain;

public class TrainRunner {

		public static void main(String[] args) {

			MetroTrain metrotrain= new MetroTrain(62309, "Ksr Bangalore", "Dharmapuri");
			metrotrain.display();
			System.out.println("_______________");

			MetroTrain metrotrain1= new MetroTrain(62309, "Salem", "Coimbatore");
			metrotrain1.display();
			System.out.println("_______________");

			SubUrbanTrain suburbantrain= new SubUrbanTrain(626701, "Salem");
			suburbantrain.display();
			System.out.println("_______________");

			SubUrbanTrain suburbantrain1= new SubUrbanTrain(62708, "Thirupathur");
			suburbantrain1.display();


		}
	}

