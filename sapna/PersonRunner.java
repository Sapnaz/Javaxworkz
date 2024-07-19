//Write a class with main method and pass below info
//1. Main to take information of a person: name,email,age,password
//2. Main to take information of a forest: name,area,establishedYear,state
//3. Main to take information of a palace: name,location,builtBy,buildYear

class PersonRunner {
    public static void main(String[] personInfo) {
        System.out.println("Starting method");

        if (personInfo.length == 4) 
		{
            System.out.println("Taken 4 references");
            String name = personInfo[0];
            System.out.println("Name: " + name);
            String email = personInfo[1];
            System.out.println("Email: " + email);
            String age = personInfo[2];
            System.out.println("Age: " + age);
            String password = personInfo[3];
            System.out.println("Password: " + password);
        }
		else 
		{
            System.out.println("Not enough references");
        }
        System.out.println("Ending method");
    }
}
