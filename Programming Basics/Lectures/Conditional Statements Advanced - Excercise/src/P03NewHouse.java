import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerTypes = scanner.nextLine();
        int amountOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.0;

        if (flowerTypes.equals("Roses")) {
            totalPrice = amountOfFlowers * 5.0;

            if (amountOfFlowers > 80) {
                totalPrice = totalPrice - (totalPrice * 0.10);
            }
        } else if (flowerTypes.equals("Dahlias")) {
            totalPrice = amountOfFlowers * 3.80;

            if (amountOfFlowers > 90) {
                totalPrice = totalPrice - (totalPrice * 0.15);
            }

        } else if (flowerTypes.equals("Tulips")) {
            totalPrice = amountOfFlowers * 2.80;

            if (amountOfFlowers > 80) {
                totalPrice = totalPrice - (totalPrice * 0.15);
            }

        } else if (flowerTypes.equals("Narcissus")) {
            if (amountOfFlowers < 120) {
                totalPrice = amountOfFlowers * (3 * 1.15);
            } else {
                totalPrice = amountOfFlowers * 3;
            }

        } else if (flowerTypes.equals("Gladiolus")) {
            if (amountOfFlowers < 80) {
                totalPrice = amountOfFlowers * (2.50 * 1.20);
            } else {
                totalPrice = amountOfFlowers * 2.50;
            }

        }

        double difference = Math.abs(budget - totalPrice);


        if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", amountOfFlowers, flowerTypes, difference);

        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", difference);

        }
    }
}
