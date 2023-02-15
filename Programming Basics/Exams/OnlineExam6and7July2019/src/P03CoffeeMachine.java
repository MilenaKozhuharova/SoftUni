import java.util.Scanner;

public class P03CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int cups = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        if (sugar.equals("Without")) {
            if (drink.equals("Espresso")) {
                sum = cups * 0.90;
            } else if (drink.equals("Cappuccino")) {
                sum = cups * 1.0;
            } else if (drink.equals("Tea")) {
                sum = cups * 0.50;
            }
            sum = sum * 0.65;
        } else if (sugar.equals("Normal")) {
            if (drink.equals("Espresso")) {
                sum = cups;
            } else if (drink.equals("Cappuccino")) {
                sum = cups * 1.20;
            } else if (drink.equals("Tea")) {
                sum = cups * 0.60;
            }
        } else if (sugar.equals("Extra")) {
            if (drink.equals("Espresso")) {
                sum = cups * 1.20;
            } else if (drink.equals("Cappuccino")) {
                sum = cups * 1.60;
            } else if (drink.equals("Tea")) {
                sum = cups * 0.70;
            }
        }
        if (drink.equals("Espresso") && cups >= 5) {
            sum = sum * 0.75;
        }
        if (sum > 15) {
            sum = sum * 0.80;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", cups, drink, sum);
    }
}
