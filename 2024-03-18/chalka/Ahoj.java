import java.util.Scanner;

public class Ahoj {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        System.out.print("Napis velkost: ");


        int size = scanf.nextInt();
        boolean prime1[] = new boolean[size + 1];

        for (int i = 0; i <= size; i++) {
            prime1[i] = true;
        }

        for (int p = 2; p * p <= size; p++) {
            if (prime1[p] == true) {
                for (int i = p * p; i <= size; i += p) {
                    prime1[i] = false;
                }
            }
        }

        for (int i = 2; i <= size; i++) {
            if (prime1[i] == true) {
                System.out.print(i + " ");
            }
        }
    }
}