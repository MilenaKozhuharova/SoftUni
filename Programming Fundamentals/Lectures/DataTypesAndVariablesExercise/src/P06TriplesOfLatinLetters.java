import java.util.Scanner;

public class P06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (char firstLetter = 'a'; firstLetter < 'a' + n; firstLetter++) {
            for (int secondLetter = 'a'; secondLetter < 'a' + n; secondLetter++) {
                for (int thirdLetter = 'a'; thirdLetter < 'a' + n; thirdLetter++) {
                    System.out.printf("%c%c%c%n", firstLetter, secondLetter, thirdLetter);

                }

            }

        }
    }
}
