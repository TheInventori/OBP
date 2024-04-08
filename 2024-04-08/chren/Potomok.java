public class Potomok extends Rodic {
    int getI() {
        return i * 2;
    }

    void setI() {
        i = 5;
    }

    public static void main(String[] args) {
        Potomok pot = new Potomok();
        System.out.println("Hodnota je: " + pot.getI());
    }
}
