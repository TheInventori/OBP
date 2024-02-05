import java.lang.Math;

public class Calc {
    public static double plus(double cislo, double temp){
        return cislo + temp;
    }
    public static double minus(double cislo, double temp){
        return cislo - temp;
    }
    public static double krat(double cislo, double temp){
        return cislo * temp;
    }
    public static double deleno(double cislo, double temp){
        return cislo / temp;
    }
    public static double mocnina(double cislo, double temp) {
        return Math.pow(cislo, temp);
    }
    public static double odmocnina(double cislo, double temp) {        
        return Math.pow(cislo, 1.0 / temp);
    }

    public static double vracanie(String znak, double cislo, double cislo2) {
        switch (znak) {
            case "+":
                cislo = plus(cislo, cislo2);
                break;
            case "-":
                cislo = minus(cislo, cislo2);
                break;
            case "*":
                cislo = krat(cislo, cislo2);
                break;
            case "/":
                cislo = deleno(cislo, cislo2);
                break;
            case "^":
                cislo = mocnina(cislo, cislo2);
                break;
            case "v":
                cislo = odmocnina(cislo, cislo2);
                break;
            case "=":
                break;
            default:
                System.out.println("Chybny operator " + znak + " !!!");
                break;
        }
        return cislo;
    }
}