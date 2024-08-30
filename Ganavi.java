class Ganavi {
    String email;
    Clip clip;

    public Ganavi(String email, Clip clip) {
        this.email = email;
        this.clip = clip;
    }

    public void details() {
        System.out.println("Ganavi - Email: " + email );
		this.clip.details();
    }
}
