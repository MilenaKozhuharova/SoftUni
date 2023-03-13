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
        int countMoves = 0;

        while (!input.equals("end")) {
            countMoves++;
            String[] inputParts = input.split(" ");
            int firstIndex = Integer.parseInt(inputParts[0]);
            int secondIndex = Integer.parseInt(inputParts[1]);

            if (isCheating(firstIndex, secondIndex, elements)) {

                elements.add(elements.size() / 2, String.format("-%da", countMoves));
                elements.add(elements.size() / 2, String.format("-%da", countMoves));
                System.out.println("Invalid input! Adding additional elements to the board");

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
            System.out.printf("You have won in %d turns!%n", countMoves);
        } else {
            System.out.println("Sorry you lose :(");
            for (String element : elements) {
                System.out.print(element + " ");
            }
        }
    }

    public static boolean isCheating (int firstIndex, int secondIndex, List<String> elements) {

        if (areIndexesEqual(firstIndex, secondIndex) || !isIndexValid(firstIndex, elements) || !isIndexValid(secondIndex, elements)) {
            return true;
        }
        return false;
    }

    public static boolean areIndexesEqual (int firstIndex, int secondIndex) {
        if (firstIndex == secondIndex) {
            return true;
        }
        return false;
    }

    public static boolean isIndexValid (int index, List<String> elements) {

        if (index < 0 || index >= elements.size()) {
            return false;
        }
        return true;
    }
}
