public class Test {
    public static void test() {
        System.out.println("цыган");
    }

    public static void main(String[] args) {
        System.out.println("test");

        Main ahoj1 = new Main();
        Main ahoj2 = new Main();

        System.out.println(ahoj1.x);
        System.out.println(ahoj2.x);


        System.out.println(ahoj1.b);
        
        ahoj1.b = false;

        System.out.println("Meno: " + ahoj1.fname + " " + ahoj1.lname);
        System.out.println("Vek: " + ahoj1.age);
        
        Main.цыган();
        test();
    }
}