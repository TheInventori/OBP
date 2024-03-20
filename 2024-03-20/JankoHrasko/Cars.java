import java.util.Arrays;
import java.util.Scanner;



public class Cars {
    public static void main(String[] args) {
        String[] auta = {"Audi","Skoda","Mazda","Volvo","Volkswagen","BMW","Opel"};

        // for(String a: auta){
        //     System.out.println(a + ", ");
        // }
        // Arrays.sort(auta);
        // for(String a: auta){
        //     System.out.println(a + ", ");
        // }

        Scanner scanf = new Scanner(System.in);

        System.out.println("zadajte znacku auta ktore hladate: ");
        String hladane = scanf.nextLine();

        // System.out.println(Arrays.binarySearch(auta, hladane));


        if(Arrays.binarySearch(auta, hladane) != -2){
            System.out.println("Auticko sa nachadza v zozname");
        }
        else{
            System.out.println("Asi to tam nebudze kamarate");
        }
    }

    
}
