public class ClassApp{
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        Auto auto2 = new Auto();
        auto1.cena = 5264.85;
        auto1.rychlost = 85;
        auto2.cena = 10510.56;
        auto2.rychlost = 120;
        
        if(auto1.rychlost < 50) {
            auto1.zrychli();
        }
        if(auto1.rychlost > 120) {
            auto1.spomal();
        }

        auto2.zastav();

        auto1.vypis();
        auto2.vypis();
    }
}