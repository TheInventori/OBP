public class Main {
    public int sirka;
    public int vyska;

    public Main(int sirka, int vyska) {
        nastavSirku(sirka);
        this.vyska = vyska;
    }
    
    public Main(Main o) {
        sirka = o.sirka;
        vyska = o.vyska;
    }
    
    public Main() {
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
        Main obd1 = new Main(5, 8);
        Main obd2 = new Main(obd1);
        Main obd3 = new Main();

        System.out.println("Obsah: " + obd1.obsah() + ", Obvod: " + obd1.obvod() + ", Uhlopriecka: " + obd1.dlzkaUhlopriecky());
        System.out.println("Obsah: " + obd2.obsah() + ", Obvod: " + obd2.obvod() + ", Uhlopriecka: " + obd2.dlzkaUhlopriecky());
        System.out.println("Obsah: " + obd3.obsah() + ", Obvod: " + obd3.obvod() + ", Uhlopriecka: " + obd3.dlzkaUhlopriecky());
    }
}