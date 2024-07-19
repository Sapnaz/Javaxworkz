class DeliveryVehicle
{
	public static void deliver(String item,String location)
	{
		System.out.println("Running deliver from DeliveryVehicle");
		Company.deliver(item,location);
	}
}
