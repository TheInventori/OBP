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

        System.out.println(simpsons);

        simpsons.remove(5);
        simpsons.add("Maggie");
        
        System.out.println(simpsons);

        int index = simpsons.indexOf("Spasitel");

        if (index >= 0){
            System.out.println("Spasitel je zviera.");
            simpsons.remove(index);
        }
        
        System.out.println("Rodina Simpsonovcov ma " + simpsons.size() + " clenov.");
    }
}