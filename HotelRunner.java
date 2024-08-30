class HotelRunner
{
	public static void main(String[] args) 
	{
        Owner owner1 = new Owner("Sapna",21, "Female");
        Hotel1 hotel = new Hotel1("Trivik", owner1);
        hotel.printHotelDetails();

	}
}
