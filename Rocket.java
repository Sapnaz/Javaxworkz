// Rocket: country,speed,fuelCapacity,noOfThrusters
class Rocket {
     String country;
     String speed;
     double fuelCapacity;
     int noOfThrusters;

    public Rocket(String country, String speed, double fuelCapacity, int noOfThrusters) {
        this.country = country;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
        this.noOfThrusters = noOfThrusters;
    }

    public static Rocket createRocket(String country, String speed, double fuelCapacity, int noOfThrusters) {
        return new Rocket(country, speed, fuelCapacity, noOfThrusters);
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setNoOfThrusters(int noOfThrusters) {
        this.noOfThrusters = noOfThrusters;
    }

    public void setDefaultValues() {
        this.country = "Default Country";
        this.speed = "Default Speed";
        this.fuelCapacity = 0.0;
        this.noOfThrusters = 0;
    }

    public void displayInfo() {
        System.out.println("Country: " + country + ", Speed: " + speed + ", Fuel Capacity: " + fuelCapacity + " tons, No. of Thrusters: " + noOfThrusters);
    }

    public static void main(String[] args) {
        // Using Constructor
        Rocket rocket1 = new Rocket("USA", "25,000 km/h", 500.0, 4);
        rocket1.displayInfo();

        // Using Static Factory Method
        Rocket rocket2 = Rocket.createRocket("Russia", "27,000 km/h", 450.0, 3);
        rocket2.displayInfo();

        // Using Setters
        Rocket rocket3 = new Rocket(null, null, 0.0, 0);
        rocket3.setCountry("India");
        rocket3.setSpeed("30,000 km/h");
        rocket3.setFuelCapacity(600.0);
        rocket3.setNoOfThrusters(5);
        rocket3.displayInfo();

        // Using Direct Assignment (Literals)
        Rocket rocket4 = new Rocket(null, null, 0.0, 0);
        rocket4.setDefaultValues();
        rocket4.displayInfo();
    }
}