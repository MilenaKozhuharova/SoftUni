import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] elements = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxStreak = 1;
        int maxStreakNumber = elements[0];

        int currentStreak = 1;
        int currentStreakNumber = elements[0];

        for (int i = 1; i < elements.length; i++) {
            if (elements[i] == currentStreakNumber) {
                currentStreak++;
            }

            if (elements[i] != currentStreakNumber || i == elements.length - 1) {
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                    maxStreakNumber = currentStreakNumber;
                }

                currentStreak = 1;
                currentStreakNumber = elements[i];
            }
        }

        for (int i = 0; i < maxStreak; i++) {
            System.out.print(maxStreakNumber + " ");
        }
    }
}
