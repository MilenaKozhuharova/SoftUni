import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int lastNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int combination = 0;

        for (int x1 = firstNumber; x1 <= lastNumber; x1++) {
            for (int x2 = firstNumber; x2 <= lastNumber ; x2++) {
                combination++;
                int sum = x1 + x2;
                if (sum == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combination, x1, x2, sum);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", combination, magicNumber);
    }
}
