//Create instance using each const , need to print all the references after creation of the instance
//Mask : double cost,char size,String material
//No parameter const
//Constructor to init cost
//Constructor to init size
//Constructor to init material
//Constructor to init cost ,size and material
//Constructor to init cost and size
class Mask {
    double cost;
    char size;
    String material;

    public Mask() {
        System.out.println("No parameter constructor called");
    }

    public Mask(double cost) {
        this.cost = cost;
        System.out.println("Constructor with cost parameter called");
    }


    public Mask(char size) {
        this.size = size;
        System.out.println("Constructor with size parameter called");
    }

    // Constructor to init material
    public Mask(String material) {
        this.material = material;
        System.out.println("Constructor with material parameter called");
    }

    // Constructor to init cost, size, and material
    public Mask(double cost, char size, String material) {
        this.cost = cost;
        this.size = size;
        this.material = material;
        System.out.println("Constructor with cost, size, and material parameters called");
    }

  
    public Mask(double cost, char size) {
        this.cost = cost;
        this.size = size;
        System.out.println("Constructor with cost and size parameters called");
    }


    public void printAttributes() {
        System.out.println("Mask [cost=" + cost + ", size=" + size + ", material=" + material + "]");
    }

    public static void main(String[] args) {
        Mask mask1 = new Mask();
        mask1.printAttributes();

        Mask mask2 = new Mask(30);
        mask2.printAttributes();

        Mask mask3 = new Mask('S');
        mask3.printAttributes();

        Mask mask4 = new Mask("Cotton");
        mask4.printAttributes();

        Mask mask5 = new Mask(20, 'S', "Silk");
        mask5.printAttributes();

        Mask mask6 = new Mask(25, 'S');
        mask6.printAttributes();
    }
}
