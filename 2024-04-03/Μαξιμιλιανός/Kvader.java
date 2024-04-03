

public class Kvader extends Obdlznik{
    public int hlbka;

    public Kvader(int sirka, int vyska, int hlbka){
        super(sirka,vyska);
        this.hlbka = hlbka;
    }
    
    public double dlzkaUhlopriecky(){
        double pom = super.dlzkaUhlopriecky();
        pom = (pom*pom) + (hlbka*hlbka);

        return Math.sqrt(pom);
    }


    public static void main(String[] args) {
        Kvader kva = new Kvader(6, 8, 10);
        System.out.println("Uhlopriecka: " + kva.dlzkaUhlopriecky());
        System.out.println("Sirka je: " + kva.hodnotaSirky());
        System.out.println("Vyska je: " + kva.vyska);
    }
}