// ! Write a program to find sum of two matrices of 3 x3.
import java.util.Scanner;

public class Practical_3 {
    public static void main(String[] args) {
        // Declare two 3x3 matrices and a result matrix
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] sumMatrix = new int[3][3];

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input for first matrix
        System.out.println("Enter elements for the first 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("matrix1[" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input for second matrix
        System.out.println("Enter elements for the second 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("matrix2[" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sum of both matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display the result matrix
        System.out.println("\nSum of the two matrices is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sumMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}

// import java.util.Scanner;

// public class Practical_3 {
//     private static final int ROWS = 3;
//     private static final int COLS = 3;

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int[][] matrix1 = inputMatrix(scanner, "first");
//         int[][] matrix2 = inputMatrix(scanner, "second");

//         int[][] sumMatrix = addMatrices(matrix1, matrix2);

//         System.out.println("\nThe First Matrix:");
//         displayMatrix(matrix1);

//         System.out.println("\nThe Second Matrix:");
//         displayMatrix(matrix2);

//         System.out.println("\nThe Sum of the Matrices:");
//         displayMatrix(sumMatrix);

//         scanner.close();
//     }

//     private static int[][] inputMatrix(Scanner scanner, String ordinal) {
//         int[][] matrix = new int[ROWS][COLS];
//         System.out.println("Enter elements for the " + ordinal + " " + ROWS + "x" + COLS + " matrix:");

//         for (int i = 0; i < ROWS; i++) {
//             for (int j = 0; j < COLS; j++) {
//                 while (true) {
//                     System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
//                     if (scanner.hasNextInt()) {
//                         matrix[i][j] = scanner.nextInt();
//                         break;
//                     } else {
//                         System.out.println("Invalid input. Please enter an integer.");
//                         scanner.next(); // Clear the invalid input
//                     }
//                 }
//             }
//         }
//         return matrix;
//     }

//     private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
//         int[][] result = new int[ROWS][COLS];
//         for (int i = 0; i < ROWS; i++) {
//             for (int j = 0; j < COLS; j++) {
//                 result[i][j] = matrix1[i][j] + matrix2[i][j];
//             }
//         }
//         return result;
//     }

//     private static void displayMatrix(int[][] matrix) {
//         for (int[] row : matrix) {
//             for (int element : row) {
//                 System.out.print(element + "\t");
//             }
//             System.out.println();
//         }
//     }
// }

