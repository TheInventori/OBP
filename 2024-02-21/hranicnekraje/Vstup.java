import java.util.Scanner;

public class Vstup {
    
    
    public static void main(String[] args) {
        Scanner scannin = new Scanner(System.in);
        System.out.println("Zadaj 1. cele cislo: ");
        int x = scannin.nextInt();
        System.out.println("Zadaj 2. cele cislo: ");
        int y = scannin.nextInt();
        int z = x + y;
        System.out.println(z);
    }
}
