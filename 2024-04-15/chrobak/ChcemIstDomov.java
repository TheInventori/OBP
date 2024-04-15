public class ChcemIstDomov {
    private String meno;
    private int vek;


    public ChcemIstDomov() {
        this(null, 0);
    }

    public ChcemIstDomov(String meno, int vek) {
        this.meno = meno;
        this.vek = vek;
    }


    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getMeno() {
        return meno;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public int getVek() {
        return vek;
    }


    public void predstavSa() {
        System.out.println("Ahoj, moje meno je " + meno + " a mam " + vek + " rokov.");
    }
}