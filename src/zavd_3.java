import java.util.Random;

public class zavd_3 {
    public static void main(String[] args) {
        int n = 3;

        int[][] A = generateRandomMatrix(n);
        int[][] B = generateRandomMatrix(n);

        int[][] X = new int[n][n];

        int maxB = B[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (B[i][j] > maxB) {
                    maxB = B[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                X[i][j] = A[i][j] * maxB;
            }
        }

        System.out.println("Матриця A:");
        printMatrix(A);

        System.out.println("Матриця B:");
        printMatrix(B);

        System.out.println("Матриця X:");
        printMatrix(X);
    }

    public static int[][] generateRandomMatrix(int n) {
        int[][] matrix = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
