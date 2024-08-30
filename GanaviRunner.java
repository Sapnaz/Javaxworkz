class GanaviRunner {
    public static void main(String[] args) {
        Clip clip1 = new Clip("pink", "Paper");
        Ganavi ganavi1 = new Ganavi("ani@example.com", clip1);

        Clip clip2 = new Clip("Blue", "Binder");
        Ganavi ganavi2 = new Ganavi("sam@example.com", clip2);
        ganavi1.details();
        ganavi2.details();
    }
}
