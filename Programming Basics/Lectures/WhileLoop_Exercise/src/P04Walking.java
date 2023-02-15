import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int allSteps = 0;
        int targetSteps = 10000;

        while (!input.equals("Going home")) {
            int steps = Integer.parseInt(input);
            allSteps = allSteps + steps;
            if (allSteps > targetSteps) {
                System.out.printf("Goal reached! Good job!%n%d steps over the goal!", allSteps - targetSteps);
                return;
            }
            input = scanner.nextLine();
        }
        int stepsToHome = Integer.parseInt(scanner.nextLine());
        allSteps = allSteps + stepsToHome;
        if (allSteps > targetSteps) {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", allSteps - targetSteps);
        } else {
            System.out.printf("%d more steps to reach goal.", targetSteps - allSteps);
        }
    }
}
