import java.util.Scanner;

public class P04GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstPlayer = scanner.nextLine();
        String secondPlayer = scanner.nextLine();
        String input = scanner.nextLine();

        String winner = "";
        int pointsFirstPlayer = 0;
        int pointsSecondPlayer = 0;
        int pointsWinner = 0;

        while (!input.equals("End of game")) {
            int cardFromFirstPlayer = Integer.parseInt(input);
            int cardFromSecondPlayer = Integer.parseInt(scanner.nextLine());

            if (cardFromFirstPlayer > cardFromSecondPlayer) {
                cardFromFirstPlayer = cardFromFirstPlayer - cardFromSecondPlayer;
                pointsFirstPlayer += cardFromFirstPlayer;
            } else if (cardFromSecondPlayer > cardFromFirstPlayer) {
                cardFromSecondPlayer = cardFromSecondPlayer - cardFromFirstPlayer;
                pointsSecondPlayer += cardFromSecondPlayer;
            } else {
                System.out.println("Number wars!");
                int newCardFromFirstPlayer = Integer.parseInt(scanner.nextLine());
                int newCardFromSecondPlayer = Integer.parseInt(scanner.nextLine());

                if (newCardFromFirstPlayer > newCardFromSecondPlayer) {
                    winner = firstPlayer;
                    pointsWinner = pointsFirstPlayer;
                } else if (newCardFromSecondPlayer > newCardFromFirstPlayer) {
                    winner = secondPlayer;
                    pointsWinner = pointsSecondPlayer;
                }
                System.out.printf("%s is winner with %d points", winner, pointsWinner);
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%s has %d points%n", firstPlayer, pointsFirstPlayer);
        System.out.printf("%s has %d points", secondPlayer, pointsSecondPlayer);
    }
}
