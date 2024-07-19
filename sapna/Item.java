class Item {
    public static int itemName(String item) {
        System.out.println("Running itemName in Item");
        if (item=="laptop")
			{
            return 55000;
        } 
		else if (item=="phone") 
		{
            return 40000;
        } 
		else if (item=="TV")
			{
            return 50000;
        } 
		else if (item=="fridge") 
		{
            return 30000;
        } 
		else if (item=="oven")
		{
            return 10000;
        } 
		else
		{
		return 0;
		}
    }
}
