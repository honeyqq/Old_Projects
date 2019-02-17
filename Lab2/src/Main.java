import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    private static int CONST_FOR_MULT;

    private static final int CONST_i = 3;
    private static final int CONST_j = 3;
    private static final int CONST_k = 3;

    private static int[][] matrix1 = new int[3][3];
    private static int[][] matrix2 = new int[3][3];
    private static int[][] sumMatrix = new int[3][3];
    private static int[][] multMatrix = new int[3][3];
    private static int[][] multMatrixOnConst = new int[3][3];
    private static int[][] multMatrixOnConstBoth = new int[3][3];
    private static int[][] matrixInPow = new int[3][3];
    private static int[][] unitMatrix = new int [3][3];


    public static void main(String[] args) {
        inputMatrix1();
        inputMatrix2();

        while (true) {
            System.out.println(" 1.Add \n 2.Multiply \n 3.Multiply on a constant \n 4.Transpose \n " +
            "5.Rase to a power");

            int NUMBER_OF_CASE = scan.nextInt();

            String NUMBER_OF_MATRIX;

            switch (NUMBER_OF_CASE) {
                case 1:
                    addMatrices();
                    break;
                case 2:
                    multMatrices();
                    break;
                case 3:
                    System.out.println("Insert a constant: ");

                    CONST_FOR_MULT = scan.nextInt();

                    System.out.println("Which matrix (1,2 or both) multiply on a constant?");

                    NUMBER_OF_MATRIX = scan.next();

                    if (NUMBER_OF_MATRIX.equals("1")) {
                        multConstMatrix1();
                        break;
                    } else if (NUMBER_OF_MATRIX.equals("2")) {
                        multConstMatrix2();
                        break;
                    } else if (NUMBER_OF_MATRIX.equals("both")){
                        multConstMatrixBoth();
                        break;
                    }
                case 4:
                    System.out.println("Which matrix to transpose (1,2 or 'both')?");

                    NUMBER_OF_MATRIX = scan.next();

                    if (NUMBER_OF_MATRIX.equals("1")) {
                        transpMatrix1();
                        break;
                    } else if (NUMBER_OF_MATRIX.equals("2")) {
                        transpMatrix2();
                        break;
                    } else if (NUMBER_OF_MATRIX.equals("both")){
                        transpMatrixBoth();
                        break;
                    }
                case 5:
                    System.out.println("Which matrix rase to a power (1,2 or 'both')?");

                    NUMBER_OF_MATRIX = scan.next();

                    if (NUMBER_OF_MATRIX.equals("1")){
                        matrixInPow1();
                        break;
                    } else if (NUMBER_OF_MATRIX.equals("2")){
                        matrixInPow2();
                        break;
                    } else if (NUMBER_OF_MATRIX.equals("both")){
                        matrixInPowBoth();
                        break;
                    }
                        System.out.println("Error");
                        break;
                    default:
                        System.out.println("Error");
                        System.exit(1);
            }

            System.out.println("Continue calculations? yes/no");

            String YES_NO = scan.next();

            switch (YES_NO) {
                case "yes":
                    System.out.println("Insert a new matrices? yes/no");

                    String NEW_MATRIX = scan.next();

                    if (NEW_MATRIX.equals("yes")){
                            inputMatrix1();
                            inputMatrix2();
                            break;
                    }

                    break;

                case "no":
                    System.exit(1);
                default:
                    System.out.println("Error");
                    System.exit(1);
            }
        }
    }

    private static void inputMatrix1() {
        System.out.println("Enter elements of matrix №1:");
        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                matrix1[i][j] = scan.nextInt();
            }
        }
    }

    private static void inputMatrix2(){
        System.out.println("Enter elements of matrix №2:");

        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                matrix2[i][j] = scan.nextInt();
            }
        }
    }

    private static void addMatrices() {
        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Sum of matrices №1 and №2 equals: ");
        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                System.out.print(sumMatrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void multMatrices() {
        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                for (int k = 0; k < CONST_k; k++) {
                    multMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Product of matrices №1 and №2 equals: ");
        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                System.out.print(multMatrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void multConstMatrix1() {
        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                multMatrixOnConst[i][j] = CONST_FOR_MULT * matrix1[i][j];
            }
        }
        System.out.println("Result: ");
        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                System.out.print(multMatrixOnConst[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void multConstMatrix2() {
        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                multMatrixOnConst[i][j] = CONST_FOR_MULT * matrix2[i][j];
            }
        }
        System.out.println("Result: ");
        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                System.out.print(multMatrixOnConst[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void multConstMatrixBoth() {
        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                multMatrixOnConstBoth[i][j] = CONST_FOR_MULT * matrix1[i][j];
            }
        }
        System.out.println("Result of a matrix №1: ");
        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                System.out.print(multMatrixOnConstBoth[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                multMatrixOnConstBoth[i][j] = CONST_FOR_MULT * matrix2[i][j];
            }
        }
        System.out.println("Result of a matrix №2: ");
        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                System.out.print(multMatrixOnConstBoth[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void transpMatrix1() {
        for (int i = 0; i < CONST_i; i++) {
            for (int j = i + 1; j < CONST_j; j++) {
                int temp = matrix1[i][j];
                matrix1[i][j] = matrix1[j][i];
                matrix1[j][i] = temp;
            }
        }
        System.out.println("Result: ");
        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                System.out.print(matrix1[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void transpMatrix2() {

        for (int i = 0; i < CONST_i; i++) {
            for (int j = i + 1; j < CONST_j; j++) {
                int temp = matrix2[i][j];
                matrix2[i][j] = matrix2[j][i];
                matrix2[j][i] = temp;
            }
        }
        System.out.println("Result: ");
        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                System.out.print(matrix2[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void transpMatrixBoth() {

        for (int i = 0; i < CONST_i; i++) {
            for (int j = i + 1; j < CONST_j; j++) {
                int temp = matrix1[i][j];
                matrix1[i][j] = matrix1[j][i];
                matrix1[j][i] = temp;
            }
        }

        System.out.println("Result of matrix №1: ");
        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                System.out.print(matrix1[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < CONST_i; i++) {
            for (int j = i + 1; j < CONST_j; j++) {
                int temp = matrix2[i][j];
                matrix2[i][j] = matrix2[j][i];
                matrix2[j][i] = temp;
            }
        }

        System.out.println("Result of matrix №2: ");
        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                System.out.print(matrix2[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void matrixInPow1() {
        System.out.println("Enter a power of matrix: ");

        int NUMBER_OF_POW = scan.nextInt();

        if (NUMBER_OF_POW == 0) {
            System.out.println("Result: ");
            autoInputUnitMatrix();
        }
                for (int i = 0; i < CONST_i; i++) {
                    for (int j = 0; j < CONST_j; j++) {
                        matrixInPow[i][j] += (int) Math.pow(matrix1[i][j], NUMBER_OF_POW);
                    }
                }

            System.out.println("Result: ");
            for (int i = 0; i < CONST_i; i++) {
                for (int j = 0; j < CONST_j; j++) {
                    System.out.print(matrixInPow[i][j] + "  ");
                }
                System.out.println();
            }
            System.out.println();
    }

    private static void matrixInPow2() {
        System.out.println("Enter a power of matrix: ");

        int NUMBER_OF_POW = scan.nextInt();

        if (NUMBER_OF_POW == 0) {
            System.out.println("Result: ");
            autoInputUnitMatrix();
        }
            for (int i = 0; i < CONST_i; i++) {
                for (int j = 0; j < CONST_j; j++) {
                    matrixInPow[i][j] += (int) Math.pow(matrix2[i][j], NUMBER_OF_POW);
                }
            }

            System.out.println("Result: ");
            for (int i = 0; i < CONST_i; i++) {
                for (int j = 0; j < CONST_j; j++) {
                    System.out.print(matrixInPow[i][j] + "  ");
                }
                System.out.println();
            }
            System.out.println();
    }

    private static void matrixInPowBoth() {
        System.out.println("Enter a power of matrix: ");

        int NUMBER_OF_POW = scan.nextInt();

        if (NUMBER_OF_POW == 0) {
            System.out.println("Result of matrix № 1: ");
            autoInputUnitMatrix();
        }
        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                matrixInPow[i][j] += (int) Math.pow(matrix1[i][j], NUMBER_OF_POW);
            }
        }

        System.out.println("Result of matrix № 1: ");
        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                System.out.print(matrixInPow[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();


        if (NUMBER_OF_POW == 0) {
            System.out.println("Result of matrix №2: ");
            autoInputUnitMatrix();
        }
        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                matrixInPow[i][j] += (int) Math.pow(matrix2[i][j], NUMBER_OF_POW);
            }
        }

        System.out.println("Result of matrix №2: ");
        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                System.out.print(matrixInPow[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void autoInputUnitMatrix(){
        for(int i=0;i<CONST_i;i++) {
            for(int j=0;j<CONST_j;j++) {
                if(i == j) unitMatrix[i][j] = 1;
                else unitMatrix[i][j] = 0;
            }
        }
        for (int i = 0; i < CONST_i; i++) {
            for (int j = 0; j < CONST_j; j++) {
                System.out.print(unitMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
