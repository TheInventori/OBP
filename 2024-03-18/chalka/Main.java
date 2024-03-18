import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        System.out.print("Napis velkost: ");


        int size = scanf.nextInt();
        boolean prime[] = new boolean[size + 1];
        
        for (int i = 0; i <= size; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i <= size; i++) {
            if (prime[i] == true) {
                for (int j = i * i; j <= size; j += i) {
                    prime[j] = false;
                }
            }
        }

        for(int i = 2; i <= size; i++) {
            if(prime[i] == true)
                System.out.print(i + " ");
        }
    }
}