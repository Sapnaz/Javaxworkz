public class Bakes {
    public static void Cake()
	{ System.out.println("cake is baking");
	 Cookies();
	}
    public static void Cookies() 
	{ System.out.println("Cookies are baking");
	  Cake();
	}
}