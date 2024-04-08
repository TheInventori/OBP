import java.util.Scanner;

public class Retazec {
    public static void main(String[] args) {
        String fname = new String();
        String lname = new String();

        Scanner input = new Scanner(System.in);

        System.out.println("Zadaj meno: ");
        fname = input.nextLine();
        System.out.println("Zadaj prizvisko: ");
        lname = input.nextLine();

        int pocetA = 0;

        for (int i = 0; i < fname.length(); i++) {
            if (fname.charAt(i) == 'a') {
                pocetA++;
            }
        }
        
        for (int i = 0; i < lname.length(); i++) {
            if (lname.charAt(i) == 'a') {
                pocetA++;
            }
        }

        System.out.println("Pocet znakov v tvojom mene: " + fname.length());
        System.out.println("Pocet znakov v tvojom priezvisku: " + lname.length());
        System.out.println("Tvoje inicialky su: " + fname.charAt(0) + "." + lname.charAt(0) + ".");
        System.out.println("Tvoj email: " + fname.toLowerCase() + "." + lname.toLowerCase() + "@spseke.sk");
        System.out.println("V mene " + fname + " " + lname + " sa pismeno a nachadza " + pocetA);
    }
}