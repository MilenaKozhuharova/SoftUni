import java.util.Scanner;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();
        StringBuilder decryptedMessage = new StringBuilder(encryptedMessage);

        String command = scanner.nextLine();

        while (!command.equals("Decode")) {
            String[] commandParts = command.split("\\|");

            if (commandParts[0].equals("Move")) {
                int numberOfLetters = Integer.parseInt(commandParts[1]);

                String lettersToMove = decryptedMessage.substring(0,numberOfLetters);
                decryptedMessage.replace(0, numberOfLetters, "");
                decryptedMessage.append(lettersToMove);

            } else if (commandParts[0].equals("Insert")) {
                int index = Integer.parseInt(commandParts[1]);
                String value = commandParts[2];

                decryptedMessage.insert(index, value);

            } else if (commandParts[0].equals("ChangeAll")) {
                String substring = commandParts[1];
                String replacement = commandParts[2];

                String currentMessage = decryptedMessage.toString();
                currentMessage = currentMessage.replace(substring, replacement);
                decryptedMessage = new StringBuilder(currentMessage);

            }

            command = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s", decryptedMessage.toString());
    }
}
