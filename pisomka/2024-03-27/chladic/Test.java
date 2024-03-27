import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random gen = new Random();
        for(int i = 0; i < 1000; i++) {

            System.out.println(gen.nextInt(49) + 1);
        }
    }
}
