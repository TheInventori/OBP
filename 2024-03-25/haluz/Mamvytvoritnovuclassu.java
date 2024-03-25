// vytvorte pole retazcov s premenlivou dlzkou, do pola postupne vlozte mena 


// Jolana
// Gertruda
// Ismena
// Sidonia
// Jozefina
// Petronela

import java.util.ArrayList;
public class Mamvytvoritnovuclassu {
    public static void main(String[] args) {


        ArrayList<String> mytus;                            // deklaracia premennej
        mytus = new ArrayList<String>();                    // vytvorenie instancie
        mytus.add("Jolana");                           
        mytus.add("Gertruda");                           
        mytus.add("Ismena");                           
        mytus.add("Sidonia");                           
        mytus.add("Jozefina");                           
        mytus.add("Petronela");                           
                        
        System.out.println(mytus);

        mytus.add(3, "Xenia");

        System.out.println(mytus);
    }
}
