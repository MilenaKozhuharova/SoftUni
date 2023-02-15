import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        
        double price = 0;
        boolean hasError = false;

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
        day.equals("Thursday") || day.equals("Friday")) {
            if (fruit.equals("banana")) {
                price = amount * 2.50;
            } else if (fruit.equals("apple")) {
                price = amount * 1.20;
            } else if (fruit.equals("orange")) {
                price = amount * 0.85;
            } else if (fruit.equals("grapefruit")) {
                price = amount * 1.45;
            } else if (fruit.equals("kiwi")) {
                price = amount * 2.70;
            } else if (fruit.equals("pineapple")) {
                price = amount * 5.50;
            } else if (fruit.equals("grapes")) {
                price = amount * 3.85;
            } else {
                hasError = true;
            }
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            if (fruit.equals("banana")) {
                price = amount * 2.70;
            } else if (fruit.equals("apple")) {
                price = amount * 1.25;
            } else if (fruit.equals("orange")) {
                price = amount * 0.90;
            } else if (fruit.equals("grapefruit")) {
                price = amount * 1.60;
            } else if (fruit.equals("kiwi")) {
                price = amount * 3.00;
            } else if (fruit.equals("pineapple")) {
                price = amount * 5.60;
            } else if (fruit.equals("grapes")) {
                price = amount * 4.20;
            } else {
                hasError = true;
            }
        } else {
            hasError = true;
        }

        if (hasError) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", price);
        }

    }
}
