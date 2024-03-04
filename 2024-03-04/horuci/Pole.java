public class Pole {
    public static void main(String[] args) {
        int[] cisla;
        cisla = new int [5];
    
        int[] cisielka = new int[4];
    
        int[] loto = {1, 2, 3, 4};
    
        String[] cars = {"Lambrgambr", "Ferariri", "Bagatata", "Porsche", "Koenigsegg"};
    

        System.out.println("Dlzka pola cisla je " + cisla.length);
        System.out.println("Dlzka pola cisielka je " + cisielka.length);
        System.out.println("Dlzka pola loto je " + loto.length);
        System.out.println("Dlzka pola cars je " + cars.length);

        System.out.println("4. auto je " + cars[3]);
        System.out.println("2. auto je " + cars[1]);

        cars[1] = "Bugatti";

        System.out.println("2. auto je " + cars[1]);
    }
}