import java.util.Scanner;

public class P05EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsForPlayerOne = Integer.parseInt(scanner.nextLine());
        int eggsForPlayerTwo = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            if (command.equals("one")) {
                eggsForPlayerTwo--;
            } else if (command.equals("two")) {
                eggsForPlayerOne--;
            }

            if (eggsForPlayerOne == 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsForPlayerTwo);
                break;
            } else if (eggsForPlayerTwo == 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsForPlayerOne);
                break;
            }

            command = scanner.nextLine();
        }

        if (command.equals("End")) {
            System.out.printf("Player one has %d eggs left.%n", eggsForPlayerOne);
            System.out.printf("Player two has %d eggs left.", eggsForPlayerTwo);
        }
    }
}
