import java.util.Scanner;

public class Ahoj {
    public static String scanf(){
        Scanner myObj = new Scanner(System.in);
    
        String temp = myObj.nextLine();

        return temp;
    }

    public static float plus(float cislo){
        float temp = Float.parseFloat(scanf());
        
        return cislo + temp;
    }
    public static float minus(float cislo){
        float temp = Float.parseFloat(scanf());
        
        return cislo - temp;
    }
    public static float krat(float cislo){
        float temp = Float.parseFloat(scanf());
        
        return cislo * temp;
    }
    public static float deleno(float cislo){
        float temp = Float.parseFloat(scanf());
        
        return cislo / temp;
    }

    public static void main(String[] args) {
        boolean pokracovanie = true;
        float cislo = Float.parseFloat(scanf());
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
                default:
                    break;
            }
        }while(pokracovanie);
        System.out.println(cislo);
    }
}