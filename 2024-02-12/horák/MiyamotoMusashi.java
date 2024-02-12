import java.util.Scanner;
public class MiyamotoMusashi {
    
    static Scanner vstup = new Scanner(System.in);
    // metoda s navratovou hodnotou bez parametrov
    static int scitaj() {
        int a,
            b;
        a = vstup.nextInt();
        b = vstup.nextInt(); 
        return (a + b);
    }

    // metoda bez navratoveho typu s parametrom
    static void tlacPenazi(int eura) {
        System.out.println("Cena: " + eura + " Eur");
    }

    // metoda bez navratoveho typu bez parametrov
    static void pozdrav() {
        System.out.println("Ahoj svet");
    }

    // metoda s navratovou hodnotou s parametrami
    static int konv1 (double d) {
        return (int)d;
    }

    public static void main(String[] args) {
        // System.out.println("Vysledok: " + scitaj());
        // tlacPenazi(55);
        // pozdrav();
        System.out.println(konv1(3.14));
    }
}