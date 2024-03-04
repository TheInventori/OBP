public class Pole2 {
    public static void main(String[] args) {
        int[] prvocisla = {2, 3, 5, 7, 11, 13, 17};
        String[] cars = {"Lambrgambr", "Ferariri", "Bagatata", "Porsche", "Koenigsegg"};

        for(int i = 0; i < prvocisla.length; i -= -1) {
            System.out.print(prvocisla[i] + " ");
        }
        
        System.out.println();
        for(int i = 0; i < cars.length; i -= -1) {
            System.out.print(cars[i] + " ");
        }
        System.out.println();
        for(String i:cars) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}