
public class PravouhlyTrojuholnik{

    int stranaA;
    int stranaB;
    double prepona;

    double dlzkaPrepony(){
        return Math.sqrt(Math.pow(stranaA,2) + Math.pow(stranaB,2));
    }
    double obsah(){
        return (stranaA * stranaB) / 2.0;
    }
    double obvod(){
        return stranaA + stranaB + prepona;
    }
    public PravouhlyTrojuholnik(int sideA, int sideB){
        stranaA = sideA;
        stranaB = sideB; 
        prepona = dlzkaPrepony();
        
    }
    // metody nemaju parametre 
    
    public PravouhlyTrojuholnik(){
        stranaA = 1;
        stranaB = 1;
        prepona = dlzkaPrepony();
    }

    public static void main(String[] args) {
        PravouhlyTrojuholnik t1 = new PravouhlyTrojuholnik(7,3);
        PravouhlyTrojuholnik t2 = new PravouhlyTrojuholnik();
    


        System.out.println("Strany trojuholnika t1 su: " + t1.stranaA + " " + t1.stranaB + " " + t1.prepona + " Obsah je: " + t1.obsah() + " Obvod je: " + t1.obvod());
        System.out.println("Strany trojuholnika t2 su: " + t2.stranaA + " " + t2.stranaB + " " + t2.prepona + " Obsah je: " + t2.obsah() + " Obvod je: " + t2.obvod());
    }

}