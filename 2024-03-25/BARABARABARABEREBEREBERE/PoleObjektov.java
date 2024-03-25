public class PoleObjektov {
    public static void main(String[] args) {
        IntADouble [] policko;
        policko = new IntADouble[3];

        for (int j = 0; j < policko.length; j++) {
            policko[j] = new IntADouble(j, (double)(j + 2));
        }

        for (int j = 0; j < policko.length; j++) {
            policko[j].vypis(); //neviem
        }
    }
}
