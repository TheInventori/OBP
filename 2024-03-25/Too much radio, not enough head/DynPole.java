import java.util.ArrayList;

public class DynPole {

    public static void main(String[] args) {
        ArrayList <String> mena = new ArrayList <String>(); 

        mena.add("Janka");
        mena.add("Jolena");
        mena.add("Barbora");
        mena.add("Gertruda");
        mena.add("Ismena");
        mena.add("Petronela");
        
        System.out.println(mena);

        mena.add(3, "Xenia");

        for (int i = 0; i < mena.size(); i++){
            System.out.println(mena.get(i));
        }
    }
}