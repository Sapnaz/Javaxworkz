
public class Sandal {

		String brand;
	    char size;
	    double cost;
	    String color;
	    Sandal(String brand, char size, double cost, String color) {
	        this.brand = brand;
	        this.size = size;
	        this.cost = cost;
	        this.color = color;
	    }
	    void show() {
	        System.out.println("Sandal [Brand: " + brand + ", Size: " + size + ", Cost: ₹" + cost + ", Color: " + color + "]");
	    }
	}
	class Market {
	    String name;
	    String location;

	    Market(String name, String location) {
	        this.name = name;
	        this.location = location;
	    }

	    void show() {
	        System.out.println("Market [Name: " + name + ", Location: " + location + "]");
	    }
	}

	class SideDish {
	    String name;
	    double price;
	    String type;

	    SideDish(String name, double price, String type) {
	        this.name = name;
	        this.price = price;
	        this.type = type;
	    }

	    void show() {
	        System.out.println("SideDish [Name: " + name + ", Price: ₹" + price + ", Type: " + type + "]");
	    }
	}

