import java.util.Scanner;
import java.lang.Math;

public class Ahoj {
    public static Double scanf(){
        Scanner myObj = new Scanner(System.in);
        double temp = myObj.nextDouble();

        return temp;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        boolean pokracovanie = true;
        double cislo = scanf();
        do{
            String znak = myObj.next();
            switch (znak) {
                case "+":
                    cislo = Calc.plus(cislo);
                    break;
                case "-":
                    cislo = Calc.minus(cislo);
                    break;
                case "*":
                    cislo = Calc.krat(cislo);
                    break;
                case "/":
                    cislo = Calc.deleno(cislo);
                    break;
                case "=":
                    pokracovanie = false;
                    break;
                case "^":
                    cislo = Calc.mocnina(cislo);
                    break;
                case "v":
                    cislo = Calc.odmocnina(cislo);
                    break;
                default:
                    break;
            }
        }while(pokracovanie);
        if ((int) cislo == cislo){
            int icislo = (int) cislo;
            System.out.println(icislo);
        }
        else{ 
            System.out.println(cislo);
        }
    }
}