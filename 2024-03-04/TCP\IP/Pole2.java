public class Pole2 {
    public static void main(String[] args) {
        int[] prvocisla = {2, 3, 5, 7, 11, 13, 17};

        String[] auta = {"Lambrgambr", "Ferariri", "Bagatata", "Porsche", "Koenigsegg"};

        for (int i = 0; i < prvocisla.length; i++) {
            System.out.print(prvocisla[i] + " ");
            i++;
        }
        System.out.println();

        for (String i: auta) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}