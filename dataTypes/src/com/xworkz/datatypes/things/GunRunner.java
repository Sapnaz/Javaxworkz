package com.xworkz.datatypes.things;

import com.xworkz.datatypes.Dboss;
import com.xworkz.datatypes.Godse;
import com.xworkz.datatypes.Gun;
import com.xworkz.datatypes.Police;
import com.xworkz.datatypes.Soldier;

public class GunRunner {

	public static void main(String[] args) {
		
			Soldier soldier= new Soldier();
			soldier.use();
			System.out.println("----------");

			Police police=new Police();
			Gun gun=new Gun("Amw", "Russia", "Sinpper");
			police.hold(gun);
			
			Dboss dboss=new Dboss(gun);
			dboss.hide();
			
			Godse godse= new Godse();
			godse.work();

		}

	}


