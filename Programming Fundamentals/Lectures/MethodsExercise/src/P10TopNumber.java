import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (isSumOfDigitsDivisibleBy8(i) && hasOddDigit(i)) {
                System.out.println(i);
            }
        }
    }


    public static boolean isSumOfDigitsDivisibleBy8(int number) {
        int digitsSum = 0;
        boolean isDivisibleBy8 = false;

        while (number != 0) {
            int lastDigit = number % 10;
            digitsSum += lastDigit;
            number = number / 10;
        }

        return digitsSum % 8 == 0;
    }

    public static boolean hasOddDigit(int number) {

        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                number = number / 10;
            }
        }
        return false;
    }
}
