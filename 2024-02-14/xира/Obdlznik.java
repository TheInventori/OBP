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

    public void nastavSirku(int sirka) {
        this.sirka = sirka;
    }

    public void nastavVysku(int vyska) {
        this.vyska = vyska;
    }

    public double dlzkaUhlopriecky() {
        return Math.sqrt((sirka * sirka) + (vyska * vyska));
    }

    public int obvod() {
        return 2 * (sirka + vyska);
    }

    public int obsah() {
        return sirka * vyska;
    }

    public static void main(String[] args) {
        Obdlznik obd1 = new Obdlznik(5, 8);
        Obdlznik obd2 = new Obdlznik(obd1);
        Obdlznik obd3 = new Obdlznik();

        System.out.println("Obsah: " + obd1.obsah() + ", Obvod: " + obd1.obvod());
        System.out.println("Obsah: " + obd2.obsah() + ", Obvod: " + obd2.obvod());
        System.out.println("Obsah: " + obd3.obsah() + ", Obvod: " + obd3.obvod());
    }
}