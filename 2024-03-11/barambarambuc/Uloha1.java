import java.util.Scanner;
public class Uloha1 {

    //napiste program ktory zo zadaneho vstupu postupne odoberie jednotlive snaky a vlozi ich do noveho obrateneho retazca
    //vstup obsahuje retazec a vystup je v tvare povodny retazec,
    //obrateny retazec a hodnota true ak su zhodne alebo false ak nie

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