import java.util.Scanner;

public class Vstup {
    public static void main(String[] args) {
        Scanner citaj = new Scanner(System.in);


        // vstup celych cisel

        System.out.println("Zadaj 1. cele cislo: ");
        int c1 = citaj.nextInt();

        System.out.println("Zadaj 2. cele cislo: ");
        int c2 = citaj.nextInt();
        int cv = c1 + c2;

        System.out.println(cv);


        // vstup desatinnych cisel

        System.out.println("Zadaj 1. desatine cislo: ");
        double d1 = citaj.nextDouble();

        System.out.println("Zadaj 2. desatine cislo: ");
        double d2 = citaj.nextDouble();
        double dv = d1 + d2;

        System.out.println(dv);


        // vstup jedneho znaku

        System.out.println("Zadaj lubovolny znak: ");
        char znak1 = citaj.next().charAt(0);

        System.out.println(znak1);


        // vstup retazeca znakov

        System.out.println("Zadaj lubovolny text: ");
        String text = citaj.next();

        System.out.println(text);
    }
}