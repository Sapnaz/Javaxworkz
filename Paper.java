//Init properties using 4 different ways
//Declare a method to print all instance variables
//Create least 3 copies
//Speaker : brand,size,cost,output
//Paper : thickness,size,quality,color

class Paper {
     double thickness;
     String size;
     String quality;
     String color;

    public Paper(double thickness, String size, String quality, String color) {
        this.thickness = thickness;
        this.size = size;
        this.quality = quality;
        this.color = color;
    }

    public static Paper createPaper(double thickness, String size, String quality, String color) {
        return new Paper(thickness, size, quality, color);
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void setDefaultValues() {
        this.thickness = 0.1;
        this.size = "A4";
        this.quality = "Standard";
        this.color = "White";
    }

    public void displayInfo() {
        System.out.println("Thickness: " + thickness + "mm, Size: " + size + ", Quality: " + quality + ", Color: " + color);
    }

    public static void main(String[] args) {

        Paper paper1 = new Paper(0.2, "A3", "High", "Blue");
        paper1.displayInfo();

        Paper paper2 = Paper.createPaper(0.15, "Letter", "Premium", "Green");
        paper2.displayInfo();

        Paper paper3 = new Paper(0.0, null, null, null);
        paper3.setThickness(0.3);
        paper3.setSize("A5");
        paper3.setQuality("Low");
        paper3.setColor("Yellow");
        paper3.displayInfo();

        Paper paper4 = new Paper(0.0, null, null, null);
        paper4.setDefaultValues();
        paper4.displayInfo();
    }
}