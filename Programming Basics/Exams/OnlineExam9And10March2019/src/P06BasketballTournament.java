import java.util.Scanner;

public class P06BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int wins = 0;
        int lost = 0;

        while (!input.equals("End of tournaments")) {
            String tournamentName = input;
            int matches = Integer.parseInt(scanner.nextLine());
            for (int i = 1; i <= matches; i++) {
                int teamDesi = Integer.parseInt(scanner.nextLine());
                int teamOthers = Integer.parseInt(scanner.nextLine());

                if (teamDesi > teamOthers) {
                    wins++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, tournamentName, teamDesi - teamOthers);
                } else {
                    lost++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, tournamentName, teamOthers - teamDesi);
                }
            }

            input = scanner.nextLine();
        }
        int allMatches = wins + lost;
        double percentWon = wins * 1.0 / allMatches * 100;
        double percentLost = lost * 1.0 / allMatches * 100;
        System.out.printf("%.2f%% matches win%n", percentWon);
        System.out.printf("%.2f%% matches lost%n", percentLost);

    }
}
