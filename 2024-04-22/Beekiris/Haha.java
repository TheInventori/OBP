public class Haha {

    int hodnotal;

    MojString(int h){
        hodnota = h;
    }

    public String toString(){
        String menoTriedy = new String(getClass().getName());
        return (menoTriedy + ": " + hodnota)
    }


    void povodnyString(){
        System.out.println(super.toString());
    }


    public static void main(String[] args) {
        MojString s1 = new MojString(5);
        s1.povodnytoString();

        MojString s2 = new MojString(5);
        s2.povodnytoString();

        
    }
}