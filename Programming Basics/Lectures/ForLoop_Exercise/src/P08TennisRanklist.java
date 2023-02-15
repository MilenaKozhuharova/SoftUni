import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tours = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int wins = 0;

        for (int i = 1; i <= tours; i++) {
            String stage = scanner.nextLine();

            if (stage.equals("W")) {
                points = points + 2000;
                wins++;
            } else if (stage.equals("F")) {
                points = points + 1200;
            } else if (stage.equals("SF")) {
                points = points + 720;
            }
        }
        System.out.printf("Final points: %d%n", startingPoints + points);
        System.out.printf("Average points: %d%n", points / tours);
        System.out.printf("%.2f%%", wins * 1.0 / tours * 100);
    }
}
