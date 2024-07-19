//Declare country class with Below methods
// Method to take states: String[] : 29
// Methos to take pincode: int[]: 10
// Method to take primeminister:String[]: All
// Method to take Cabinet ministers:String[]: 30
// Method to take political parties:String[]: 5
// Above methods print in backward direction
class Country
{
	public static void states()
	{
	System.out.println("running states in Country :");
	String[] stateNames={"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", 
	"Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand","Karnataka", "Kerala", "Madhya Pradesh",
	"Maharashtra", "Manipur","Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab","Rajasthan", 
	"Sikkim", "Tamil Nadu", "Telangana", "Tripura","Uttar Pradesh", "Uttarakhand", "West Bengal"};

	for(int states=stateNames.length -1;states>=0;states--)
		{
			String ref=stateNames[states];
			System.out.println("statename :"+ ref);
		}
	}
	public static void pincode()
	{
	System.out.println("running pincode in Country");	
     int[] pinCodes = {
            500001, 791111, 781001, 800001, 492001,
            403001, 380001, 122001, 171001, 834001,
            560001, 695001, 462001, 400001, 795001,
            793001, 796001, 797112, 751001, 140001,
            302001, 737101, 600001, 500001, 799001,
            226001, 248001, 700001
        };
	for(int pins=10;pins >=0;pins--)
		{
		 int pin=pinCodes[pins];
		 System.out.println("pin name :"+pin);
		}
	}
	public static void PrimeMinister()
	{
        System.out.println("Prime Ministers of India:");
        String[] primeMinisters = {
            "Jawaharlal Nehru", "Lal Bahadur Shastri", "Indira Gandhi", "Morarji Desai", "Charan Singh",
            "Rajiv Gandhi", "Vishwanath Pratap Singh", "Chandra Shekhar", "P. V. Narasimha Rao", "Atal Bihari Vajpayee",
            "H. D. Deve Gowda", "I. K. Gujral", "Manmohan Singh", "Narendra Modi"
        };
		for(int ministers=0;ministers<primeMinisters.length;ministers++)
		{
			String ref=primeMinisters[ministers];
			System.out.println("prime minister :"+ref);
		}

	}
	public static void cabinetMinister() 
	{
        System.out.println("Cabinet Ministers of India:");
        String[] cabinetMinisters = {
            "Rajnath Singh", "Amit Shah", "Nitin Gadkari", "Nirmala Sitharaman", "Piyush Goyal",
            "Ravi Shankar Prasad", "Prakash Javadekar", "Hardeep Singh Puri", "Smriti Irani", "Dharmendra Pradhan",
            "Mansukh Mandaviya", "Jyotiraditya Scindia", "Anurag Thakur", "Ashwini Vaishnaw", "Sarbananda Sonowal",
            "Kiren Rijiju", "Ramdas Athawale", "Giriraj Singh", "Gajendra Singh Shekhawat", "Anurag Singh Thakur",
            "Jitendra Singh", "Ajay Bhatt", "Meenakshi Lekhi", "Subhash Sarkar", "Bhupender Yadav",
            "Purushottam Rupala", "Mukhtar Abbas Naqvi", "Kiren Rijiju"
        };
		for(int cm=cabinetMinisters.length -1;cm>=0;cm--)
		{
			String ref=cabinetMinisters[cm];
			
			System.out.println("cabinet ministers :"+ref);
		}
	}
	public static void politicalParties()
	{
        System.out.println("Political Parties in India:");
        String[] politicalParty = {
            "Bharatiya Janata Party (BJP)", "Indian National Congress (INC)", "Bahujan Samaj Party (BSP)",
            "Aam Aadmi Party (AAP)", "Communist Party of India (Marxist) (CPI(M))"
        };
		for(int parties=politicalParty.length -1;parties>=0;parties--)
		{
			String ref = politicalParty[parties];
			System.out.println("politicalParties :"+ref);
		}
	}
}


