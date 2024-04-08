import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> simpsons = new ArrayList<String>();
        simpsons.add("Homer");
        simpsons.add("Spasitel");
        simpsons.add("Bart");
        simpsons.add("Marge");
        simpsons.add("Lisa");
        simpsons.add("Meggie");

        for (int i = 0; i < simpsons.size(); i++) {
            System.out.print(simpsons.get(i) + ", ");
        }

        System.out.println();

        simpsons.set(5, "Maggie");

        if (simpsons.indexOf("Spasitel") > 0) {
            System.out.println("Spasitel je zviera.");
            simpsons.remove(5);
        }

        System.out.println("Rodina Simsonovcov ma " + simpsons.size() + " clenov.");
    }
}