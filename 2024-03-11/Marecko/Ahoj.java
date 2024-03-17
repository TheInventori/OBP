import java.util.Scanner;

/**
 * Napiste program ktory zo zadaneho retazca na vstupe postupne
 * odoberie jednotlive znaky a vlozi ich do noveho obrateneho retazca
 * Vstup obsahuje retazec a vystup je v tvare povodny_retazec, obrateny_retazec a hodnota true ak su rovnake a hodnota false ak nie
 */

public class Ahoj {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        System.out.print("Napis retazec: ");
        String normal = scanf.next();
        String reverse;

        for (int i = normal.length() - 1, j = 0; i > 0; i--) {
            reverse[j] = normal.substring(i);
            j++;
        }

        System.out.println(reverse);
    }
}
