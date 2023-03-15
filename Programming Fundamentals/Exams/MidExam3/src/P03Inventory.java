import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {

            String[] commandParts = input.split(" - ");
            String command = commandParts[0];

            if (command.startsWith("Collect")) {

                String itemToCollect = commandParts[1];

                if (!items.contains(itemToCollect)) {
                    items.add(itemToCollect);
                }

            } else if (command.startsWith("Drop")) {

                String itemToDrop = commandParts[1];

                if (items.contains(itemToDrop)) {
                    items.remove(itemToDrop);
                }

            } else if (command.contains("Combine Items")) {
                String[] itemsToCombine = commandParts[1].split(":");
                String oldItem = itemsToCombine[0];
                String newItem = itemsToCombine[1];

                if (items.contains(oldItem)) {
                    int oldItemIndex = items.indexOf(oldItem);
                    items.add(oldItemIndex + 1, newItem);
                }

            } else if (command.startsWith("Renew")) {

                String itemToRenew = commandParts[1];

                if (items.contains(itemToRenew)) {
                    items.remove(itemToRenew);
                    items.add(itemToRenew);
                }
            }

            input = scanner.nextLine();
        }

        System.out.println(items.toString().replace("[", "").replace("]", ""));

    }
}
