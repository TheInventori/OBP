public class NechcemTuByt extends ChcemIstDomov {
    private String oblubenyJazyk;


    public NechcemTuByt() {
    }

    public NechcemTuByt(String oblubenyJazyk) {
        this.oblubenyJazyk = oblubenyJazyk;
    }


    public void setOblubenyJazyk(String oblubenyJazyk) {
        this.oblubenyJazyk = oblubenyJazyk;
    }

    public String getOblubenyJazyk() {
        return oblubenyJazyk;
    }


    public void predstavSa() {
        System.out.println("Som programator, najradsej mam " + oblubenyJazyk + " porgramovaci jazyk");
    }


    public static void main(String[] args) {
        NechcemTuByt p = new NechcemTuByt();
        p.setMeno("Marek");
        p.setVek(20);
        p.predstavSa();
    }
}