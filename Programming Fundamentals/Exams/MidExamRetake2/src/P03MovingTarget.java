import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] commandParts = input.split(" ");
            String command = commandParts[0];
            int index = Integer.parseInt(commandParts[1]);

            switch (command) {

                case "Shoot":
                    int power = Integer.parseInt(commandParts[2]);

                    if (doesIndexExist(index, targets)) {

                        targets.set(index, targets.get(index) - power);

                        if (targets.get(index) <= 0) {
                            targets.remove(index);
                        }
                    }
                    break;

                case "Add":
                    int value = Integer.parseInt(commandParts[2]);

                    if (doesIndexExist(index, targets)) {

                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }

                    break;

                case "Strike":
                    int radius = Integer.parseInt(commandParts[2]);

                    int start = index - radius;
                    int end = index + radius;

                    if (doesIndexExist(index, targets) && start >= 0 && end < targets.size()) {
                        targets.subList(start, end + 1).clear();
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(targets.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "|")
                .replace(" ", ""));
    }

    public static boolean doesIndexExist (int index, List<Integer> targets) {

        if (index >= 0 && index < targets.size()) {
            return true;
        }
        return false;
    }
}
