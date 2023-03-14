import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] neighborhood = Arrays.stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
        int currentIndex = 0;

        while (!command.equals("Love!")) {
            int jumpDistance = Integer.parseInt(command.split(" ")[1]);

            currentIndex += jumpDistance;

            if (currentIndex >= neighborhood.length) {
                currentIndex = 0;
            }

            if (neighborhood[currentIndex] != 0) {
                neighborhood[currentIndex] -= 2;

                if (neighborhood[currentIndex] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                }
            } else {
                System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
            }


            command = scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.%n", currentIndex);

        boolean isSuccessful = true;
        for (int house : neighborhood) {
            if (house != 0) {
                isSuccessful = false;
                break;
            }
        }

        int housesCount = 0;

        for (int house : neighborhood) {
            if (house != 0) {
                housesCount++;
            }
        }

        if (isSuccessful) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", housesCount);
        }
    }
}
