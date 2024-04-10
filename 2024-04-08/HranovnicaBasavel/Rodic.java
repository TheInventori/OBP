/**
 * Rodic
 */
abstract class Rodic {

    public int i;
    public Rodic(){
        i = 1;
    }

    abstract int getI();

    final void setI(int noveI){
        i = noveI;
    }
}