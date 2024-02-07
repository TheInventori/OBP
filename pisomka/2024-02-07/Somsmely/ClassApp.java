public class ClassApp {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        Auto auto2 = new Auto();

        auto1.cena = 1999.99;
        auto1.rychlost = 49;

        auto2.cena = 2499.99;
        auto2.rychlost = 200;

        if (auto1.rychlost < 50)
            auto1.zrychli();
        else if (auto1.rychlost > 120)
            auto1.spomal();

        auto2.zastav();

        auto1.vypis();
        auto2.vypis();
    }
}
