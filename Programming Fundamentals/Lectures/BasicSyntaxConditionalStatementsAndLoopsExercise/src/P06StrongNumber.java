import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int factorialSum = 0;

        for (int i = 0; i < number.length(); i++) {
            int currentNumber = Character.getNumericValue(number.charAt(i));
            int factorial = 1;

            for (int j = 1; j <= currentNumber; j++) {
                factorial *= j;
            }

            factorialSum += factorial;
        }

        if (Integer.parseInt(number) == factorialSum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
