import java.util.Scanner;

public class P05FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        int playedGames = Integer.parseInt(scanner.nextLine());

        int won = 0;
        int draw = 0;
        int lose = 0;

        if (playedGames == 0) {
            System.out.printf("%s hasn't played any games during this season.", team);
            return;
        }

        for (int i = 1; i <= playedGames; i++) {
            String result = scanner.nextLine();
            if (result.equals("W")) {
                won++;
            } else if (result.equals("D")) {
                draw++;
            } else if (result.equals("L")) {
                lose++;
            }
        }

        int wonPoints = won * 3;
        int drawPoints = draw;
        int allPoints = wonPoints + drawPoints;
        double winRate = won * 100;

        System.out.printf("%s has won %d points during this season.%n", team, allPoints);
        System.out.println("Total stats:");
        System.out.printf("## W: %d%n", won);
        System.out.printf("## D: %d%n", draw);
        System.out.printf("## L: %d%n", lose);
        System.out.printf("Win rate: %.2f%%", winRate / playedGames);
    }
}
