public class Sapna3 {
    public static void method1() { 
        System.out.println("Method 1"); 
		Sapna3.method2();
    }
    
    public static void method2() { 
        System.out.println("Method 2"); 
		Sapna3.method1();
        
    }
    
   
       
}
