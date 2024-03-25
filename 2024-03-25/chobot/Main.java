import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        ArrayList <String> list1;
        list1 = new ArrayList<String>();

        System.out.println(list);
        System.out.println(list1);

        list.add(10);
        list.add(25);
        list.add(7);
        list.add(3);

        list.add(1, 100);
        list.set(0, 69);

        list.remove(2);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
