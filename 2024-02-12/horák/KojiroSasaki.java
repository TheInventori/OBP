public class KojiroSasaki{    
    static int obsahStvorca(int a){
        return (a * a);
    }
    static double obsahStvorca(double a){
        return (a * a);
    }
    static long obsahStvorca(long a){
        return (a * a);
    }

    public static void main(String[] args) {
        System.out.println(obsahStvorca(5));
        System.out.println(obsahStvorca(1.585));
        System.out.println(obsahStvorca(2.559269526));
        System.out.println(obsahStvorca(95494));
    }
}