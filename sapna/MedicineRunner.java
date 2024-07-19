class MedicineRunner

{
public static void main(String[]args)
{
	double ParacetamolPrice=MedicinePrice.medName("Paracetamol");
	System.out.println("ParacetamolPrice : "+ParacetamolPrice);
	double AcetazolamidePrice=MedicinePrice.medName("Acetazolamide");
	System.out.println("AcetazolamidePrice : "+AcetazolamidePrice);
	double SabrilPrice=MedicinePrice.medName("Sabril"); 
	System.out.println("SabrilPrice : "+SabrilPrice);
	double TopamaxPrice=MedicinePrice.medName("Topamax"); 
	System.out.println("TopamaxPrice : "+TopamaxPrice);
	double CiproPrice=MedicinePrice.medName("Cipro"); 
	System.out.println("CiproPrice : "+CiproPrice); 
	double CimziaPrice=MedicinePrice.medName("Cimzia");
	System.out.println("CimziaPrice : "+CimziaPrice);
 }
 }