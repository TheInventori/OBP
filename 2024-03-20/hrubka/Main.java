import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] auta = {"Keogniggseg", "Bugatata", "Ferariri", "Lambrgambr", "TUTUTURUT MAX VERSTAPPEN"};
        for(String i:auta){
            System.out.print(i + ", ");
        }
        System.out.println();
        
        Arrays.sort(auta);

        for(String i:auta){
            System.out.print(i + ", ");
        }
        System.out.println();
        
        
        System.out.println("Napis znacku auta: ");
        String scan = input.nextLine();

        System.out.println(Arrays.binarySearch(auta, scan));
        
        if(Arrays.binarySearch(auta, scan) >= 0 ){
            System.out.println("toto auto je na zozname");
        }
        else{
            System.out.println("toto auto na zozname nie je");
        }

        String[] noveAuta = Arrays.copyOfRange(auta, 1,3);
        for(String nove:noveAuta){
            System.out.println(nove);
        } 

    }
}