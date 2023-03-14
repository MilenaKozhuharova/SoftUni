import java.util.Scanner;

public class P01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int countWins = 0;

        while (!command.equals("End of battle")) {

            int distance = Integer.parseInt(command);

            if (distance <= energy) {
                energy -= distance;
                countWins++;
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", countWins, energy);
                return;
            }

            if (countWins % 3 == 0) {
                energy += countWins;
            }


            command = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", countWins, energy);
    }
}
