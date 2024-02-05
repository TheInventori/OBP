public class Main {
    public static void main(String[] args) {
        Hello.myMethod();

        Hello auto1 = new Hello(2012, "Skoda", "Rapid");
        Hello auto2 = new Hello(2022, "Skoda", "Kamiq");
        
        // auto1.plnyPlyn();
        // auto1.rychlost(200);
        // auto2.plnyPlyn();
        // auto2.rychlost(250);
        System.out.println("Auto 1" + "\nRok vyroby: " + auto1.rokVyroby + "\nZnacka auta: " + auto1.znackaAuta + "\nModel auta: " + auto1.modelAuta );
        System.out.println("Auto 2" + "\nRok vyroby: " + auto2.rokVyroby + "\nZnacka auta: " + auto2.znackaAuta + "\nModel auta: " + auto2.modelAuta );
    }
}
