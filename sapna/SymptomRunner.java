class SymptomRunner
{
	public static void main(String[] args)
	{
	String feverMedicine=Symptom.symptom("Fever");
	System.out.println("FeverMedicine : "+feverMedicine);
	String coughMedicine=Symptom.symptom("Cough");
	System.out.println("CoughMedicine : "+coughMedicine);
	String soreThroatMedicine=Symptom.symptom("Sore Throat");
	System.out.println("soreThroatMedicine : "+soreThroatMedicine);
	String diarrheaMedicine=Symptom.symptom("Diarrhea"); 
	System.out.println("diarrheaMedicine : "+diarrheaMedicine); 
	String medicine=Symptom.symptom("pain"); 
	System.out.println("painMedicine : "+medicine); 
	}
}