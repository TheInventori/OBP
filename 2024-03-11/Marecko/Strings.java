public class Strings {
    public static void main(String[] args) {
        String s2, s3, s1 = "male a VELKE";
        
        s2 = s1.substring(5);
        s3 = s1.substring(5, 9);

        System.out.println(s2);
        System.out.println(s3);



        String s = "male a VELKE";
        char[] znaky = new char[10];

        s.getChars(2, 9, znaky, 0);
        System.out.println(znaky);



        if (s.startsWith("male")) {
            System.out.println("Zacina na \"male\"");
        }
        if (!s.endsWith("male")) {
            System.out.println("Nezacina na \"male\"");
        }



        String s4, s5 = "\r\n\t ahoj\t \r\n";

        s4 = s1.trim();
        System.out.println("zaciatok:" + s4 + ":koniec");
        System.out.println("zaciatok:" + s5 + ":koniec");



        String data = "Indiana Jones";

        char begin = data.charAt(0);
        char c = data.charAt(5);
        int l = data.length();
        char end = data.charAt(l - 1);

        System.out.println(begin + "\n" + c + "\n" + l + "\n" + end);


        
    }
}