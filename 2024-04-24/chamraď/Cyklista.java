public class Cyklista extends Clovek {
    public double rychlost;
    public double maxDlzka;
    public double maxStupanie;

    
    public Bezec(double rychlost, double maxDlzka, double maxStupanie) {
        this.rychlost = rychlost;
        this.maxDlzka = maxDlzka;
        this.maxStupanie = maxStupanie;
    }


    public double bmi(double hmotnost, double vyska) {
        return hmotnost / (vyska * vyska);
    }

    public String toString() {
        StringBuffer b = new StringBuffer(100);
        b.append(vek).append(", ");
        b.append(vyska).append(", ");
        b.append(hmotnost).append(", ");
        b.append(rychlost).append(", ");
        b.append(maxDlzka).append(", ");
        b.append(maxStupanie).append(", ");
        b.append(bmi(hmotnost, vyska));
        return b.toString();
    }
}