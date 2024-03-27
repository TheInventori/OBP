import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Uloha {
    static Random nahoda = new Random();
    static Scanner scan = new Scanner(System.in);


    /*public Uloha(){
        int cislo = 0;
        int cislo2 = 0;

        for (int i = 0; i < 6; i++){
            Arrays.sort(nahodne);
            do{
                cislo = nahoda.nextInt(1,49);
            }while(Arrays.binarySearch(nahodne, cislo) != -1);
            nahodne[i] = cislo;
        }
        Arrays.sort(nahodne);
        
        for (int i = 0; i < 6; i++){
            Arrays.sort(hrac);
            do{ 
                System.out.println("Zadaj " + i);
                cislo2 = scan.nextInt();
                if (cislo2 < 1 || cislo2 > 49)
                    System.out.println("Zadane cislo je mimo limitov!!");
                if (Arrays.binarySearch(hrac, cislo2) != -1)
                    System.out.println("Cislo si uz zadal/a!!");
            }while(Arrays.binarySearch(hrac, cislo2) != -1);
            hrac[i] = cislo2;
        }
        Arrays.sort(hrac);
    }*/
    public static int nahodne(int[] nahodne){
        int temp = 0;

        Arrays.sort(nahodne);
        do{
            temp = nahoda.nextInt(1,49);
        }while(Arrays.binarySearch(nahodne, temp) >= 0);
        return temp;
    }

    public static int typ(int[] hrac){
        int temp = 0;

        Arrays.sort(hrac);
            do{
                temp = scan.nextInt();
                if (temp < 1 || temp > 49)
                    System.out.println("Zadane cislo je mimo limitov!!");
                if (Arrays.binarySearch(hrac, temp) >= 0)
                    System.out.println("Cislo si uz zadal/a!!");
            }while(Arrays.binarySearch(hrac, temp) >= 0);
            return temp;
    }

    public static int kontrola(int[] nahodne, int[] hrac){
        int pocet = 0;
        for (int i = 0; i < 6; i++){
            if (Arrays.binarySearch(nahodne, hrac[i]) < 0){
                pocet++;
            }
        }
        return pocet;
    }

    public static void vypis(int pocet, int[] nahodne, int[] hrac){
        System.out.println("nahodne cisla: " + nahodne + "\ntvoje cisla: " + hrac + "\npocet spravnych: " + pocet);
    }

    public static void main(String[] args) {
        int[] hrac = {66,66,66,66,66,66};
        int[] random = {66,66,66,66,66,66};

        for (int i = 0; i < 6; i++){
            hrac[i] = typ(hrac);
        }
        for (int i = 0; i < 6; i++){
            random[i] = nahodne(random);
        }
        vypis(kontrola(random, hrac), random, hrac);
    }
}
