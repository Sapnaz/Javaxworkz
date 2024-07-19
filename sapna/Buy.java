class Buy
{
public static void product(String brand,double price )
	{
		System.out.println(" product is running in Buy");
			if(price>500 && price<1000)
				{
					System.out.println("brand:"+brand+"  price:"+price);
				}
			else
				{
					System.out.println("out of range");
				}
	}
public static void product(String name,int quantity,String quality,double price)
	{
		System.out.println(" product with 4 parameters is running in Buy");
		if(price<0 && quantity<0)
				{
					System.out.println(" give compatible values");
				}
			else
				{
					System.out.println("name:"+name+"  quantity:"+quantity+"  quality:"+quality+"  price:"+price);
				}
				
	}
public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
	{
		System.out.println("bookMovieTicket is running in Buy");
		if(price>0 && quantity>0 && quantity<100)
		{
		System.out.println("name:"+name+"  theaterNam:"+theaterName+"  quantity:"+quantity+"  price:"+price);
		}
		System.out.println("incompatible values");

	}
public static void buyEgg(int total,double pricePerEgg)
	{
		System.out.println("buyEgg is running in Buy");
		if(total<10 && pricePerEgg>10)
		{
		System.out.println("total:"+total+"  pricePerEgg:"+pricePerEgg);
		}
		System.out.println("values not suitable");
		
	}
public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate)
	{
		System.out.println("buyShampoo is running in Buy");
		if(price>3)
		{
		System.out.println("value does not match");
		}
		System.out.println("quantityInMl:"+quantityInMl+"  price:"+price+"  brand:"+brand+"  manfDate:"+manfDate);

	}
public static void buyCake(char size,String type,String flavour,double cost,int quantity)
	{
		System.out.println("buyCake is running in Buy");
		if(quantity<1 && cost<0)
		{
		System.out.println("values does not match");
		}
		System.out.println("size:"+size+"  type:"+type+"  flavour:"+flavour+"  cost:"+cost+"  quantity:"+quantity);


	}
public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
	{
		System.out.println("buyLaptop is running in Buy");
		if(ramSize<6 && price >500000)
		{
		System.out.println(" do not buy");
		}
		System.out.println("brand:"+brand+"  serialNo:"+serialNo+"  price:"+price+"  batteryCapacity:"+batteryCapacity+"  screenSize:"+screenSize+"  os:"+os+"  harddiskSize:"+harddiskSize+"  ramSize:"+ramSize);

	}
public static void buySmartWatch(String brand,double price,int color,char type,int mode)
	{
		System.out.println("buySmartWatch is running in Buy");
		if(color>2)
		{
		System.out.println("multicolors available");
		}
		System.out.println("brand:"+brand+"  price:"+price+" color:"+color+" type:"+type+" mode:"+mode);
	
	}
}
