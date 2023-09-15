import java.util.Scanner;

public class zavd_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть значення b: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть кількість елементів масиву X: ");
        int n = scanner.nextInt();

        double[] X = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введіть значення X[" + i + "]: ");
            X[i] = scanner.nextDouble();
        }

        double sumLessThanA = 0;
        double productGreaterThanB = 1;
        double maxInRange = Double.MIN_VALUE;
        double minInRange = Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (X[i] < a) {
                sumLessThanA += X[i];
            } else if (X[i] > b) {
                productGreaterThanB *= X[i];
            } else if (X[i] >= a && X[i] <= b) {
                maxInRange = Math.max(maxInRange, X[i]);
                minInRange = Math.min(minInRange, X[i]);
            }
        }

        System.out.println("Сума всіх X(i) < a: " + sumLessThanA);
        System.out.println("Добуток всіх X(i) > b: " + productGreaterThanB);
        System.out.println("Максимальне значення X(i) в діапазоні [a, b]: " + maxInRange);
        System.out.println("Мінімальне значення X(i) в діапазоні [a, b]: " + minInRange);
    }
}
