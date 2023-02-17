import java.util.Scanner;

public class P03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberA = Double.parseDouble(scanner.nextLine());
        double numberB = Double.parseDouble(scanner.nextLine());
        double eps = 0.000001;

        boolean isEqual = Math.abs(numberA - numberB) < eps;

        if (isEqual) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
