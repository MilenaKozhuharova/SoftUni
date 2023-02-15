import java.util.Scanner;

public class P05PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soldGames = Integer.parseInt(scanner.nextLine());

        int hearthstone = 0;
        int fornite = 0;
        int overwatch = 0;
        int others = 0;

        for (int i = 1; i <= soldGames; i++) {
            String game = scanner.nextLine();
            if (game.equals("Hearthstone")) {
                hearthstone++;
            } else if (game.equals("Fornite")) {
                fornite++;
            } else if (game.equals("Overwatch")) {
                overwatch++;
            } else {
                others++;
            }
        }

        double hearthstonePercent = hearthstone * 100;
        double fornitePercent = fornite * 100;
        double overwatchPercent = overwatch * 100;
        double othersPercent = others * 100;


        System.out.printf("Hearthstone - %.2f%%%n", hearthstonePercent / soldGames);
        System.out.printf("Fornite - %.2f%%%n", fornitePercent / soldGames);
        System.out.printf("Overwatch - %.2f%%%n", overwatchPercent / soldGames);
        System.out.printf("Others - %.2f%%", othersPercent / soldGames);
    }
}
