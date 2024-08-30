//Clip --> color,type --> init this using Const
//declare details()
//Ganavi---> email,Clip--> init this using Const
//declare details()

class Clip 
{
    String color;
    String type;

    public Clip(String color, String type) 
	{
        this.color = color;
        this.type = type;
    }

    public void details() 
	{
        System.out.println("Clip - Color: " + color + ", Type: " + type);
    }
}
