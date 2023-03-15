import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                .mapToInt(Integer::parseInt).toArray();

        int[] warShip = Arrays.stream(scanner.nextLine().split(">"))
                .mapToInt(Integer::parseInt).toArray();

        int maxHealth = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Retire")) {

            String[] commandParts = input.split(" ");
            String command = commandParts[0];

            switch (command) {

                case "Fire":

                    int fireIndex = Integer.parseInt(commandParts[1]);
                    int fireDamage = Integer.parseInt(commandParts[2]);

                    if (fireIndex >= 0 && fireIndex <= warShip.length - 1) {
                        warShip[fireIndex] -= fireDamage;

                        if (warShip[fireIndex] <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }
                    }

                    break;

                case "Defend":

                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);
                    int defendDamage = Integer.parseInt(commandParts[3]);

                    if (startIndex >= 0 && endIndex <= pirateShip.length - 1) {

                        for (int i = startIndex; i <= endIndex; i++) {
                            pirateShip[i] -= defendDamage;

                            if (pirateShip[i] <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            }
                        }

                    }

                    break;

                case "Repair":

                    int repairIndex = Integer.parseInt(commandParts[1]);
                    int health = Integer.parseInt(commandParts[2]);

                    if (repairIndex >= 0 && repairIndex <= pirateShip.length - 1) {
                        pirateShip[repairIndex] += health;

                        if (pirateShip[repairIndex] > maxHealth) {
                            pirateShip[repairIndex] = maxHealth;
                        }
                    }


                    break;

                case "Status":

                    double lowerThan = maxHealth * 0.2;
                    int sectionsCount = 0;

                    for (int section : pirateShip) {
                        if (section < lowerThan) {
                            sectionsCount++;
                        }
                    }

                    System.out.printf("%d sections need repair.%n", sectionsCount);

                    break;
            }


            input = scanner.nextLine();
        }

        int pirateShipStatus = 0;
        int warShipStatus = 0;

        for (int section : pirateShip) {
            pirateShipStatus += section;
        }

        for (int section : warShip) {
            warShipStatus += section;
        }

        System.out.printf("Pirate ship status: %d%n", pirateShipStatus);
        System.out.printf("Warship status: %d", warShipStatus);
    }
}
