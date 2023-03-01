import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleCharacters(input);
    }

    public static void printMiddleCharacters(String input) {

        if (input.length() % 2 != 0) {
            int indexOfMiddleChar = input.length() / 2;
            System.out.println(input.charAt(indexOfMiddleChar));
        } else {
            int indexSecondMiddleChar = input.length() / 2;
            int indexFirstMiddleChar = indexSecondMiddleChar - 1;

            System.out.print(input.charAt(indexFirstMiddleChar));
            System.out.println(input.charAt(indexSecondMiddleChar));
        }
    }
}
