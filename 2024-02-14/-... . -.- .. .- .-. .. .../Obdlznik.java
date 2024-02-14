public class Obdlznik {
    
    public int sirka;
    public int vyska;

    public Obdlznik(int pSirka, int pVyska){
        sirka = pSirka;
        vyska = pVyska;
    }

    public int obvod(){
        return 2*(sirka+vyska);
    }
    public int obsah(){
        return (sirka*vyska);
    }

    public static void main(String[] args) {
        Obdlznik obdABCD = new Obdlznik(5, 3);
        System.out.println("Obvod obdlznika ABCD je " + obdABCD.obvod() + ", a jeho obsah je " + obdABCD.obsah());
    }
}


