public class Test {
    public static void main(String[] args) {
        Main.цыган();

        Main auto1 = new Main(128, "Skoda", "Rapid");
        Main auto2 = new Main(256, "Skoda", "бекьярис");

        auto1.test();
        auto1.hehe(20);

        System.out.println("Rok virobi: " + auto1.rokVyroby + " Auticko: " + auto1.znackaAuta + " Modelik: " + auto1.modelAuta);
        System.out.println("Rok virobi: " + auto2.rokVyroby + " Auticko: " + auto2.znackaAuta + " Modelik: " + auto2.modelAuta);
    }
}