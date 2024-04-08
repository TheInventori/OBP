import java.util.ArrayList;
public class Simpsonovci {
    public static void main(String[] args) {
        ArrayList<String> simpsons = new ArrayList<String>();
        simpsons.add("Homer");
        simpsons.add("Spasitel");
        simpsons.add("Bart");
        simpsons.add("Marge");
        simpsons.add("Lisa");
        simpsons.add("Meggie");

        System.out.println("Simpsonovci: " + simpsons);
        
        simpsons.remove("Meggie");
        simpsons.add("Maggie");

        System.out.println("Simpsonovci: " + simpsons);

        if(simpsons.indexOf("Spasitel") >= 0){
            System.out.println("Spasitel je zviera");

            simpsons.remove("Spasitel");
        }

        System.out.println("Rodina Simpsonovcov ma " + simpsons.size() + " clenov.");

    }
}
