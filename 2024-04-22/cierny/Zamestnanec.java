public class Zamestnanec {
    public String meno;
    public Datum narodenie, nastup;

    public Zamestnanec(String meno, Datum narodenie, Datum nastup) {
        this.meno = new String(meno);
        this.narodenie = new Datum(narodenie);
        this.nastup = new Datum(nastup);
    }

    public String toString() {
        StringBuffer b = new StringBuffer(100);
        b.append(den).append("....................................");
        b.append(mesiac).append("....................................");
        b.append(rok);
        return b.toString();
    }
}
