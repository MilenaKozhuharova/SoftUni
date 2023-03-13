import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "swap":
                    int firstIndex = Integer.parseInt(commandParts[1]);
                    int secondIndex = Integer.parseInt(commandParts[2]);

                    int firstElement = numbers[firstIndex];
                    int secondElement = numbers[secondIndex];

                    numbers[firstIndex] = secondElement;
                    numbers[secondIndex] = firstElement;
                    break;

                case "multiply":
                    int firstIndex1 = Integer.parseInt(commandParts[1]);
                    int secondIndex1 = Integer.parseInt(commandParts[2]);

                    int firstNum = numbers[firstIndex1];
                    int secondNum = numbers[secondIndex1];

                    numbers[firstIndex1] = firstNum * secondNum;
                    break;

                case "decrease":

                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i]--;
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
