class Obdlznik{
    public int sirka;
    public int vyska;

    public Obdlznik(int sirka, int vyska){
        this.sirka = sirka;
        this.vyska = vyska;
    }

    public double dlzkaUhlopriecky(){
        double pom;

        pom = (sirka*sirka) + (vyska*vyska);

        return Math.sqrt(pom);
    }

    public int hodnotaSirky(){
        return sirka;
    }
}