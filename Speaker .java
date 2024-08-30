
class Speaker {
     String brand;
     String size;
     double cost;
     String output;

    // 1. Constructor
    public Speaker(String brand, String size, double cost, String output) {
        this.brand = brand;
        this.size = size;
        this.cost = cost;
        this.output = output;
    }

    // 2. Static Factory Method
    public static Speaker createSpeaker(String brand, String size, double cost, String output) {
        return new Speaker(brand, size, cost, output);
    }

    // 3. Setters for initialization
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    // 4. Direct assignment (Literals)
    public void setDefaultValues() {
        this.brand = "Default Brand";
        this.size = "Default Size";
        this.cost = 0.0;
        this.output = "Default Output";
    }

    // Method to display all instance variables
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Size: " + size + ", Cost: " + cost + ", Output: " + output);
    }

    public static void main(String[] args) {
        // Using Constructor
        Speaker speaker1 = new Speaker("Sony", "Medium", 150.0, "20W");
        speaker1.displayInfo();

        // Using Static Factory Method
        Speaker speaker2 = Speaker.createSpeaker("Bose", "Small", 200.0, "30W");
        speaker2.displayInfo();

        // Using Setters
        Speaker speaker3 = new Speaker(null, null, 0.0, null);
        speaker3.setBrand("JBL");
        speaker3.setSize("Large");
        speaker3.setCost(100.0);
        speaker3.setOutput("25W");
        speaker3.displayInfo();

        // Using Direct Assignment (Literals)
        Speaker speaker4 = new Speaker(null, null, 0.0, null);
        speaker4.setDefaultValues();
        speaker4.displayInfo();
    }
}