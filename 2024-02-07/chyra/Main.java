import java.net.SocketPermission;

public class Main {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("fero");
        System.out.println(myObj.getName());
    }
}