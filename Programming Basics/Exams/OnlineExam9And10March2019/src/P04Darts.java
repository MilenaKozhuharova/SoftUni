import java.util.Scanner;

public class P04Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String input = scanner.nextLine();
        int initialPoints = 301;
        int successfulShots = 0;
        int unsuccessfulShots = 0;

        while (!input.equals("Retire")) {
            String field = input;
            int points = Integer.parseInt(scanner.nextLine());

            if (field.equals("Single")) {
                points = points;
            } else if (field.equals("Double")) {
                points = points * 2;
            } else if (field.equals("Triple")) {
                points = points * 3;
            }

            if (points <= initialPoints) {
                initialPoints = initialPoints - points;
                successfulShots++;
            } else {
                unsuccessfulShots++;
            }

            if (initialPoints == 0) {
                System.out.printf("%s won the leg with %d shots.", name, successfulShots);
                return;
            }

            input = scanner.nextLine();
        }



        System.out.printf("%s retired after %d unsuccessful shots.", name, unsuccessfulShots);
    }
}
