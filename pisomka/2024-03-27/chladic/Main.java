import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

/**
 * naprogramujte loto
 * od uzivatela poziadajte vyplnenie tiketu a nasladne vyzrebujte cisla 6 cisles od 1 do 49
 */

public class Main {
    /*
    public static void uzivatel(int[] user) {
        System.out.println("Zadaj 6 cisel od 1 do 49: ");

        for (int i = 0; i < 6; i++) {
            int vstup = input.nextInt();
            if (vstup < 1 || vstup > 49) {
                i--;
                System.out.println("Zadal si cislo mimo rozsah.");
            } else {
                Arrays.sort(user);
                if (Arrays.binarySearch(user, vstup) < 0) {
                    user[i] = vstup;
                } else {
                    i--;
                    System.out.println("Take cislo si uz zadal.");
                }
            }
        }

        System.out.println("Uz staci");
    }

    public static void generator(int[] ran) {
        for (int i = 0; i < 6; i++) {
            int vstup = gen.nextInt(49);
            Arrays.sort(ran);
            if (Arrays.binarySearch(ran, vstup) < 0) {
                i--;
            } else {
                ran[i] = vstup;
                System.out.println(ran[i]);
            }
        }
    }
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random gen = new Random();
        int[] user = {99, 99, 99, 99, 99, 99};
        int[] ran = {99, 99, 99, 99, 99, 99};
        int uhadnute = 0;

        System.out.println("Zadaj 6 cisel od 1 do 49: ");

        for (int i = 0; i < 6; i++) {
            System.out.println("Zadaj " + (i + 1) + ". cislo: ");
            int vstup = input.nextInt();
            if (vstup < 1 || vstup > 49) {
                i--;
                System.out.println("Zadal si cislo mimo rozsah.");
            } else {
                Arrays.sort(user);
                if (Arrays.binarySearch(user, vstup) < 0) {
                    user[i] = vstup;
                } else {
                    i--;
                    System.out.println("Take cislo si uz zadal.");

                    System.out.print("tvoje cisla: ");
                    for (int j = 0; j < 5; j++) {
                        System.out.print(user[j] + ", ");
                    }
                    System.out.println(user[5]);
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            int vstup = gen.nextInt(49) + 1;
            Arrays.sort(ran);
            if (Arrays.binarySearch(ran, vstup) < 0) {
                ran[i] = vstup;
                System.out.print(ran[i] + ", ");
            } else {
                i--;
            }
        }

        System.out.println();

        Arrays.sort(user);
        Arrays.sort(ran);

        for (int i = 0; i < 6; i++) {
            System.out.print(user[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < 6; i++) {
            if (Arrays.binarySearch(user, ran[i]) >= 0) {
                uhadnute++;
            }
        }

        if (uhadnute == 0) {
            System.out.println("Nic si neuhadol.");
        } else if (uhadnute == 1) {
            System.out.println("Uhadol si: " + uhadnute + " cislo");
        } else if (uhadnute > 1 && uhadnute < 5) {
            System.out.println("Uhadol si: " + uhadnute + " cisla.");
        } else if (uhadnute > 4) {
            System.out.println("Uhadol si: " + uhadnute + "cisel");
        }
    }
}
