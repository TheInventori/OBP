/**
 * napiste triedu trojuhlonik ktora bude poskytovat metody double obvod a boolean jePravouhly
 */

public class Trojuholnik {
    int stranaA;
    int stranaB;
    int stranaC;

    public Trojuholnik(int stranaA) {
        this(stranaA, stranaA, stranaA);
    }

    public Trojuholnik(int stranaA, int stranaB) {
        this(stranaA, stranaA, stranaB);
    }

    public Trojuholnik(int stranaA, int stranaB, int stranaC) {
        if ((stranaA + stranaB) > stranaC && (stranaC + stranaB) > stranaA && (stranaA + stranaC) > stranaB) {
            this.stranaA = stranaA;
            this.stranaB = stranaB;
            this.stranaC = stranaC;
        } else {
            this.stranaA = 0;
            this.stranaB = 0;
            this.stranaC = 0;
        }
    }

    public double obvod() {
        return stranaA + stranaB + stranaC;
    }

    public boolean jePravouhly() {
        if((stranaA * stranaA) + (stranaB * stranaB) == (stranaC * stranaC) ||
           (stranaA * stranaA) + (stranaC * stranaC) == (stranaB * stranaB) ||
           (stranaC * stranaC) + (stranaB * stranaB) == (stranaA * stranaA)) {
            return true;
           }
        return false;
    }

    public static void main(String[] args) {
        Trojuholnik troj1 = new Trojuholnik(3);
        Trojuholnik troj2 = new Trojuholnik(3, 4);
        Trojuholnik troj3 = new Trojuholnik(3, 4, 5);

        System.out.println("Pravouhly: " + troj1.jePravouhly() + ", Obvod: " + troj1.obvod());
        System.out.println("Pravouhly: " + troj2.jePravouhly() + ", Obvod: " + troj2.obvod());
        System.out.println("Pravouhly: " + troj3.jePravouhly() + ", Obvod: " + troj3.obvod());
    }
}