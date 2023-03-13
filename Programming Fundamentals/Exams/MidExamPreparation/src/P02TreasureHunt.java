import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> itemsList = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {
            String[] commandParts = input.split(" ");
            String command = commandParts[0];

            switch (command) {

                case "Loot":

                    for (int i = 1; i < commandParts.length; i++) {

                        if (itemsList.contains(commandParts[i])) {
                            continue;
                        } else {
                            itemsList.add(0, commandParts[i]);
                        }
                    }

                    break;

                case "Drop":

                    int index = Integer.parseInt(commandParts[1]);

                    if (index >= 0 && index < itemsList.size()) {

                        String removedItem = itemsList.get(index);
                        itemsList.remove(index);
                        itemsList.add(removedItem);
                    }

                    break;

                case "Steal":

                    int count = Integer.parseInt(commandParts[1]);
                    List<String> stolenItems = new ArrayList<>();

                    if (itemsList.size() - count >= 0) {

                        for (int i = itemsList.size() - count; i < itemsList.size(); i++) {
                            String item = itemsList.remove(i--);
                            stolenItems.add(item);
                        }

                    } else {
                        for (int i = 0; i < itemsList.size(); i++) {
                            String item = itemsList.remove(i--);
                            stolenItems.add(item);
                        }
                    }

                    System.out.println(String.join(", ", stolenItems));

                    break;

            }

            input = scanner.nextLine();
        }

        if (itemsList.size() == 0) {
            System.out.println("Failed treasure hunt.");
        } else {
            int lettersCount = 0;
            for (int i = 0; i < itemsList.size(); i++) {
                int wordLength = itemsList.get(i).length();
                lettersCount += wordLength;
            }
            System.out.printf("Average treasure gain: %.2f pirate credits.", lettersCount * 1.0 / itemsList.size());
        }
    }
}
