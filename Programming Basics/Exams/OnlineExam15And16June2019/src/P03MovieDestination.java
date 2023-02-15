import java.util.Scanner;

public class P03MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double allSum = 0;

        if (destination.equals("Dubai")) {
            if (season.equals("Winter")) {
                allSum = days * 45000;
                allSum = allSum - (0.3 * allSum);
            } else if (season.equals("Summer")) {
                allSum = days * 40000;
                allSum = allSum - (0.3 * allSum);
            }

        } else if (destination.equals("Sofia")) {
            if (season.equals("Winter")) {
                allSum = days * 17000;
                allSum = allSum + (0.25 * allSum);

            } else if (season.equals("Summer")) {
                allSum = days * 12500;
                allSum = allSum + (0.25 * allSum);
            }
        } else if (destination.equals("London")) {
            if (season.equals("Winter")) {
                allSum = days * 24000;
            } else if (season.equals("Summer")) {
                allSum = days * 20250;
            }
        }

        if (allSum <= budget) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - allSum);
        } else {
            System.out.printf("The director needs %.2f leva more!", Math.abs(allSum - budget));
        }
    }
}
