public class Auto {
    String znacka = "Skoda";
    final int rokVyroby = 2018;
    double cena;
    int rychlost;

    public void zrychli() {
        rychlost += 10;
    }

    public void spomal() {
        rychlost -= 5;
    }

    public void zastav() {
        rychlost = 0;
    }

    public void vypis() {
        System.out.println("Znacka auto: " + znacka + ": Cena tohto auta je " + cena + " Aktualna rychlost tohto auta je " + rychlost);
    }
}