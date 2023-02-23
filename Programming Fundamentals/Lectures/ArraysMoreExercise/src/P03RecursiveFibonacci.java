import java.util.Scanner;

public class P03RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] previousTwoNumbers = new int[2];
        previousTwoNumbers[0] = 1;
        previousTwoNumbers[1] = 1;

        for (int i = 2; i < n; i++) {
            int currentNumber = previousTwoNumbers[0] + previousTwoNumbers[1];
            previousTwoNumbers[0] = previousTwoNumbers[1];
            previousTwoNumbers[1] = currentNumber;
        }
        System.out.println(previousTwoNumbers[1]);
    }
}
