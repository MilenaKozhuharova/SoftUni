import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] elements = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String [] commandParts = command.split(" ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "swap":
                    int firstIndex = Integer.parseInt(commandParts[1]);
                    int secondIndex = Integer.parseInt(commandParts[2]);
                    int firstElement = elements[firstIndex];
                    int secondElement = elements[secondIndex];

                    elements[firstIndex] = secondElement;
                    elements[secondIndex] = firstElement;
                    break;

                case "multiply":
                    int firstNumIndex = Integer.parseInt(commandParts[1]);
                    int secondNumIndex = Integer.parseInt(commandParts[2]);
                    int firstNum = elements[firstNumIndex];
                    int secondNum = elements[secondNumIndex];

                    int multiplication = firstNum * secondNum;

                    elements[firstNumIndex] = multiplication;
                    break;

                case "decrease":
                    for (int i = 0; i < elements.length; i++) {
                        elements[i] -= 1;
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i]);
            if (i != elements.length - 1) {
                System.out.print(", ");
            }
        }
    }

}
