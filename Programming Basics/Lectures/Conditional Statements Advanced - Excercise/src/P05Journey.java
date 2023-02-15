import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String place = "";
        double sum = 0;

        if (budget <= 100) {
            destination = "Bulgaria";

            if (season.equals("summer")) {
                sum = budget * 0.30;
                place = "Camp";
            } else if (season.equals("winter")) {
                sum = budget * 0.70;
                place = "Hotel";
            }

        } else if (budget <= 1000) {
            destination = "Balkans";

            if (season.equals("summer")) {
                sum = budget * 0.40;
                place = "Camp";
            } else if (season.equals("winter")) {
                sum = budget * 0.80;
                place = "Hotel";
            }

        } else if (budget > 1000) {
            destination = "Europe";
            sum = budget * 0.90;
            place = "Hotel";

        }



        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", place, sum);
    }
}
