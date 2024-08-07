class CompanyRunner
{
    public static void main(String[] args) 
	{
        SoftwareEngineer engineer = new SoftwareEngineer("Sapna","Fresher", "SoftwareDeveloper", 80000);
        Company company = new Company(101, "Tech Solutions", "India", engineer);
        company.printDetails();
	}
}