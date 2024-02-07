
public class Auto{
    String znacka = "Skoda"; // znacka auta
    final int rokVyroby = 2018; //rok vyroby auta
    float cena; //cena auta
    int rychlost; //aktualna rychlost

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
        System.out.println("Znacka auta je: " + znacka + " Cena tohto auta je: " + cena + " Aktualna rychlost auta je: " + rychlost);
    }

    
}


