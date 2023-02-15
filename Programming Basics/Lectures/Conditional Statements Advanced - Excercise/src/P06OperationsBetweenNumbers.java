import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);

        double result = 0.0;
        String evenOrOdd = "";
        boolean isZero = false;

        if (operator == '+') {
            result = numOne + numTwo;
            if (result % 2 == 0) {
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }

            System.out.printf("%d %c %d = %.0f - %s", numOne, operator, numTwo, result, evenOrOdd);

        } else if (operator == '-') {
            result = numOne - numTwo;
            if (result % 2 == 0) {
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }

            System.out.printf("%d %c %d = %.0f - %s", numOne, operator, numTwo, result, evenOrOdd);

        } else if (operator == '*') {
            result = numOne * numTwo;
            if (result % 2 == 0) {
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }

            System.out.printf("%d %c %d = %.0f - %s", numOne, operator, numTwo, result, evenOrOdd);

        } else if (operator == '/') {
            if (numTwo == 0) {
                isZero = true;
                System.out.printf("Cannot divide %d by zero", numOne);
            } else {
                result = numOne * 1.0 / numTwo;
                System.out.printf("%d / %d = %.2f", numOne, numTwo, result);
            }

        } else if (operator == '%') {
            if (numTwo == 0) {
                isZero = true;
                System.out.printf("Cannot divide %d by zero", numOne);
            } else {
                result = numOne % numTwo;
                System.out.printf("%d %% %d = %.0f", numOne, numTwo, result);
            }

        }


    }
}
