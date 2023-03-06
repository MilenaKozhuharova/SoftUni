import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            if (command.startsWith("Add")) {
                int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                list.add(numberToAdd);

            } else if (command.startsWith("Insert")) {

                int numberToInsert = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);

                if (index >= 0 && index <= list.size() - 1) {
                    list.add(index, numberToInsert);

                } else {
                    System.out.println("Invalid index");
                }

            } else if (command.startsWith("Remove")) {
                int indexToRemove = Integer.parseInt(command.split("\\s+")[1]);

                if (indexToRemove >= 0 && indexToRemove <= list.size()) {
                    list.remove(indexToRemove);
                } else {
                    System.out.println("Invalid index");
                }


            } else if (command.contains("left")) {
                int countLeft = Integer.parseInt(command.split("\\s+")[2]);

                for (int i = 1; i <= countLeft; i++) {
                    int firstNum = list.get(0);
                    list.remove(0);
                    list.add(firstNum);
                }


            } else if (command.contains("right")) {
                int countRight = Integer.parseInt(command.split("\\s+")[2]);

                for (int i = 0; i < countRight; i++) {
                    int lastNum = list.get(list.size() - 1);
                    list.remove(list.size() - 1);
                    list.add(0, lastNum);

                }
            }

            command = scanner.nextLine();
        }

        for (int number : list) {
            System.out.print(number + " ");
        }

    }
}
