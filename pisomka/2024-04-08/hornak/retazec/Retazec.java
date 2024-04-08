import java.util.Scanner;

public class Retazec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fname = new String();
        String lname = new String();
        String fullName = new String();
        int amount = 0;

        System.out.println("Napis svoje krstne meno: ");
        fname = input.nextLine();
        System.out.println("Napis svoje priezvisko: ");
        lname = input.nextLine();


        System.out.println("Pocet znakov mena: " + fname.length() + ", Pocet znakov priezviska: " + lname.length());
        System.out.println("Tvoje inicialky su: " + fname.toUpperCase().charAt(0) + "." + lname.toUpperCase().charAt(0) + ".");
        System.out.println("Tvoj e-mail: " + fname.toLowerCase() + "." + lname.toLowerCase() + "@spseke.sk");
        
        fullName = fname + " ";
        fullName = fullName.concat(lname);

        for(int i = 0; i < fullName.length(); i++){
            if(fullName.charAt(i) == 'a'){
                amount++;
            }
        }
        System.out.println("V mene " + fullName + " sa nachadza pismeno a " + amount + "-krat");
    }
}
