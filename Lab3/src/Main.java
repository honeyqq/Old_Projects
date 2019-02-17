import java.util.Arrays;

public class Main {

    public static int[][] matrix = new int[3][3];
    public static int[] array = new int[9];
    public static int b,max;

    public static void main(String[] args) {
        System.out.println("Matrix: ");
        inputMatrix();
        convertMatrix();
        System.out.println("Row ascending matrix: ");
        rowAscendingMatrix();
        System.out.println("Max value: ");
        findMax(array);
        System.out.println("Min value: ");
        findMin(array);

    }

    private static void inputMatrix(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = (int) (Math.random()*100);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void convertMatrix(){
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                array [k] = matrix[i][j];
                k++;
            }
        }
    }

    private static void rowAscendingMatrix(){
        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( array[j] > array[j+1] ){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        b=0;

        for (int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix.length;j++){
                matrix[i][j] = array[b];
                b++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void findMax(int[] array) {
        Arrays.sort(array);
        max = array[array.length - 1];
        System.out.println(max);
        System.out.println();
    }

    public static void findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[0]) {
                min = array[i];
            }
        }
        System.out.println(min);
        System.out.println();
    }

}
