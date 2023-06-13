import java.util.Scanner;

public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String concealedMessage = scanner.nextLine();
        StringBuilder message = new StringBuilder(concealedMessage);

        String command = scanner.nextLine();

        while (!command.equals("Reveal")) {

            String[] commandParts = command.split(":\\|:");

            if (commandParts[0].equals("InsertSpace")) {
                int index = Integer.parseInt(commandParts[1]);
                message.insert(index, " ");
                System.out.println(message.toString());

            } else if (commandParts[0].equals("Reverse")) {
                String substring = commandParts[1];

                if (message.toString().contains(substring)) {
                    int startIndex = message.indexOf(substring);
                    int endIndex = startIndex + substring.length();
                    String reversed = "";

                    for (int i = 0; i < substring.length(); i++) {
                        char currentSymbol = substring.charAt(i);
                        reversed = currentSymbol + reversed;
                    }

                    message.delete(startIndex, endIndex);
                    message.append(reversed);
                    System.out.println(message.toString());
                } else {
                    System.out.println("error");
                }

            } else if (commandParts[0].equals("ChangeAll")) {
                String substring = commandParts[1];
                String replacement = commandParts[2];

                String currentMessage = message.toString();
                currentMessage = currentMessage.replace(substring, replacement);
                message = new StringBuilder(currentMessage);
                System.out.println(message.toString());

            }

            command = scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s", message.toString());
    }
}
