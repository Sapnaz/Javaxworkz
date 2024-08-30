class Ananya1
 {
    String mobile;
    Knife knife;

    public Ananya(String mobile, Knife knife)
	{
        this.mobile = mobile;
        this.knife = knife;
    }

    public void details() {
        System.out.println("Ananya - Mobile: " + mobile); 
		this.knife.details();
    }
}
