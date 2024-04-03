public class Kvader extends Obdlznik {
    public int hlbka;

    public Kvader(int sirka, int vyska, int hlbka) {
        super(sirka, vyska);
        this.hlbka = hlbka;
    }

    public double dlzkaUhlopriecky() {
        return Math.sqrt(Math.pow(super.dlzkaUhlopriecky(), 2) + Math.pow(hlbka, 2));
    }

    public static void main(String[] args) {
        Kvader kva = new Kvader(6, 8, 10);

        System.out.println("Uhlopriecka: " + kva.dlzkaUhlopriecky());
        System.out.println("Sirka: " + kva.hodnotaSirky());
        System.out.println("Uhlopriecka: " + kva.vyska);

        System.out.println("Uhlopriecka: " + );
    }
}
