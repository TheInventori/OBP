public class Stvorce {
    static int test(int a) {
        return a * a;
    }

    static double test(double a) {
        return a * a;
    }

    static long test(long a) {
        return a * a;
    }

    public static void main(String[] args) {
        System.out.println(test(5));
        System.out.println(test(5.4));
        System.out.println(test(95494));
    }
}