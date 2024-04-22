public class Bomboclat {
    int hodnota;

    Bomboclat(int h) {
        hodnota = h;
    }

    public String toString() {
        String menoTriedy = new String(getClass().getName());
        return menoTriedy + ": " + hodnota;
    }

    void povodnyToString() {
        System.out.println(super.toString());
    }

    public static void main(String[] args) {
        Bomboclat s1 = new Bomboclat(5);
        s1.povodnyToString();
        System.out.println(s1.toString());
    }
}