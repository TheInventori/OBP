public class Bezec extends Clovek {
    public double rychlost;
    public double vytrvalost;
    public String konicek;


    public Bezec(double rychlost, double vytrvalost, String konicek) {
        this.rychlost = rychlost;
        this.vytrvalost = vytrvalost;
        this.konicek = konicek;
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
        b.append(vytrvalost).append(", ");
        b.append(konicek);
        return b.toString();
    }
}
