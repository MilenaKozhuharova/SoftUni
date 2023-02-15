import java.util.Scanner;

public class P05Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double initialPoints = Double.parseDouble(scanner.nextLine());
        int evaluators = Integer.parseInt(scanner.nextLine());

        double totalPoints = initialPoints;

        for (int i = 1; i <= evaluators; i++) {
            String evaluatorName = scanner.nextLine();
            double currentPoints = Double.parseDouble(scanner.nextLine());

            double currentPointsSum = (evaluatorName.length() * currentPoints) / 2;

            if (totalPoints < 1250.5) {
                totalPoints = totalPoints + currentPointsSum;
            }
        }

        if (totalPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - totalPoints);
        }
    }
}
