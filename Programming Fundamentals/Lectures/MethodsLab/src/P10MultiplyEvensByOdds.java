import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultiplication(number));
    }

    public static int getMultiplication(int number) {
        int evensSum = getEvensSum(number);
        int oddsSum = getOddsSum(number);

        return evensSum * oddsSum;
    }

    public static int getEvensSum(int number) {
        int evensSum = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                evensSum += lastDigit;
            }
            number = number / 10;
        }

        return evensSum;
    }

    public static int getOddsSum(int number) {
        int oddsSum = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 1) {
                oddsSum += lastDigit;
            }
            number = number / 10;
        }
        return oddsSum;
    }
}
