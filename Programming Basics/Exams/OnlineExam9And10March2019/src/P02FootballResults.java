import java.util.Scanner;

public class P02FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstMatch = scanner.nextLine();
        String secondMatch = scanner.nextLine();
        String thirdMatch = scanner.nextLine();

        int wins = 0;
        int lost = 0;
        int draws = 0;

        if (firstMatch.charAt(0) > firstMatch.charAt(2)) {
            wins++;
        } else if (firstMatch.charAt(0) < firstMatch.charAt(2)) {
            lost++;
        } else {
            draws++;
        }

        if (secondMatch.charAt(0) > secondMatch.charAt(2)) {
            wins++;
        } else if (secondMatch.charAt(0) < secondMatch.charAt(2)) {
            lost++;
        } else {
            draws++;
        }

        if (thirdMatch.charAt(0) > thirdMatch.charAt(2)) {
            wins++;
        } else if (thirdMatch.charAt(0) < thirdMatch.charAt(2)) {
            lost++;
        } else {
            draws++;
        }

        System.out.printf("Team won %d games.%n", wins);
        System.out.printf("Team lost %d games.%n", lost);
        System.out.printf("Drawn games: %d", draws);
    }
}
