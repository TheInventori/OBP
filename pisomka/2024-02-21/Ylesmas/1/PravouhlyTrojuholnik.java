public class PravouhlyTrojuholnik{
    int stranaA, stranaB;
    double prepona;

    public PravouhlyTrojuholnik(int a, int b){
        stranaA = a;
        stranaB = b;
        prepona = dlzkaPrepony();
    }

    public PravouhlyTrojuholnik(){
        stranaA = 1;
        stranaB = 1;
        prepona = dlzkaPrepony();
    }

    double dlzkaPrepony(){
        double temp = Math.sqrt(Math.pow(stranaA, 2) + Math.pow(stranaB, 2));

        return temp;
    }

    double obsah(){
        double temp = (stranaA*stranaB)/2.0;

        return temp;
    }

    double obvod(){
        double temp = stranaA+stranaB+prepona;

        return temp;
    }

    public static void main(String[] args) {
        PravouhlyTrojuholnik t1 = new PravouhlyTrojuholnik(7, 3);
        PravouhlyTrojuholnik t2 = new PravouhlyTrojuholnik();

        System.out.println("t1: velkost prepony = " + t1.dlzkaPrepony() + ", obsah = " + t1.obsah() + ", obvod = " + t1.obvod());
        System.out.println("t2: velkost prepony = " + t2.dlzkaPrepony() + ", obsah = " + t2.obsah() + ", obvod = " + t2.obvod());
    }
}
