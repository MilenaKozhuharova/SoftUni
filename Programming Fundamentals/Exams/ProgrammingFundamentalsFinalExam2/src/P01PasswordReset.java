import java.util.Scanner;

public class P01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();


        String command = scanner.nextLine();

        while (!command.equals("Done")) {

            String[] commandParts = command.split(" ");

            if (commandParts[0].equals("TakeOdd")) {

               StringBuilder newPassword = new StringBuilder();

                for (int i = 0; i <= password.length() - 1; i++) {
                    if (i % 2 == 1) {
                        char currentSymbol = password.charAt(i);
                        newPassword.append(currentSymbol);
                    }
                }
                password = newPassword.toString();
                System.out.println(password);

            } else if (commandParts[0].equals("Cut")) {

                StringBuilder newPassword = new StringBuilder(password);

                int index = Integer.parseInt(commandParts[1]);
                int length = index + Integer.parseInt(commandParts[2]);

                newPassword.delete(index, length);
                password = newPassword.toString();
                System.out.println(password);

            } else if (commandParts[0].equals("Substitute")) {

                String substring = commandParts[1];
                String substitute = commandParts[2];

                if (password.contains(substring)) {
                    password = password.replace(substring, substitute);
                    System.out.println(password);
                } else {
                    System.out.println("Nothing to replace!");
                }

            }

            command = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", password);
    }
}
