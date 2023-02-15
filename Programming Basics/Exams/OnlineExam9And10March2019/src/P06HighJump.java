import java.util.Scanner;

public class P06HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wantedJump = Integer.parseInt(scanner.nextLine());

        int currentHeight = wantedJump - 30;
        boolean failed = false;
        int totalJumps = 0;
        int failedJumps = 0;

        while (!failed) {
            int newHeight = Integer.parseInt(scanner.nextLine());
            totalJumps++;

            if (newHeight <= currentHeight) {
                failedJumps++;
                if (failedJumps == 3) {
                    failed = true;
                }
            } else {
                if (currentHeight >= wantedJump) {
                    break;
                }
                currentHeight += 5;
                failedJumps = 0;
            }
        }
        if (!failed) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", currentHeight, totalJumps);
        } else {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", currentHeight, totalJumps);
        }
    }
}
