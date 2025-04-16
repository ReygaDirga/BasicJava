public class App {
    public static void main(String[] args) {
        Hewan h1 = new Singa("Simba");
        Hewan h2 = new Ular("Kobra");

        h1.info();
        h1.bersuara();
        h1.serang();

        System.out.println();

        h2.info();
        h2.bersuara();
        h2.serang();
    }
}
