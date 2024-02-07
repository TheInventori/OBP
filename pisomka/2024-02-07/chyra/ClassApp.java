public class ClassApp {

    public static void main(String[] args) {
        Auto auto1 = new Auto();
        Auto auto2 = new Auto();
    
        auto1.cena = 100000;
        auto2.cena = 200000;
    
        auto1.rychlost = 150;
        auto2.rychlost = 30;
    
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
