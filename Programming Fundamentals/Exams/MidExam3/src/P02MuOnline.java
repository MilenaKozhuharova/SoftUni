import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> rooms = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        int health = 100;
        int bitcoins = 0;
        int bestRoom = 0;

        for (int i = 0; i < rooms.size(); i++) {
            String[] commandParts = rooms.get(i).split(" ");
            String command = commandParts[0];
            int number = Integer.parseInt(commandParts[1]);
            bestRoom++;


            if (command.equals("potion")) {
                int currentHealth = health;
                health += number;

                if (health > 100) {
                    health = 100;
                    int amount = 100 - currentHealth;
                    System.out.printf("You healed for %d hp.%n", amount);
                } else {
                    System.out.printf("You healed for %d hp.%n", number);
                }
                System.out.printf("Current health: %d hp.%n", health);

            } else if (command.equals("chest")) {

                bitcoins += number;
                System.out.printf("You found %d bitcoins.%n", number);

            } else {
                health -= number;

                if (health > 0) {
                    System.out.printf("You slayed %s.%n", command);
                } else {
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d", bestRoom);
                    return;
                }

            }
        }

        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", bitcoins);
        System.out.printf("Health: %d%n", health);

    }
}
