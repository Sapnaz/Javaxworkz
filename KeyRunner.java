class KeyRunner1 
{
    public static void main(String[] args) 
	{
        Key key1 = new Key(50, "Ganavi");
        Keybunch keybunch1 = new Keybunch("Steel", key1);
        Key key2 = new Key(60, "Ananya");
        Keybunch keybunch2 = new Keybunch("Plastic", key2);
        System.out.println(keybunch1.details());
        System.out.println(keybunch2.details());
    }
}