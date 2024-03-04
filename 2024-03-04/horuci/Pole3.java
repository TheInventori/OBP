public class Pole3 {
    public static void main(String[] args) {
        int[][] стурка = new int[5][4];

        System.out.println("Pocet riadkov: " + стурка.length);
        System.out.println("Pocet stlpov: " + стурка[0].length);
        
        for (int i = 0; i < стурка.length; i++) {
            for (int j = 0; j < стурка[i].length; j++) {
                стурка[i][j] = 10 * i + j;
                System.out.print(стурка[i][j] + " ");
            }
            System.out.println();
        }
    }
}