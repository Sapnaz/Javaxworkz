public class SanitizerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prem prem= new Prem();
		Prem prem = new Prem();
		prem.sanitize();
		
		Osama osama=new Osama();
		Sanitizer sanitizer = new Sanitizer("lifebuoy",30,150);

		Osama osama = new Osama();
		Sanitizer sanitizer = new Sanitizer("lifebuoy", 30, 150);
		osama.wash(sanitizer);


		Sanitizer sanitizer1 = new Sanitizer("Himalaya",55,300);
		Yashwanth yashwanth= new Yashwanth(sanitizer1);
		Yashwanth yashwanth1= new Yashwanth(sanitizer);


		Sanitizer sanitizer1 = new Sanitizer("Himalaya", 55, 300);
		Yashwanth yashwanth = new Yashwanth(sanitizer1);
		Yashwanth yashwanth1 = new Yashwanth(sanitizer);

		yashwanth.killGerms();
		yashwanth1.killGerms();

		Naga naga = new Naga();
		Sanitizer ref = naga.use();
		if (ref != null) {
			ref.show();
			ref.killGerms();

		}
	}

}
 

