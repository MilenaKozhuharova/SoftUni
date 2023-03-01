import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        printCharactersInBetween(firstChar, secondChar);
    }

    public static void printCharactersInBetween(char firstChar, char secondChar) {

        if (firstChar < secondChar) {
            //започваме от първия
            for (char i = (char)(firstChar + 1); i < secondChar; i++) {
                System.out.print(i + " ");
            }

        } else {
            //започваме от втория
            for (char i = (char)(secondChar + 1); i < firstChar; i++) {
                System.out.print(i + " ");
            }

        }
    }
}
