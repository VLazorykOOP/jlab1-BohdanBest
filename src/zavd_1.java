import java.util.Scanner;

public class zavd_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть значення a:");
        double a = scanner.nextDouble();

        System.out.println("Введіть значення b:");
        double b = scanner.nextDouble();

        double result1 = a + (a + b - 1) / (Math.pow(a, 2) + 2) - Math.pow(a * b, 3);
        System.out.println("Результат (вхідні дані дійсного типу, результат - дійсного): " + result1);

        int aInt = (int) a;
        int bInt = (int) b;
        double result2 = aInt + (aInt + bInt - 1) / (Math.pow(aInt, 2) + 2) - Math.pow(aInt * bInt, 3);
        System.out.println("Результат (вхідні дані цілого типу, результат - дійсного): " + result2);

        int result3 = (int) (a + (a + b - 1) / (Math.pow(a, 2) + 2) - Math.pow(a * b, 3));
        System.out.println("Результат (вхідні дані дійсного типу, результат - цілого): " + result3);
    }
}