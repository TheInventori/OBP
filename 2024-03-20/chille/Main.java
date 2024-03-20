import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        String[] auta = {"Keogniggseg", "Bugatata", "ferariri", "lambrgambr", "tutututu max verstappen"};

        for (String auto : auta) {
            System.out.print(auto + ", ");
        }

        System.out.println();

        // sort
        
        Arrays.sort(auta);

        for (String auto : auta) {
            System.out.print(auto + ", ");
        }

        System.out.println();

        // binary search
        
        System.out.print("Ake auto chces vyhladat: ");

        String hladat = scanf.nextLine();

        int index = Arrays.binarySearch(auta, hladat);

        System.out.println(index);

        if (index < 0) {
            System.out.println("auto nie je na zozname");
        }
        else {
            System.out.println("auto ma index " + index);
        }

        // copyOfRange

        String[] vysek = Arrays.copyOfRange(auta, 1, 3);

        for (String auto : vysek) {
            System.out.print(auto + ", ");
        }

        System.out.println();
    }
}