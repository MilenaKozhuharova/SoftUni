import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (!isBetween6And10Chars(input)) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!consistsOnlyLettersAndDigits(input)) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (!hasAtLeast2Digits(input)) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isBetween6And10Chars(input) && consistsOnlyLettersAndDigits(input) && hasAtLeast2Digits(input)) {
            System.out.println("Password is valid");
        }

    }

    public static boolean isBetween6And10Chars(String input) {
        return input.length() >= 6 && input.length() <= 10;
    }

    public static boolean consistsOnlyLettersAndDigits (String input) {

        for (char symbol : input.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasAtLeast2Digits(String input) {

        int countDigits = 0;
        for (char symbol : input.toCharArray()) {
            if (Character.isDigit(symbol)) {
                countDigits++;
            }
        }

        return countDigits >= 2;
    }
}
