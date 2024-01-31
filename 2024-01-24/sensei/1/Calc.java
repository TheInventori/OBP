public class Calc {
    public static double plus(double cislo){
        double temp = Ahoj.scanf();
        
        return cislo + temp;
    }
    public static double minus(double cislo){
        double temp = Ahoj.scanf();
        
        return cislo - temp;
    }
    public static double krat(double cislo){
        double temp = Ahoj.scanf();
        
        return cislo * temp;
    }
    public static double deleno(double cislo){
        double temp = Ahoj.scanf();
        
        return cislo / temp;
    }
    public static double mocnina(double cislo) {
        double temp = Ahoj.scanf();
        
        return Math.pow(cislo, temp);
    }
    public static double odmocnina(double cislo) {
        double temp = Ahoj.scanf();
        
        return Math.pow(cislo, 1.0 / temp);
    }
}