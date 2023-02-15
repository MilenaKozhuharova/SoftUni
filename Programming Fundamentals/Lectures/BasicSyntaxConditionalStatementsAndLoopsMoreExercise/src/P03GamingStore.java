import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double price = 0;
        double spent = 0;

        while (!input.equals("Game Time")) {
            String game = input;
            if (game.equals("OutFall 4")) {
                price = 39.99;
            } else if (game.equals("CS: OG")) {
                price = 15.99;
            } else if (game.equals("Zplinter Zell")) {
                price = 19.99;
            } else if (game.equals("Honored 2")) {
                price = 59.99;
            } else if (game.equals("RoverWatch")) {
                 price = 29.99;
            } else if (game.equals("RoverWatch Origins Edition")) {
                price = 39.99;
            } else {
                System.out.println("Not Found");
                input = scanner.nextLine();
                continue;
            }

            if (price > currentBalance) {
                System.out.println("Too Expensive");
                input = scanner.nextLine();
                continue;
            }
            if (currentBalance >= price || game.equals("OutFall 4") || game.equals("CS: OG") || game.equals("Zplinter Zell") ||
            game.equals("Honored 2") || game.equals("RoverWatch") || game.equals("RoverWatch Origins Edition")) {
                currentBalance -= price;
                spent += price;
                System.out.printf("Bought %s%n", game);
            }
            if (currentBalance == 0) {
                System.out.println("Out of money!");
                return;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spent, currentBalance);
    }
}
