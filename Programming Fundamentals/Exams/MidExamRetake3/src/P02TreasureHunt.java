import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {

            String[] commandParts = input.split(" ");
            String command = commandParts[0];

            switch (command) {

                case "Loot":

                    for (int i = 1; i < commandParts.length; i++) {
                        String itemToLoot = commandParts[i];

                        if (!items.contains(itemToLoot)) {
                            items.add(0, itemToLoot);
                        }
                    }
                    break;

                case "Drop":
                    int index = Integer.parseInt(commandParts[1]);

                    if (index > 0 && index <= items.size()) {
                        String itemAtIndex = items.get(index);
                        items.remove(index);
                        items.add(itemAtIndex);
                    }

                    break;

                case "Steal":

                    int count = Integer.parseInt(commandParts[1]);
                    List<String> stolenItems = new ArrayList<>();

                    if (count > items.size()) {
                        count = items.size();
                    }
                    for (int i = items.size() - count; i < items.size(); i++) {
                        String currentItem = items.remove(i--);
                        stolenItems.add(currentItem);
                    }

                    System.out.println(String.join(", ", stolenItems));

                    break;

            }

            input = scanner.nextLine();
        }

        if (items.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {

            int lettersCount = 0;

            for (int i = 0; i < items.size(); i++) {
                int itemLength = items.get(i).length();
                lettersCount += itemLength;
            }

            System.out.printf("Average treasure gain: %.2f pirate credits.", lettersCount * 1.0 / items.size());

        }


    }
}
