import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a: ");
        a = scanner.nextDouble();

        System.out.println("Enter side b: ");
        b = scanner.nextDouble();

        System.out.println("Enter side c: ");
        c = scanner.nextDouble();
        scanner.close();

        double result = TriangelFormula(a, b, c);
        System.out.println(result);

    }

    public static double TriangelFormula(double a, double b, double c) {
        return Math.sqrt((a * a) + (b * b));
    }

}