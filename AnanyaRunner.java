public class AnanyaRunner {
    public static void main(String[] args) {
        Knife knife1 = new Knife(100, 200);
        Ananya1 ananya1 = new Ananya1("7899861534", knife1);

        Knife knife2 = new Knife(250, 35);
        Ananya1 ananya2 = new Ananya1("9590661895", knife2);

        ananya1.details();
        ananya2.details();
    }
}
