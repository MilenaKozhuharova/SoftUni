import java.util.Scanner;

public class P01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int wonBattles = 0;

        boolean outOfEnergy = false;

        while (!command.equals("End of battle")) {
            int distance = Integer.parseInt(command);

            if (initialEnergy - distance < 0) {
                outOfEnergy = true;
                break;
            } else {
                initialEnergy -= distance;
                wonBattles++;

                if (wonBattles % 3 == 0) {
                    initialEnergy += wonBattles;
                }
            }

            command = scanner.nextLine();
        }

        if (outOfEnergy) {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattles, initialEnergy);
        } else if (command.equals("End of battle")) {
            System.out.printf("Won battles: %d. Energy left: %d", wonBattles, initialEnergy);
        }
    }
}
