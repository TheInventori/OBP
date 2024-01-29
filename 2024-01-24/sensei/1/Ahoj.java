import java.util.Scanner;
import java.lang.Math;

public class Ahoj {
    public static String scanf(){
        Scanner myObj = new Scanner(System.in);
        String temp = myObj.nextLine();

        return temp;
    }

    public static double plus(double cislo){
        double temp = Double.parseDouble(scanf());
        
        return cislo + temp;
    }
    public static double minus(double cislo){
        double temp = Double.parseDouble(scanf());
        
        return cislo - temp;
    }
    public static double krat(double cislo){
        double temp = Double.parseDouble(scanf());
        
        return cislo * temp;
    }
    public static double deleno(double cislo){
        double temp = Double.parseDouble(scanf());
        
        return cislo / temp;
    }
    public static double mocnina(double cislo) {
        double temp = Double.parseDouble(scanf());
        
        return Math.pow(cislo, temp);
    }
    public static void odmocnina(double cislo) {
        double temp = Double.parseDouble(scanf());
        
        return Math.(cislo, temp);
    }

    public static void main(String[] args) {
        boolean pokracovanie = true;
        double cislo = Double.parseDouble(scanf());
        do{
            String znak = scanf();
            switch (znak) {
                case "+":
                    cislo = plus(cislo);
                    break;
                case "-":
                    cislo = minus(cislo);
                    break;
                case "*":
                    cislo = krat(cislo);
                    break;
                case "/":
                    cislo = deleno(cislo);
                    break;
                case "=":
                    pokracovanie = false;
                    break;
                case "^":
                    cislo = mocnina(cislo);
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