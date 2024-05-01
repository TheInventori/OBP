public class Clovek {
    private int vek;
    private double vyska;
    private double hmotnost;


    public Clovek(int vek, double vyska, double hmotnost) {
        this.vek = vek;
        this.vyska = vyska;
        this.hmotnost = hmotnost;
    }


    abstract setKonicek() {
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public void setVyska(double vyska) {
        this.vyska = vyska;
    }

    public void setHmotnost(double Hmotnost) {
        this.Hmotnost = Hmotnost;
    }

    public int getVek() {
        return vek;
    }

    public double getVyska() {
        return vyska;
    }

    public double getHmotnost() {
        return hmotnost;
    }

    public String toString() {
        StringBuffer b = new StringBuffer(100);
        b.append(vek).append(", ");
        b.append(vyska).append(", ");
        b.append(hmotnost);
        return b.toString();
    }
}