class PalaceRunner {
    public static void main(String[] palaceInfo) {
        System.out.println("Starting method");
        if (palaceInfo.length == 4) {
            System.out.println("Taken 4 references");
            String name = palaceInfo[0];
            System.out.println("Name: " + name);

            String location = palaceInfo[1];
            System.out.println("Location: " + location);

            String builtBy = palaceInfo[2];
            System.out.println("Built By: " + builtBy);

            String builtYear = palaceInfo[3];
            System.out.println("Built Year: " + builtYear);
        } else {
            System.out.println("Not enough references");
        }
        System.out.println("Ending method");
    }
}
