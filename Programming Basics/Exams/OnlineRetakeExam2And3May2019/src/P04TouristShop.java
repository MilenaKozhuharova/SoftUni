import java.util.Scanner;

public class P04TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String productName = scanner.nextLine();

        int productCount = 0;
        double sum = 0;

        while (!productName.equals("Stop")) {
            double price = Double.parseDouble(scanner.nextLine());
            productCount++;

            if (productCount % 3 == 0) {
                price *= 0.5;
            }

            if (budget < price) {
                System.out.printf("You don't have enough money!%n");
                System.out.printf("You need %.2f leva!", Math.abs(price - budget));
                return;
            }
            sum += price;
            budget -= price;

            productName = scanner.nextLine();
        }
        System.out.printf("You bought %d products for %.2f leva.", productCount, sum);
    }
}
