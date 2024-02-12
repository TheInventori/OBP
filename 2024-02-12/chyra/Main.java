import java.util.Scanner;

public class Main {
    static Scanner vstup = new Scanner(System.in);

    static int scitaj() {
        int a, b;
        a = vstup.nextInt();
        b = vstup.nextInt();
        return a + b;
    }

    static void tlacPenazi(int eura) {
        System.out.println("Cena: " + eura + "Eur");
    }

    static void pozdrav() {
        System.out.println("Ahoj svet");
    }

    static int konv1 (double d) {
        return (int)d;
    }

    public static void main(String[] args) {
        System.out.println("Vysledok: " + scitaj());
        tlacPenazi(500);
        pozdrav();
        System.out.println(konv1(3.14));
    }
}