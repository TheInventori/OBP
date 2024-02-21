/*
 * Vytvorte triedu Triangel, ktora bude poskytovat metody double obvod()  a boolean is()
 * clenske premenne: sideA, sideB, sideC, -> celociselne (int)
 * 
 * Modifikujte triedu Triangel tak, aby konstruktor osetril pripady ked zadavame strany netvoria trojuholnik
 * a + b > c
 * b + c > a
 * a + c > b
 * V tomto pripade konstruktor nastavi vsetky strany na 0
 * 
 * Pretazte konstruktor Trojuholnik (int firstSide), ktory bude vytvarat rovnostranne trojuholniky
 * 
 * Pretazte konstruktor Trojuholnik (int firstSide, int secondSide), ktory bude vytvarat rovnoramenne trojuholnik
 */

import java.util.Scanner;

public class Trojuholnik {
    int stranaA;
    int stranaB;
    int stranaC;

    public Trojuholnik(int stranaA, int stranaB, int stranaC) {
        if((stranaA + stranaB) > stranaC && (stranaA + stranaC) > stranaB && (stranaC + stranaB) > stranaA) {
            this.stranaA = stranaA;
            this.stranaB = stranaB;
            this.stranaC = stranaC;
        } else {
            this.stranaA = 0;
            this.stranaB = 0;
            this.stranaC = 0;
        }
    }
    public Trojuholnik(int stranaA, int stranaB) {
        if((stranaA + stranaA) > stranaB) {
            this.stranaA = stranaA;
            this.stranaB = stranaA;
            this.stranaC = stranaB;
        } else {
            this.stranaA = 0;
            this.stranaB = 0;
            this.stranaC = 0;
        }

    }
    public Trojuholnik(int stranaA) {
        this.stranaA = stranaA;
        this.stranaB = stranaA;
        this.stranaC = stranaA;
    }

    double obvod() {
        return stranaA + stranaB + stranaC;
    }
    
    boolean jePravouhly() {
        if((stranaA * stranaA) + (stranaB * stranaB) == (stranaC * stranaC) ||
           (stranaA * stranaA) + (stranaC * stranaC) == (stranaB * stranaB) ||
           (stranaC * stranaC) + (stranaB * stranaB) == (stranaA * stranaA)) {
            return true;
           }
        return false;
    }

    public static void main(String[] args) {
        

        Scanner side = new Scanner(System.in);

        System.out.println("Zadajte stranu A");
        int sideA = side.nextInt();
        System.out.println("Zadajte stranu B");
        int sideB = side.nextInt();
        System.out.println("Zadajte stranu C");
        int sideC = side.nextInt();
        



        Trojuholnik troj1 = new Trojuholnik(sideA);
        Trojuholnik troj2 = new Trojuholnik(sideA, sideB);
        Trojuholnik troj3 = new Trojuholnik(sideA, sideB, sideC);

        System.out.println("Pravouhly: " + troj1.jePravouhly() + ", Obvod: " + troj1.obvod());
        System.out.println("Pravouhly: " + troj2.jePravouhly() + ", Obvod: " + troj2.obvod());
        System.out.println("Pravouhly: " + troj3.jePravouhly() + ", Obvod: " + troj3.obvod());
    }
}