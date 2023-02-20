import java.util.Scanner;

public class P02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String[] inputArr = scanner.nextLine().split(" ");
            long firstNumber = Long.parseLong(inputArr[0]);
            long secondNumber = Long.parseLong(inputArr[1]);

            long currentNumber = Math.abs(Math.max(firstNumber, secondNumber));
            long sumOfDigits = 0;
            long currentDigit;

            while (currentNumber > 0) {
                currentDigit = (currentNumber % 10);
                sumOfDigits += currentDigit;
                currentNumber /= 10;
            }

            System.out.println(sumOfDigits);
        }
    }
}
