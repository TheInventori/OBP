import java.util.Scanner;
public class Uloha3{
    // napiste program ktory metodou eratostenovo syto vipise vsetky prvocisla od 1 po n (zadane cislo)
    void sito(int n)
    {
        boolean prvocislo[] = new boolean[n+1];
        for(int i=0;i<=n;i++)
            prvocislo[i] = true;
         
        for(int p = 2; p*p <=n; p++)
        {   
            if(prvocislo[p] == true){
                for(int i = p*p; i <= n; i += p)
                    prvocislo[i] = false;
            }
        }

        for(int i = 2; i <= n; i++){
            if(prvocislo[i] == true)
                System.out.print(i + " ");
        }
    }
     
    public static void main(String args[])
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Zadajte rozsah pre hladanie prvocisel");
        int n = myObj.nextInt();
        System.out.println("Prvocisla mensie alebo rovne ako " + n);
       
        Uloha3 prvocisla = new Uloha3();
        prvocisla.sito(n);
    }
}
