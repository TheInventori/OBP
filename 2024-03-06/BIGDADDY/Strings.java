import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        String slovo = myObj.nextLine();
        String noveSlovo = "";

        for (int i = slovo.length()-1; i >= 0; i--){
            noveSlovo = noveSlovo.concat("" + slovo.charAt(i));
        }

        System.out.println("povodny retazec: " + slovo + "; obrateny retazec: " + noveSlovo + "; zhoda: " + slovo.equals(noveSlovo));
    }

}