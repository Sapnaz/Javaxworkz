// Projector: company,type,color,weight
class Projector {
     String company;
     String type;
     String color;
     double weight;

    public Projector(String company, String type, String color, double weight) {
        this.company = company;
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    public static Projector createProjector(String company, String type, String color, double weight) {
        return new Projector(company, type, color, weight);
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDefaultValues() {
        this.company = "Default Company";
        this.type = "Default Type";
        this.color = "Default Color";
        this.weight = 0.0;
    }

    public void displayInfo() {
        System.out.println("Company: " + company + ", Type: " + type + ", Color: " + color + ", Weight: " + weight + "kg");
    }

    public static void main(String[] args) {
        Projector projector1 = new Projector("Epson", "LCD", "White", 3.5);
        projector1.displayInfo();

        Projector projector2 = Projector.createProjector("BenQ", "DLP", "Black", 2.8);
        projector2.displayInfo();

        Projector projector3 = new Projector(null, null, null, 0.0);
        projector3.setCompany("Sony");
        projector3.setType("Laser");
        projector3.setColor("Gray");
        projector3.setWeight(4.0);
        projector3.displayInfo();

        Projector projector4 = new Projector(null, null, null, 0.0);
        projector4.setDefaultValues();
        projector4.displayInfo();
    }
}