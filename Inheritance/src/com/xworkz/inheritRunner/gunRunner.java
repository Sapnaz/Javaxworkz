package src.com.xworkz.inheritRunner;

public class gunRunner {

	public static void main(String[] args) {
		Soldier soldier= new Soldier();
		soldier.have();
	
		
		Police police=new Police();
		Gun gun=new Gun("Glock 19", "Austria", "Handguns");
		police.worker(gun);
		
		
		Dboss dboss=new Dboss(gun);
		Gun gun1=new Gun("Uzi", "Israel", "Submachine gun");
		dboss.jail(gun1);
		
		
		Godse godse= new Godse();
		godse.freedomFighter();
		

	}

}
