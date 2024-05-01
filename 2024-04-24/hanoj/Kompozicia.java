public class Kompozicia {
    public static void main(String[] args) {
        Datum narodenie = new Datum(24, 4, 2000);
        Zamestnanec z = new Zamestnanec("Jozef Sedlak", narodenie, new Datum(8, 1, 2024));
        System.out.println(z.toString());
    }
}
