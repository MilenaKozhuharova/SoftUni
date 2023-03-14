import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {

            String[] inputParts = input.split(" ");
            String command = inputParts[0];

            switch (command) {
                case "Urgent":
                    String urgentItem = inputParts[1];

                    if (!list.contains(urgentItem)) {
                        list.add(0, urgentItem);
                    }

                    break;

                case "Unnecessary":
                    String unnecessaryItem = inputParts[1];

                    if (list.contains(unnecessaryItem)) {
                        list.remove(unnecessaryItem);
                    }
                    break;

                case "Correct":
                    String oldItem = inputParts[1];
                    String newItem = inputParts[2];


                    if (list.contains(oldItem)) {
                        int oldItemIndex = list.indexOf(oldItem);
                        list.set(oldItemIndex, newItem);
                    }
                    break;

                case "Rearrange":
                    String itemToRearrange = inputParts[1];

                    if (list.contains(itemToRearrange)) {
                        list.remove(itemToRearrange);
                        list.add(itemToRearrange);
                    }

                    break;

            }


            input = scanner.nextLine();
        }

        System.out.println(list.toString()
                .replace("[", "")
                .replace("]", ""));
    }
}
