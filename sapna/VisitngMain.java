class VisitingMain {
    public static void main(String[] args) {
        System.out.println("Running main in VisitingMain");

        if (args.length == 4) {
            String shape = args[0];
            String colour = args[1];
            String price = args[2];
            String size = args[3];

            // Convert price to float
            double convertedPrice = Double.parseDouble(price);

            // Assuming VisitingCard.info is a static method
            VisitingCard.info(shape, colour, convertedPrice, size);
        
		}
		else 
		{
            System.out.println("Not enough or too many arguments provided.");
        }
	}
}
