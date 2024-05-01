public class Main {
    public static void main(String[] args) {
        // jozo nema ulavu od prezentovania
        ZnamkyZiaka jozo = new ZnamkyZiaka(2, 2, 5);
        // milan ma ulavu od prezentovania
        ZnamkyZiaka milan = new ZnamkyZiaka(1, 3);
        System.out.println("Jozo ma znamky: vf: " + jozo.vf + ", obsah:" + jozo.obsah + ", prezentovanie:" + jozo.prezentovanie);
    }
}