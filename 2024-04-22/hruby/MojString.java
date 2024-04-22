public class MojString {
    int hodnota;

    MojString(int h){
        hodnota = h;
    }

    public String toString (){
        String menoTriedy = new String(getClass().getName());
        return (menoTriedy + ": " + hodnota);
    }

    void povodnytoString(){
        System.out.println(super.toString());           
    }

    public static void main(String[] args) {
        MojString s1 = new MojString(5);
        s1.povodnytoString();
        System.out.println(s1.toString());
    }
}