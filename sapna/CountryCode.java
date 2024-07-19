class CountryCode {
    public static String code(int code) {
        System.out.println("Running code in CountryCode");
        if (code == 91)
		{
            return "India";
        } 
		else if (code == 971)
		{
            return "United Arab Emirates";
        } 
		else if (code == 41)
		{
            return "Switzerland";
        } 
		else if (code == 33)
		{
            return "France";
        } 
		else if (code == 93) 
		{
            return "Afghanistan";
        } 
		else 
		{
            return "Unknown"; // Added return statement to handle all other cases
        }
    }
}