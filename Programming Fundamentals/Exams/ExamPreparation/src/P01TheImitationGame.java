import java.util.Scanner;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();
        StringBuilder modifiedMessage = new StringBuilder(encryptedMessage);

        String input = scanner.nextLine();

        while (!input.equals("Decode")) {
            String[] command = input.split("\\|");

            if (command[0].equals("Move")) {
                int numberOfLetters = Integer.parseInt(command[1]);

                String lettersToMove = modifiedMessage.substring(0, numberOfLetters);
                modifiedMessage.replace(0, numberOfLetters, "");
                modifiedMessage.append(lettersToMove);

            } else if (command[0].equals("Insert")) {
                int index = Integer.parseInt(command[1]);
                String value = command[2];
                modifiedMessage.insert(index, value);

            } else if (command[0].equals("ChangeAll")) {
                String substring = command[1];
                String replacement = command[2];

                String currentMessage = modifiedMessage.toString();
                currentMessage = currentMessage.replace(substring, replacement);
                modifiedMessage = new StringBuilder(currentMessage);
            }

            input = scanner.nextLine();
        }

        System.out.println("The decrypted message is: " + modifiedMessage.toString());
    }
}
