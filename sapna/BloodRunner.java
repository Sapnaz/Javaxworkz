public class BloodRunner {
    public static void main(String[] args){
        System.out.println("runnig main method");
        String result=Blood.group("o+");
        System.out.println("Blood Group : "+result);

        System.out.println("runnig main method");
        String name=Blood.personName("sapna");
        System.out.println("Name : "+name);

        System.out.println("runnig main method");
        double cost=Blood.cost(1000);
        System.out.println("Cost : "+cost);

        System.out.println("runnig main method");
        char tested=Blood.hospitalTested('y');
        System.out.println("Tested : "+tested);

        System.out.println("runnig main method");
        boolean sick=Blood.sickness(false);
        System.out.println("Sick : "+sick);

        System.out.println("runnig main method");
        boolean donate=Blood.donate(true);
        System.out.println("Donate : "+donate);

    }
    
}