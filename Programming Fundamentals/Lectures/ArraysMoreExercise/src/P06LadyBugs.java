import java.util.Arrays;
import java.util.Scanner;

public class P06LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] field = new int[fieldSize]; // цялото поле -> празно
        int[] ladyBugsIndexes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray(); // къде има калинки

        for (int ladyBugIndex : ladyBugsIndexes) {
            if (ladyBugIndex < 0 || ladyBugIndex >= field.length) {
                continue;
            }

            field[ladyBugIndex] = 1; // гледа прочетените (заети) индекси и ги поставя в незаетото поле
        }

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            String leftOrRight = commandParts[1];

            int ladyBugPosition = Integer.parseInt(commandParts[0]);
            int flyLength = Integer.parseInt(commandParts[2]);

            // лети когато индекса й е зает и когато е в полето
            if (ladyBugPosition >= 0 && ladyBugPosition < field.length && field[ladyBugPosition] == 1) { // ще лети
                // след като излети -> индекса й става 0
                field[ladyBugPosition] = 0;

                if (leftOrRight.equals("left")) {
                    ladyBugPosition -= flyLength;
                } else {
                    ladyBugPosition += flyLength;
                }

                // спира да лети когато излезе от полето или ако на новата й позиция няма калинка
                // продължава -> има калинка на мястото й
                while (ladyBugPosition >= 0 && ladyBugPosition < field.length && field[ladyBugPosition] == 1) { // докато е заето мястото
                    if (leftOrRight.equals("left")) {
                        ladyBugPosition -= flyLength;
                    } else {
                        ladyBugPosition += flyLength;
                    }
                }

                if (ladyBugPosition >= field.length || ladyBugPosition < 0) {
                    continue;
                }

                field[ladyBugPosition] = 1;
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < field.length; i++) {
            System.out.print(field[i] + " ");
        }
    }
}
