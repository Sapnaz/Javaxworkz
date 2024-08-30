//Knife--> weight,height--> init this using Const
//declare details()
//Ananya---> mobile,Knife --->init this using Const
//declare details()

public class Knife 
{
    int weight;
    int height;

    public Knife(int weight, int height) 
	{
        this.weight = weight;
        this.height = height;
    }

    public void details() 
	{
        System.out.println("Knife - Weight: " + weight + "g, Height: " + height + "cm");
    }
}
