import java.time.Year;

public class Vypocitaj {
    double height;
    double weight;
    String rcislo;
    String rcisloO;
    int deti;

    public Vypocitaj(double height, double weight, String rcislo, int deti) {
        this.height = height;
        this.weight = weight;
        this.rcisloO = rcislo;
        this.rcislo = rcislo.replace("/", "");
        this.deti = deti;
    }

    public double BMI() {
        return weight / ((height / 100) * (height / 100));
    }

    public String BMIvis() {
        double bmi = BMI();
        
        if (bmi < 18.5) {
            // return "<html><div style=\"background-color: 'red'\">BMI: Podváha</div></html>";
            return "BMI: Podváha";
        } else if (bmi < 25) {
            // return "<html><div style=\"background-color: 'green'\">BMI: Normálna váha</div></html>";
            return "BMI: Normálna váha";
        } else if (bmi < 30) {
            // return "<html><div style=\"background-color: 'yellow'\">BMI: Nadváha</div></html>";
            return "BMI: Nadváha";
        } else {
            // return "<html><div style=\"background-color: 'red'\">BMI: Obezita</div></html>";
            return "BMI: Obezita";
        }
    }
    
    public String pohlavie() {
        String test;

        test = rcislo.substring(2, 4);
        
        if (Integer.parseInt(test) > 50) {
            return "Zena";
        } else {
            return "Muz";
        }
    }
    
    public String dochdkovyVek() {
        switch (deti) {
            case 0:
                return datumNarodenia().substring(0, 6) + String.valueOf(Integer.parseInt(datumNarodenia().substring(6, 10)) + 64);
            case 1:
                return datumNarodenia().substring(0, 3) + String.valueOf(Integer.parseInt(datumNarodenia().substring(3, 5)) + 6) + "." + String.valueOf(Integer.parseInt(datumNarodenia().substring(6, 10)) + 63);
            case 2:
                return datumNarodenia().substring(0, 6) + String.valueOf(Integer.parseInt(datumNarodenia().substring(6, 10)) + 63);
            default:
                return datumNarodenia().substring(0, 3) + String.valueOf(Integer.parseInt(datumNarodenia().substring(3, 5)) + 6) + "." + String.valueOf(Integer.parseInt(datumNarodenia().substring(6, 10)) + 62);
        }
    }
    
    public String datumNarodenia() {
        String narodenie = "";
        String test;

        test = rcislo.substring(4, 6);
        narodenie += test;

        narodenie += ".";
        
        test = rcislo.substring(2, 4);
        if (Integer.parseInt(test) > 50) {
            narodenie += "0" + String.valueOf(Integer.parseInt(test) - 50);
        } else {
            narodenie += test;
        }

        narodenie += ".";
        
        test = rcislo.substring(0, 2);
        if (Integer.parseInt(test) > 24) {
            narodenie += String.valueOf(1900 + Integer.parseInt(test));
        } else {
            narodenie += String.valueOf(2000 + Integer.parseInt(test));
        }

        return narodenie;
    }
    
    public int vek() {
        int narodenie;
        String test;
        
        test = rcislo.substring(0, 2);
        if (Integer.parseInt(String.valueOf(test)) > 24) {
            narodenie = 1900 + Integer.parseInt(test);
        } else {
            narodenie = 2000 + Integer.parseInt(test);
        }

        return Year.now().getValue() - narodenie;
    }

    public String rcisloC() {
        if (Double.parseDouble(rcislo) % 11 != 0 || rcisloO.length() != 11) {
            return "Neplatne";
        }

        return rcisloO;
    }
}