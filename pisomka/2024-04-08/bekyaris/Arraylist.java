import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        
        ArrayList<String> alist = new ArrayList<String>();

        alist.add("Homer");
        alist.add("Spasitel");
        alist.add("Bart");
        alist.add("Marge");
        alist.add("Lisa");
        alist.add("Meggie");

        for (int i = 0; i < alist.size(); i++){
            System.out.print(alist.get(i) + ", ");
        }


        System.out.println();
        alist.set(5, "Maggie");


        for (int i = 0; i < alist.size(); i++){
            System.out.print(alist.get(i) + ", ");
        }

        alist.indexOf("Spasitel");
    }
}
