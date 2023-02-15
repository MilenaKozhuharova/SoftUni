import java.util.Scanner;

public class P04MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("ACTION")) {
            String actorName = input;
            if (actorName.length() <= 15) {
                double reward = Double.parseDouble(scanner.nextLine());
                budget = budget - reward;
            } else {
                budget -= budget * 0.2;
            }

            if (budget < 0) {
                break;
            }
        input = scanner.nextLine();
        }
        if (input.equals("ACTION")) {
            System.out.printf("We are left with %.2f leva.", budget);
        } else {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        }

    }
}