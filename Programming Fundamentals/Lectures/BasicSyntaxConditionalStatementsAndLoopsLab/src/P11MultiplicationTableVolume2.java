import java.util.Scanner;

public class P11MultiplicationTableVolume2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        for (int i = multiplier; i <= 10; i++) {
            int multiplication = number * i;
            System.out.printf("%d X %d = %d%n", number, i, multiplication);
        }
        if (multiplier > 10) {
            int multiplication = number * multiplier;
            System.out.printf("%d X %d = %d%n", number, multiplier, multiplication);
        }
    }
}
