import java.util.Random;


public class Mejtica {
    public static void printMatrix(int [][] matrix){
        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++ ){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("___________________________________________________");
    }

    

    public static void generateMatrix(int [][] matrix){
        Random generate = new Random();
        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++ ){
                matrix[i][j] = generate.nextInt(1000);
            }
           
        }
    }

    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,4},{11,12,},{100,200,300}};
        printMatrix(matrix);

        matrix = new int[4][4];
        
        generateMatrix(matrix);
        printMatrix(matrix);
       
    }

}
