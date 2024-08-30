//Chocolate: brand,price,flavour,size

class Chocolate {
     String brand;
     double price;
     String flavour;
     String size;

    public Chocolate(String brand, double price, String flavour, String size) {
        this.brand = brand;
        this.price = price;
        this.flavour = flavour;
        this.size = size;
    }

    public static Chocolate createChocolate(String brand, double price, String flavour, String size) {
        return new Chocolate(brand, price, flavour, size);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setDefaultValues() {
        this.brand = "Default Brand";
        this.price = 0.0;
        this.flavour = "Default Flavour";
        this.size = "Default Size";
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Price: $" + price + ", Flavour: " + flavour + ", Size: " + size);
    }

    public static void main(String[] args) {
        Chocolate chocolate1 = new Chocolate("Cadbury", 2.5, "Milk", "100g");
        chocolate1.displayInfo();

        Chocolate chocolate2 = Chocolate.createChocolate("Nestle", 3.0, "Dark", "150g");
        chocolate2.displayInfo();

        Chocolate chocolate3 = new Chocolate(null, 0.0, null, null);
        chocolate3.setBrand("Hershey's");
        chocolate3.setPrice(2.0);
        chocolate3.setFlavour("White");
        chocolate3.setSize("120g");
        chocolate3.displayInfo();

        Chocolate chocolate4 = new Chocolate(null, 0.0, null, null);
        chocolate4.setDefaultValues();
        chocolate4.displayInfo();
    }
}