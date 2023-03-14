import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targets = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
        int countShot = 0;

        while (!command.equals("End")) {

            int index = Integer.parseInt(command);

            if (index >= 0 && index < targets.length) {

                for (int i = 0; i < targets.length; i++) {

                    int shotTarget = targets[index];

                    if (i != index && targets[i] != -1) {

                        if (targets[i] > shotTarget) {
                            targets[i] -= shotTarget;
                        } else {
                            targets[i] += shotTarget;
                        }
                    }
                }
                targets[index] = -1;
                countShot++;
            }

            command = scanner.nextLine();
        }

        System.out.printf("Shot targets: %d -> ", countShot);
        for (int target : targets) {
            System.out.print(target + " ");
        }
    }
}
