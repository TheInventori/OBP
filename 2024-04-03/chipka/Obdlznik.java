public class Obdlznik {
    public int sirka;
    public int vyska;

    public Obdlznik(int sirka, int vyska) {
        this.sirka = sirka;
        this.vyska = vyska;
    }

    public double dlzkaUhlopriecky() {
        return Math.sqrt((sirka * sirka) + (vyska * vyska));
    }

    public int hodnotaSirky() {
        return sirka;
    }
}
