public class Obdlznik {
    public int sirka;
    public int vyska;

    public Obdlznik(int sirka, int vyska) {
        nastavSirku(sirka); 
        this.vyska = vyska;
    }
    public Obdlznik(Obdlznik o) {
        sirka = o.sirka;
        vyska = o.vyska;
    }
    public Obdlznik() {
        sirka = 100;
        vyska = 10;
    }
    

    public int obvod() {
        return 2 * (sirka + vyska);
    }
    
    public int obsah() {
        return vyska * sirka;
    }
    
    public void nastavSirku(int sirka) {
        this.sirka = sirka;
    }

    public static void main(String[] args) {
        Obdlznik obdABCD = new Obdlznik(5, 3);
        Obdlznik obdKLMN = new Obdlznik(obdABCD);
        Obdlznik obdPRST = new Obdlznik();
        System.out.println("Obvod obdlznika ABCD je " + obdABCD.obvod() + " a jeho obsah je " + obdABCD.obsah());    
        System.out.println("Obvod obdlznika KLMN je " + obdKLMN.obvod() + " a jeho obsah je " + obdKLMN.obsah());    
        System.out.println("Obvod obdlznika PRST je " + obdPRST.obvod() + " a jeho obsah je " + obdPRST.obsah());    
    }
}
