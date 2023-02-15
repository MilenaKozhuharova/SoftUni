import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double rent = 0;
        double addedRent = 0;

        if (season.equals("Spring")) {
            rent = 3000;

            if (fishermen <= 6) {
                rent = rent - (rent * 0.10);
            } else if (fishermen > 7 && fishermen <= 11) {
                rent = rent - (rent * 0.15);
            } else if (fishermen >= 12) {
                rent = rent - (rent * 0.25);
            }

        } else if (season.equals("Summer")) {
            rent = 4200;

            if (fishermen <= 6) {
                rent = rent - (rent * 0.10);
            } else if (fishermen > 7 && fishermen <= 11) {
                rent = rent - (rent * 0.15);
            } else if (fishermen >= 12) {
                rent = rent - (rent * 0.25);
            }

        } else if (season.equals("Autumn")) {
            rent = 4200;

            if (fishermen <= 6) {
                rent = rent - (rent * 0.10);
            } else if (fishermen > 7 && fishermen <= 11) {
                rent = rent - (rent * 0.15);
            } else if (fishermen >= 12) {
                rent = rent - (rent * 0.25);
            }

        } else if (season.equals("Winter")) {
            rent = 2600;

            if (fishermen <= 6) {
                rent = rent - (rent * 0.10);
            } else if (fishermen > 7 && fishermen <= 11) {
                rent = rent - (rent * 0.15);
            } else if (fishermen >= 12) {
                rent = rent - (rent * 0.25);
            }

            }
        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            rent = rent * 0.95;


        }
        double difference = Math.abs(budget - rent);

        if (budget >= rent) {
            System.out.printf("Yes! You have %.2f leva left.", difference);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", difference);
        }
    }
}
