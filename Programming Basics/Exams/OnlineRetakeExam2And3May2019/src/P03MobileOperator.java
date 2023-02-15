import java.util.Scanner;

public class P03MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String years = scanner.nextLine();
        String type = scanner.nextLine();
        String internet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (type.equals("Small")) {
            if (years.equals("one")) {
                price = 9.98;
            } else if (years.equals("two")) {
                price = 8.58;
            }
        } else if (type.equals("Middle")) {
            if (years.equals("one")) {
                price = 18.99;
            } else if (years.equals("two")) {
                price = 17.09;
            }
        } else if (type.equals("Large")) {
            if (years.equals("one")) {
                price = 25.98;
            } else if (years.equals("two")) {
                price = 23.59;
            }
        } else if (type.equals("ExtraLarge")) {
            if (years.equals("one")) {
                price = 35.99;
            } else if (years.equals("two")) {
                price = 31.79;
            }
        }

        if (internet.equals("yes")) {
            if (price <= 10) {
                price += 5.50;
            } else if (price <= 30) {
                price += 4.35;
            } else {
                price += 3.85;
            }
        }

        if (years.equals("two")) {
            price = price - (price * 0.0375);
        }

        System.out.printf("%.2f lv.", price * months);
    }
}
