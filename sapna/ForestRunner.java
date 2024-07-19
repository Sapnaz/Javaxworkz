class ForestRunner {
    public static void main(String[] forestInfo) {
        System.out.println("Starting method");

        if (forestInfo.length == 4) {
            System.out.println("Taken 4 references");
            String name = forestInfo[0];
            String area = forestInfo[1];
            String establishedYear = forestInfo[2];
            String state = forestInfo[3];
            System.out.println("Name: " + name);
            System.out.println("Area: " + area);
            System.out.println("Established Year: " + establishedYear);
            System.out.println("State: " + state);
        } else {
            System.out.println("Not enough references");
        }

        System.out.println("Ending method");
    }
}
