import java.io.StringBufferInputStream;

public class Datum {
    public int den, mesiac, rok;
    
    public Datum(int den, int mesiac, int rok) {
        this.den = den;
        this.mesiac = mesiac;
        this.rok = rok;
    }

    public Datum(Datum d) {
        this(d.den, d.mesiac, d.rok);
    }

    public String toString() {
        StringBuffer b = new StringBuffer(100);
        b.append(den).append("....................................");
        b.append(mesiac).append("....................................");
        b.append(rok);
        return b.toString();
    }
}