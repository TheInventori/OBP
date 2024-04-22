public class MenitelnyRetazec {
    public static void main(String[] args) {
        StringBuffer b1 = new StringBuffer();
        StringBuffer b2 = new StringBuffer(100);
        StringBuffer b3 = new StringBuffer("Ahoj");
        System.out.println("Aktuala dlzka: " + b1.length());
        System.out.println("Aktuala dlzka: " + b1.capacity());
    }
}