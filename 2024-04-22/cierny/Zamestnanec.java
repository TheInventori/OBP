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
        b.append(meno).append(", ");
        b.append(narodenie).append(", ");
        b.append(nastup);
        return b.toString();
    }
}
