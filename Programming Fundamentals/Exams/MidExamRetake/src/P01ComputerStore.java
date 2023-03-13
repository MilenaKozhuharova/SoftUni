import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double priceWithoutTaxes = 0;
        double taxes = 0;
        double totalPrice = 0;

        boolean isOrderValid = true;

        while (!input.equals("special") && !input.equals("regular")) {
            double price = Double.parseDouble(input);

            if (price > 0) {
                priceWithoutTaxes += price;
                taxes = 0.2 * priceWithoutTaxes;
                totalPrice = priceWithoutTaxes + taxes;
            } else {
                System.out.println("Invalid price!");
            }

            input = scanner.nextLine();
        }

        if (totalPrice == 0) {
            isOrderValid = false;
            System.out.println("Invalid order!");
        }

        if (isOrderValid && input.equals("special")) {

            totalPrice = totalPrice - (totalPrice * 0.1);

            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", priceWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalPrice);

        } else if (isOrderValid && input.equals("regular")) {

            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", priceWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalPrice);

        }
    }
}
