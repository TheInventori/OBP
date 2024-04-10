public class Patrox extends Rodic{
    int getI(){
        return i*2;
    }

    void setI(){
        i = 5;
    }

    public static void main(String[] args) {
        Patrox pot = new Patrox();
        pot.setI(3);
        System.out.println("Hodnota je: " + pot.getI());
        pot.setI();
        System.out.println("Hodnota je: " + pot.getI());
    }
}