import java.util.Scanner;

public class Test {

    public static int search(String spolu){
        int pocet = 0;

        for (int i = 0; i < spolu.length(); i++){
            if (spolu.charAt(i) == 'a')
                pocet++;
        }

        return pocet;
    }
    
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        String meno = new String();
        String priezvisko = new String();
        String spolu = new String();
        
        System.out.println("Zadajte svoje meno: ");
        meno = scanf.nextLine();

        System.out.println("Zadajte svoje priezvisko: ");
        priezvisko = scanf.nextLine();

        spolu = meno + priezvisko;

        System.out.println("Dlzka mena: " + meno.length());
        System.out.println("Dlzka priezviska: " + priezvisko.length());

        System.out.println("Inicialky: " + meno.charAt(0) + "." + priezvisko.charAt(0) + ".");

        System.out.println(meno.toLowerCase() + "." + priezvisko.toLowerCase() + "@spseke.sk");

        System.out.println("V mene " + meno + " " + priezvisko + " sa pismeno a nachadza " + search(spolu) + "-krat");
    }
    
}