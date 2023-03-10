import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        int count = 0;

        while (!input.equals("end")) {
            count++;
            String[] inputParts = input.split(" ");
            int firstIndex = Integer.parseInt(inputParts[0]);
            int secondIndex = Integer.parseInt(inputParts[1]);

            if (isCheating(firstIndex, secondIndex, elements)) {

                System.out.println("Invalid input! Adding additional elements to the board");
                elements.add(elements.size() / 2, String.format("-%da",count));
                elements.add(elements.size() / 2, String.format("-%da",count));

            } else {
                String firstElement = elements.get(firstIndex);
                String secondElement = elements.get(secondIndex);

                if (firstElement.equals(secondElement)) {

                    System.out.printf("Congrats! You have found matching elements - %s!%n", firstElement);

                    elements.remove(firstElement);
                    elements.remove(secondElement);

                } else {
                    System.out.println("Try again!");
                }
            }

            if (elements.isEmpty()) {
                break;
            }


            input = scanner.nextLine();
        }

        if (elements.isEmpty()) {
            System.out.printf("You have won in %d turns!%n", count);
        } else {
            System.out.println("Sorry you lose :(");
            for (String element : elements) {
                System.out.print(element + " ");
            }
        }
    }

    public static boolean isCheating (int firstIndex, int secondIndex, List<String> elements) {
        if (firstIndex == secondIndex || isIndexInvalid(firstIndex, elements) || isIndexInvalid(secondIndex, elements)) {
            return true;
        }
        return false;
    }

    public static boolean isIndexInvalid (int index, List<String> elements) {
        if (index < 0 || index >= elements.size()) {
            return true;
        }
        return false;
    }
}


