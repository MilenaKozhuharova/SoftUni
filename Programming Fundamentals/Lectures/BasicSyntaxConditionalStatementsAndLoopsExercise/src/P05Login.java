import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String correctPassword = "";
        int tries = 0;

        for (int i = username.length() - 1; i >= 0; i--) {
            char currentChar = username.charAt(i);
            correctPassword += currentChar;
        }

        String enteredPassword = scanner.nextLine();

        while (!enteredPassword.equals(correctPassword)) {
            tries++;
            if (tries == 4) {
                System.out.printf("User %s blocked!", username);
                return;
            }
            System.out.println("Incorrect password. Try again.");

            enteredPassword = scanner.nextLine();

        }
        System.out.printf("User %s logged in.", username);
    }
}
