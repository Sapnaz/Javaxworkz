//wrapper classes
//Declare a class with below method
// a.Method to take medicine information like name,manf date, price,c
//accept from main method and pass as arguments
// b.MEthod to take juice information like name,brand,flavour,price,quantity
//.Accept from main method and pass as arguments

class MedicineInformation {
    public static void info(String name, String mnfDate, double price, int quantity) {
        System.out.println("Running info in MedicineInformation");
        System.out.println("Name: " + name);
        System.out.println("ManufactureDate: " + mnfDate);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}




