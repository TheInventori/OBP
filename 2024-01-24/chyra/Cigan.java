import java.util.Scanner;


public class Cigan {
    static String scanf(){
        Scanner myObj = new Scanner(System.in);
    
        String temp = myObj.nextLine();

        return temp;
    }
    class Strom {
        String druh;
        int vek;
        float vyska;
        double hrubka;
    }

    public static void main(String[] args) {
        Strom dub = new Strom();
        Strom buk = new Strom();
        Strom breza = new Strom();
        Strom smrek = new Strom();
    }
}