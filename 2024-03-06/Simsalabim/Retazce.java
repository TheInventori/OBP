public class Retazce {
    public static void main(String[] args) {
        String s1, s2, s3, s4, s5, s6;
        byte[] bajty = {(byte) 'E', (byte) 'v', (byte) 'a'};
        char[] znaky = {'M', 'a', 'r', 't', 'i', 'n', 'a'};

        s1 = new String("cao");
        s2 = new String(s1);
        s3 = new String(bajty);
        s4 = new String(bajty, 1, 2);
        s5 = new String(znaky);
        s6 = new String(znaky, 3, 4);

        System.out.println(s1 + s2 + s3 + s4 + s5 + s6);
    }
}