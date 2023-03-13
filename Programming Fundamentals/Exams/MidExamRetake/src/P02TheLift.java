import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waitingPeople = Integer.parseInt(scanner.nextLine());

        int[] wagons = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < wagons.length; i++) {

            if (wagons[i] < 4) {

                if (waitingPeople >= 4 - wagons[i]) {
                    waitingPeople -= 4 - wagons[i];
                    wagons[i] = 4;
                } else {
                    wagons[i] += waitingPeople;
                    waitingPeople = 0;
                }

            }

        }

        boolean isNotFull = false;

        for (int i = 0; i < wagons.length; i++) {

            if (wagons[i] < 4) {
                isNotFull = true;
                break;
            }

        }
        if (waitingPeople == 0 && isNotFull) {
            System.out.println("The lift has empty spots!");
        } else if (waitingPeople > 0 && !isNotFull) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeople);
        }

        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }


    }
}
