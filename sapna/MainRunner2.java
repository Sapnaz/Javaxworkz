//Update the instance Variables and print for below classes
class Matrimony {
    String groomName;
    String brideName;
    String weddingDate;
}

class Application {
    String appName;
    String version;
    String developer;
}

class Fruit {
    String name;
    String color;
    double weight;
}

class Juice {
    String flavor;
    double volume;
    boolean isCold;
}

class Place {
    String name;
    String country;
    double area;
}

class AlcoholBrand {
    String brandName;
    double alcoholPercentage;
    String originCountry;
}

class Candy {
    String name;
    double weight;
    String flavor;
}

class Medicine {
    String name;
    String usage;
    double dosage;
}

class Food {
    String name;
    String type;
    double calories;
}
public class MainRunner2 {
    public static void main(String[] args) {
        // Matrimony
        Matrimony matrimony = new Matrimony();
        matrimony.groomName = "John Doe";
        matrimony.brideName = "Jane Smith";
        matrimony.weddingDate = "2024-12-01";
		
		//update
		matrimony.groomName = "Amith";
		matrimony.brideName = "Nitha";
		matrimony.weddingDate = "2024-10-14";
		
        System.out.println("Matrimony Groom: " + matrimony.groomName); 
		System.out.println("Bride: " + matrimony.brideName);
		System.out.println("Wedding Date: " + matrimony.weddingDate);

        // Application
        Application application = new Application();
        application.appName = "ChatGPT";
        application.version = "1.0";
        application.developer = "OpenAI";
		
		//update
		application.appName = "Google";
        application.version = "2.0";
        application.developer = "AI";
		
        System.out.println("Application - Name: " + application.appName);
		System.out.println("Version: " + application.version);
		System.out.println("Developer: " + application.developer);

        // Fruit
        Fruit fruit = new Fruit();
        fruit.name = "Apple";
        fruit.color = "Red";
        fruit.weight = 0.15;
		
		//updatefruit.name = "Mango";
        fruit.color = "Yellow";
        fruit.weight = 0.20;
		
        System.out.println("Fruit - Name: " + fruit.name );
		System.out.println("Color: " + fruit.color );
		System.out.println("Weight: " + fruit.weight + " kg");

        // Juice
        Juice juice = new Juice();
        juice.flavor = "Orange";
        juice.volume = 250.0;
        juice.isCold = true;
		
		//updatejuice.flavor = "WaterMelon";
        juice.volume = 100.0;
        juice.isCold = false;
		
        System.out.println("Juice - Flavor: " + juice.flavor);
		System.out.println("Volume: " + juice.volume );
		System.out.println(" ml, Is Cold: " + juice.isCold);

        // Place
        Place place = new Place();
        place.name = "Paris";
        place.country = "France";
        place.area = 105.4;
		
		//place
		place.name = "IstanBul";
        place.country = "Turkey";
        place.area = 200;
		
        System.out.println("Place - Name: " + place.name);
		System.out.println("Country: " + place.country);
		System.out.println("Area: " + place.area + " sq km");

        // AlcoholBrand
        AlcoholBrand alcoholBrand = new AlcoholBrand();
        alcoholBrand.brandName = "Jack Daniel's";
        alcoholBrand.alcoholPercentage = 40.0;
        alcoholBrand.originCountry = "USA";
		
		//update
		alcoholBrand.brandName = "Old Monk";
        alcoholBrand.alcoholPercentage = 60.0;
        alcoholBrand.originCountry = "London";
        System.out.println("AlcoholBrand - Brand Name: " + alcoholBrand.brandName);
		System.out.println("Alcohol Percentage: " + alcoholBrand.alcoholPercentage);
		System.out.println("Origin Country: " + alcoholBrand.originCountry);

        // Candy
        Candy candy = new Candy();
        candy.name = "Snickers";
        candy.weight = 0.05;
        candy.flavor = "Chocolate";
		
		//update
		candy.name = "wafers";
        candy.weight = 0.10;
        candy.flavor = "Vanilla";
		
        System.out.println("Candy - Name: " + candy.name);
		System.out.println("Weight: " + candy.weight+ " kg");
		System.out.println("Flavor: " + candy.flavor);

        // Medicine
        Medicine medicine = new Medicine();
        medicine.name = "Aspirin";
        medicine.usage = "Pain relief";
        medicine.dosage = 500.0;
		
		//update
		medicine.name = "Paracetamol";
        medicine.usage = "Fever Tablet";
        medicine.dosage = 600.0;
		
        System.out.println("Medicine - Name: " + medicine.name);
		System.out.println("Usage: " + medicine.usage);
		System.out.println("Dosage: " + medicine.dosage + " mg");

        // Food
        Food food = new Food();
        food.name = "Pizza";
        food.type = "Fast Food";
        food.calories = 300.0;
		
		//update
		food.name = "Burger";
        food.type = "Junk";
        food.calories = 200.0;
		
        System.out.println("Food - Name: " + food.name );
		System.out.println("Type: " + food.type);
		System.out.println("Calories: " + food.calories + " kcal");
    }
}
