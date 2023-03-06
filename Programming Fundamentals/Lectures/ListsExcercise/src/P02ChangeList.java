import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.startsWith("Delete")) {
                int elementToDelete = Integer.parseInt(command.split(" ")[1]);
                list.removeAll(Arrays.asList(elementToDelete));

            } else if (command.startsWith("Insert")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);

                list.add(index, number);

            }

            command = scanner.nextLine();
        }
        for (int number : list) {
            System.out.print(number + " ");
        }
    }
}
