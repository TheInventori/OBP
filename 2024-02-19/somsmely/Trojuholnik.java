// metody double obvod() a bool jePravouhly()
import java.lang.Math;
import java.util.Scanner;

public class Trojuholnik {
    public static int stranaA, stranaB, stranaC;

    public Trojuholnik(int a, int b, int c){
        if (a + b != c || b + c != a || a + c != b){
            a = 0;
            b = 0;
            c = 0;
        }

        stranaA = a;
        stranaB = b;
        stranaC = c;
    }

    public Trojuholnik(int a){
        stranaA = a;
        stranaB = a;
        stranaC = a;
    }

    public Trojuholnik(int a, int b){
        stranaA = a;
        stranaB = a;
        stranaC = b;
    }

    double obvod(){
        return (stranaA + stranaB + stranaC);
    }

    boolean jePravouhly(){
        int a, b, c;

        if (stranaA >= stranaB){
            c = stranaA;
            a = stranaB;
        }
        else{
            c = stranaB;
            a = stranaA;
        }

        if (c <= stranaC){
            b = c;
            c = stranaC;
        }
        else{
            b = stranaC;
        }

        if (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) == c)
            return true;

        return false;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        int c = myObj.nextInt();

        Trojuholnik trojABC = new Trojuholnik(a, b, c);
        Trojuholnik trojDEF = new Trojuholnik(a);
        Trojuholnik trojGHI = new Trojuholnik(a, b);

        System.out.println("Je pravouhly: " + trojABC.jePravouhly() + "\n obvod = " + trojABC.obvod() + "\n\n");
        System.out.println("Je pravouhly: " + trojDEF.jePravouhly() + "\n obvod = " + trojDEF.obvod() + "\n\n");
        System.out.println("Je pravouhly: " + trojGHI.jePravouhly() + "\n obvod = " + trojGHI.obvod() + "\n\n");

    }
}
