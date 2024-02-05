public class Hello {

    String znackaAuta;
    String modelAuta;
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
   public Hello(int rok,String znacka,String model){
    znackaAuta = znacka;
    rokVyroby = rok;
    modelAuta = model;
    }
   
}









