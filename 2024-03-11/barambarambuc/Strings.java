public class Strings {

    public static void main(String[] args) {
        

        String s = "male a VELKE";
        int i;

        i = s.indexOf('a');
        System.out.println("Prve a je na " + i + ". pozicii");
        i = s.indexOf('a', i+1);
        System.out.println("Dalsie a je na " + i + ". pozicii");
        i = s.lastIndexOf('a');
        System.out.println("Poslede a je na " + i + ". pozicii");
        i = s.lastIndexOf('a', i-1);
        System.out.println("Predposledne a je na " + i + ". pozicii");
    }
}