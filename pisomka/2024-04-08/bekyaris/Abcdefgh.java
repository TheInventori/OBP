import java.util.Scanner;

public class Abcdefgh {
    
    public static void main(String[] args) {
        Scanner nacitaj = new Scanner(System.in);

        String meno = nacitaj.nextLine();
        String priezvisko = nacitaj.nextLine();

        String lmeno = meno.toLowerCase();
        String lpriezvisko = priezvisko.toLowerCase();

        int pmeno = meno.length();
        int ppriezvisko = priezvisko.length();

        System.out.println("Pocet pismen v mene je: " + pmeno + ", pocet pismen v priezvisku je: " + ppriezvisko);
        System.out.println("Tvoje inicialky su: " + meno.substring(0,1) + "." + priezvisko.substring(0,1) + ".");
        System.out.println("Tvoj email: " + lmeno + "." + lpriezvisko + "@spseke.sk");

        
        
    }
    
}
