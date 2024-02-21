public class PravouhlyTrojuholnik {
    int stranaA;
    int stranaB;
    double prepona;

    public PravouhlyTrojuholnik(int stranaA, int stranaB){
        this.stranaA = stranaA;
        this.stranaB = stranaB;
        prepona = dlzkaPrepony(stranaA, stranaB);
    }

    public PravouhlyTrojuholnik(){
        stranaA = 1;
        stranaB = 1;
        prepona = dlzkaPrepony(stranaA, stranaB);
    }

    public double dlzkaPrepony(int stranaA, int stranaB){
        return Math.sqrt((stranaA * stranaA) + (stranaB * stranaB));
    }
    public double obsah(){
        return (stranaA * stranaB) / 2.0;
    }
    public double obvod(){
        return stranaA + stranaB + prepona;
    }

    
    public static void main(String[] args) {
        PravouhlyTrojuholnik t1 = new PravouhlyTrojuholnik(7, 3);
        PravouhlyTrojuholnik t2 = new PravouhlyTrojuholnik();
        System.out.println("T1: dlzka prepony: " + t1.prepona + " obsah: " + t1.obsah() + " obvod: " + t1.obvod() + ".");
        System.out.println("T2: dlzka prepony: " + t2.prepona + " obsah: " + t2.obsah() + " obvod: " + t2.obvod() + ".");
    }

}