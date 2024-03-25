import java.util.ArrayList;

public class FantaziaDochadza {

    //vytvorte pole retazcou s premenlivou dlzkou
    //do pola postupne vlozte mena 
    //Janka, Jolana, Barbora, Gertrude, Ismena, Petronela
    //vypiste tieto mena na orazovku
    //potom na index 3 pridajte meno Xenia a opat vypiste


    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList <String>();

        names.add("Janka");
        names.add("Jolana");
        names.add("Barbora");
        names.add("Gertruda");
        names.add("Ismena");
        names.add("Petronela");

        System.out.println(names);

        names.add(3,"Xenia");

        for (int i = 0; i < names.size(); i++){
            System.out.print(names.get(i) + ", ");
        }
    }
}