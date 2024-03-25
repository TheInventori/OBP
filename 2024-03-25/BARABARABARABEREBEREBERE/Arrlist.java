import java.util.ArrayList;

public class Arrlist {

    public static void main(String[] args) {
        ArrayList <Integer> list; 
        list = new ArrayList <Integer>();

        ArrayList <String> alist = new ArrayList <String>();

        System.out.println("Arraylist: " + list);


        list.add(10);
        list.add(25);
        list.add(7);

        list.add(2,100);
        System.out.println("Arraylist: " + list);

    }
}