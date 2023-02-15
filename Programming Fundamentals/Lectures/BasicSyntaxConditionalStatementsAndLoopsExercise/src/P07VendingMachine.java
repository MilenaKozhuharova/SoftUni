import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double coinsSum = 0;

        double productPrice = 0;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);

            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1 && coins != 2) {
                System.out.printf("Cannot accept %.2f%n", coins);
            } else {
                coinsSum += coins;
            }

            input = scanner.nextLine();
        }
        String product = scanner.nextLine();

        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    productPrice = 2.0;
                    break;
                case "Water":
                    productPrice = 0.7;
                    break;
                case "Crisps":
                    productPrice = 1.5;
                    break;
                case "Soda":
                    productPrice = 0.8;
                    break;
                case "Coke":
                    productPrice = 1.0;
                    break;
                default:
                    productPrice = 0;
                    System.out.println("Invalid product");
                    break;
            }

            if (coinsSum >= productPrice && productPrice != 0) {
                System.out.printf("Purchased %s%n", product);
                coinsSum -= productPrice;
            } else if (coinsSum < productPrice && productPrice != 0) {
                System.out.printf("Sorry, not enough money%n");
            }

            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", coinsSum);
    }
}
