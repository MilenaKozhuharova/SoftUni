import java.util.Scanner;

public class P06EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKozunatsi = Integer.parseInt(scanner.nextLine());
        String winner = "";
        int winnerPoints = 0;
        int allPoints = 0;

        for (int i = 1; i <= countKozunatsi; i++) {
            String bakerName = scanner.nextLine();
            String command = scanner.nextLine();

            while (!command.equals("Stop")) {
                int rating = Integer.parseInt(command);
                allPoints += rating;


                command = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", bakerName, allPoints);
            if (allPoints > winnerPoints) {
                winnerPoints = allPoints;
                winner = bakerName;
                System.out.printf("%s is the new number 1!%n", winner);
            }
            allPoints = 0;

        }
        System.out.printf("%s won competition with %d points!", winner, winnerPoints);
    }
}
