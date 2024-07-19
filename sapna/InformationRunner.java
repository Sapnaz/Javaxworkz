class InformationRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in InformationRunner");
		{
			
			if(args.length==4)
			{
				String name=args[0];
				String mnfDate=args[1];
				String price=args[2];//into float :info
				String quantity=args[3];
				
			
			//wrapper class
			 int convertedPrice=Integer.parseInt(price);
			 int convertedquantity=Integer.parseInt(quantity);
			 MedicineInformation.info(name,mnfDate,convertedPrice,convertedquantity);
				
			}
		}
		
		
		
	}
}