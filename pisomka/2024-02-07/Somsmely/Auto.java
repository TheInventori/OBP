public class Auto {
    public String znacka = "Skoda";
    public final int rokVyroby = 2018;
    public double cena;
    public int rychlost;

    public void zrychli(){
        rychlost += 10;
    }

    public void spomal(){
        rychlost -= 5;
    }

    public void zastav(){
        rychlost = 0;
    } 

    public void vypis(){
        System.out.println(znacka + ":\nCena tohto auta je " + cena + "\nAktualna rychlost tohto auta je " + rychlost + " km/h");
    }
}