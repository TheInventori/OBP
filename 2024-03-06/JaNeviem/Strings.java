public class Strings {
    public static void main(String[] args) {
        String s1, s2, s3;

        s1 = "Ahoj";
        s2 = "Hello";

        s3 = s1 + " " + s2;

        System.out.println(s3);

        s3 = s1 + " ";
        s3 = s3.concat(s2);

        System.out.println(s3);
    }
}