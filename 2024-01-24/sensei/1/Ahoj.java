import java.util.Scanner;

public class Ahoj {
    public static String scanf(){
        Scanner myObj = new Scanner(System.in);
        String temp = myObj.nextLine();

        myObj.close();

        return temp;
    }

    public static void main(String[] args) {
        System.out.println("Zadaj priklad oddeleny medzerami: (napr.: 3 + 3)");
        String zadanie = scanf();

        String[] znaky = zadanie.split("\\s+");

        double cislo = Double.parseDouble(znaky[0]);
        for (int i = 1; i < znaky.length - 1; i += 2){
            String znak = znaky[i];

            double cislo2 = Double.parseDouble(znaky[i+1]);

            cislo = Calc.vracanie(znak, cislo, cislo2);
        }  

        if ((int) cislo == cislo){
            int icislo = (int) cislo;
            System.out.println(icislo);
        }
        else{ 
            System.out.println(cislo);
        }
        
    }
}