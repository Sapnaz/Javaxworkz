class StateRunner
{
	 public static void main(String[] args) 
	 {
        CapitalCity capital = new CapitalCity("Bengaluru", 14008000);
        State state = new State("Karnataka", "Kannada",capital);
        state.printDetails();
	 }
}
   
    