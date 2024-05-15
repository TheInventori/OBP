public class Vypocet {
    double cislo1;
    double cislo2;
  
    public Vypocet(double cislo1, double cislo2) {
      this.cislo1 = cislo1;
      this.cislo2 = cislo2;
    }
  
    public double scitaj() {
      return cislo1 + cislo2;
    }
    public double odcitaj() {
      return cislo1 - cislo2;
    }
    public double vynasob() {
      return cislo1 * cislo2;
    }
    public double vydel() {
      return cislo1 / cislo2;
    }
  }