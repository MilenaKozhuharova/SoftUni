import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        if (day.equals("Friday")) {
            if (type.equals("Students")) {
                price = 8.45;
            } else if (type.equals("Business")) {
                price = 10.90;
            } else if (type.equals("Regular")) {
                price = 15;
            }

        } else if (day.equals("Saturday")) {
            if (type.equals("Students")) {
                price = 9.80;
            } else if (type.equals("Business")) {
                price = 15.60;
            } else if (type.equals("Regular")) {
                price = 20;
            }
        } else if (day.equals("Sunday")) {
            if (type.equals("Students")) {
                price = 10.46;
            } else if (type.equals("Business")) {
                price = 16;
            } else if (type.equals("Regular")) {
                price = 22.50;
            }
        }
        double totalPrice = price * group;

        if (type.equals("Students") && group >= 30) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        } else if (type.equals("Business") && group >= 100) {
            group = group - 10;
            totalPrice = price * group;
        } else if (type.equals("Regular") && group >= 10 && group <= 20) {
            totalPrice = totalPrice - (totalPrice * 0.05);
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
