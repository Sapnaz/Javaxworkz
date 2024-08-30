public class Keybunch 
{
    String material;
    Key key;

    public Keybunch(String material, Key key) 
	{
        this.material = material;
        this.key = key;
    }

    public void details() 
	{
        System.out.println("Keybunch - Material: " + material );
		this.key.details();
		
    }
}
