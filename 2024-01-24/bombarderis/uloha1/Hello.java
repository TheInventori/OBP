
public class Hello {

    String znacka;
    String model;
    int rokVyroby;
    int najazdene;

   static void myMethod(){
    System.out.println("AUTA");
   }
   public void plnyPlyn(){
    System.out.println("Auto ide tak rychlo ako sa da");
   }
   public void rychlost(int maxRychlost){
    System.out.println("Max. rychlost je: " + maxRychlost);
   }
    public static void main(String[] args) {
       
        myMethod();

        Hello auto1 = new Hello();
        
        auto1.plnyPlyn();
        auto1.rychlost(200);

        
       
        
    }
}









