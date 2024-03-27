import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

// Naprogramujte hru loto
// od uzivatela poziadajte vyplnenie ticketu a nasledne vyzrebujte cisla,
// 6 cisel z intervalu od 1 do 49

public class Main {
    public static void vypis(int[] pole) {
        for(int i = 0; i < pole.length; i++) {
            if(i < (pole.length - 1) && pole[i] != 99){
                System.out.print(pole[i] + ",");
            }
            else if (pole[i] != 99){
                System.out.print(pole[i]);
            }
        }
    }

    public static void main(String[] args) {
        // deklaracie
        Scanner input = new Scanner(System.in);
        Random rng = new Random();
        int[] lotoUser = new int[6];
        int[] lotoRandom = new int[6];
        int lastNum;
        int correct = 0;

        // cyklus na nastavenie vsetkych prvkov pola na 99, aby metoda sort davala este nezadane prvky pola na koniec
        for(int i = 0; i < 6; i++){
            lotoUser[i] = 99;
            lotoRandom[i] = 99;
        }

        // cyklus na nacitavanie do pola
        for(int i = 0; i < 6; i++){
            System.out.println("Zadajte "+ (i + 1) +". cislo");
            lastNum = input.nextInt();
            Arrays.sort(lotoUser);

            // overenie ci bolo zadane vhodne cislo
            if(lastNum < 1 || lastNum > 49 || Arrays.binarySearch(lotoUser, lastNum) >= 0) {
                System.out.println("Cislo, ktore si zadal je nespravne, zadaj prosim znovu cislo z intervalu od 1 do 49 a nezadavaj rovnake cislo viackrat.");
                System.out.print("Cisla, ktore si uz zadal: ");
                vypis(lotoUser);
                System.out.println();
                i--;
            }
            else{
                lotoUser[i] = lastNum;
                System.out.print("Cisla, ktore si uz zadal: ");
                vypis(lotoUser);
                System.out.println();
            }
        }
        Arrays.sort(lotoUser);
        System.out.print("Toto su tvoje finalne cisla: ");
        vypis(lotoUser);
        System.out.println();
        System.out.println("-------------------------------------------------------------------");

        // random
        for(int i = 0; i < 6; i++){
            lastNum = rng.nextInt(48);
            lastNum++;
            Arrays.sort(lotoRandom);
            if(Arrays.binarySearch(lotoRandom, lastNum) >= 0) {
                i--;
            }
            else{
                lotoRandom[i] = lastNum;
            }
        }

        // vypis cisel
        System.out.print("Vylosovane cisla: ");
        vypis(lotoRandom);
        System.out.println();
        System.out.print("Tvoje cisla: ");
        vypis(lotoUser);
        System.out.println();

        // kontrola
        for(int i = 0; i < 6; i++) {
            if(Arrays.binarySearch(lotoRandom, lotoUser[i]) >= 0)
                correct++;
        }
        if(correct == 0) {
            System.out.println("Uhadol si " + correct +" cisel, zial nevyhravas nic");
        }
        else if(correct == 1){
            System.out.println("Uhadol si " + correct + " cislo, dobra praca");
        }
        else if(correct > 1 && correct < 5){
            System.out.println("Uhadol si " + correct + " cisla, dobra praca");
        }
        else{
            System.out.println("Uhadol si " + correct + " cisel, dobra praca");
        }
    }
}
