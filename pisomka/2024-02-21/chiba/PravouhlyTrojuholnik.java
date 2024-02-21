/**
 * Zadanie 2
 */
public class PravouhlyTrojuholnik {
    int stranaA;
    int stranaB;
    double prepona;

    public PravouhlyTrojuholnik(int stranaA, int stranaB) {
        this.stranaA = stranaA;
        this.stranaB = stranaB;
        dlzkaPrepony();
    }

    public PravouhlyTrojuholnik() {
        stranaA = 1;
        stranaB = 1;
        dlzkaPrepony();
    }

    public double dlzkaPrepony() {
        prepona = Math.sqrt((stranaA * stranaA) + (stranaB * stranaB));
        return prepona;
    }

    public double obsah() {
        return (stranaA * stranaB) / 2.0;
    }

    public double obvod() {
        return stranaA + stranaB + prepona;
    }

    public static void main(String[] args) {
        PravouhlyTrojuholnik t1 = new PravouhlyTrojuholnik(7, 3);
        PravouhlyTrojuholnik t2 = new PravouhlyTrojuholnik();

        System.out.println("t1: prepona: " + t1.prepona + ", obvod: " + t1.obvod() + ", obsah: " + t1.obsah());
        System.out.println("t2: prepona: " + t2.prepona + ", obvod: " + t2.obvod() + ", obsah: " + t2.obsah());
    }
}