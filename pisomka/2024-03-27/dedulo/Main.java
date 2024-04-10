import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

// naprogramujte lotto, od pouzivatela pozidajte vyplnenie ticktu (pole) a nasledne vyzrebujte cisla (random pole velkost 6, 1-49)
public class Main {
    
    public static void print(int[] zreb, int[] lotto){
        System.out.println("Cisla podane v loterii: " + zreb);
        System.out.println("Cisla vyzrebovane v loterii: " + lotto);
    }


    public static void zrebovanie(int[] lotto, int controlB){
        Random rand = new Random();
        

        for (int i = 0; i < lotto.length; i++){
            controlB = rand.nextInt(1,49);
            if (Arrays.binarySearch(lotto, controlB) < 0){
                lotto[i] = controlB;
                Arrays.sort(lotto);
            }
            else{
                i--;
            }
        }
    }


    public static void hladanie(int[] zreb, int[] lotto,int zhodne){
        for (int i = 0; i < zreb.length; i++){
            if (Arrays.binarySearch(lotto,zreb[i]) >= 0){
                zhodne++;
            }
            
        }

        if (zhodne == 0){
            System.out.println("Smola nenasli ste ani jedno zrebovane cislo");
        }
        else{
            System.out.println("Nasli ste " + zhodne + " z vyzrebovanych cisel");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    
// priradenie bezvyznamnych placeholderov na zamedzenie pridavku blbosti do pola
        int[] zreb = {88,88,88,88,88,88};
        int[] lotto = {88,88,88,88,88,88};
        int controlA = 0;
        int controlB = 0;
        int zhodne = 0;

        for (int i = 0; i < zreb.length; i++){
            System.out.println("Zadajte " + (i+1) + ". cislo zrebu");
            controlA = input.nextInt();
            if (controlA >= 1 && controlA <=49){
                if (Arrays.binarySearch(zreb,controlA) < 0){
                    zreb[i] = controlA;
                    Arrays.sort(zreb);
                }
                else {
                    System.out.println("Cislo ste uz zadali");
                    i--;
                }
            }
            else{
                System.out.println("Zadali ste neplatne cislo");
                i--;
            }
            
        }
        
        for (int i: zreb){
            System.out.print(i + ", ");
        }
        System.out.println();
        zrebovanie(lotto, controlB);

        for (int i: lotto){
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("-----------------------------------");
        hladanie(zreb, lotto, zhodne);

    }
}
