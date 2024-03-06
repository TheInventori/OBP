import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        String polslovo = myObj.nextLine();

        for (int i = polslovo.length()-2; i >= 0; i--){
            polslovo = polslovo + polslovo.charAt(i);
        }
        System.out.println(polslovo);
    }
}