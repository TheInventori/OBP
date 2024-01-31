public class Вторая {
    public static void main(String[] args) {
        System.out.println("test");
        Main myObject1 = new Main();
        Main myObject2 = new Main();
        myObject2.c = 'P';
        myObject1.x = 13;
        System.out.println(myObject1.x);
        System.out.println(myObject2.x);
        System.out.println(myObject2.c);
        System.out.println(myObject2.c);
        System.out.println("Meno: " + myObject1.fname + " " + myObject2.lname);
    }
    
}