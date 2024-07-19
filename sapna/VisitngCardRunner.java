//wrapper classes
class VisitingCardMain
{
	public static void main(String[] args)
	{
		System.out.println("Running main in VisitingCardMain");
		{
			if(args.length==4)
			{
				String shape=args[0];
				String colour=args[1];
				String price=args[2];//into float :info
				String size=args[3];
				
			
			//wrapper class
			 float convertedPrice=Float.parseFloat(price);//jre-->lib-->rt.java-->Float.class
			 VisitingCard.info(shape,colour,convertedPrice,size);
				
			}
		}
		
		
		
	}
}