import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.startsWith("Contains")) {
                int numberToCheck = Integer.parseInt(command.split(" ")[1]);
                printContains(numbers, numberToCheck);

            } else if (command.equals("Print even")) {
                printEvenNumbers(numbers);

            } else if (command.equals("Print odd")) {
                printOddNumbers(numbers);

            } else if (command.contains("Get")) {
                getSum(numbers);

            } else if (command.startsWith("Filter")) {

                String condition = command.split(" ")[1];
                int numberToFilter = Integer.parseInt(command.split(" ")[2]);
                printFilteredNumbers(numbers, condition, numberToFilter);

            }


            command = scanner.nextLine();
        }
    }

    public static void printContains(List<Integer> numbers, int numberToCheck) {
        if (numbers.contains(numberToCheck)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

    public static void printEvenNumbers(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static void printOddNumbers(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static void getSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    public static void printFilteredNumbers(List<Integer> numbers, String condition, int numberToFilter) {
        // '<', '>', ">=", "<="

        switch (condition) {

            case "<":
                for (int number : numbers) {
                    if (number < numberToFilter) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;

            case ">":
                for (int number : numbers) {
                    if (number > numberToFilter) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();

                break;

            case ">=":
                for (int number : numbers) {
                    if (number >= numberToFilter) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;

            case "<=":
                for (int number : numbers) {
                    if (number <= numberToFilter) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
        }

    }
}
