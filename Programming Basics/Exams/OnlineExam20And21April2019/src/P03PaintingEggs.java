import java.util.Scanner;

public class P03PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String colour = scanner.nextLine();
        int batches = Integer.parseInt(scanner.nextLine());

        int price = 0;

        if (size.equals("Large")) {
            if (colour.equals("Red")) {
                price = 16;
            } else if (colour.equals("Green")) {
                price = 12;
            } else if (colour.equals("Yellow")) {
                price = 9;
            }
        } else if (size.equals("Medium")) {
            if (colour.equals("Red")) {
                price = 13;
            } else if (colour.equals("Green")) {
                price = 9;
            } else if (colour.equals("Yellow")) {
                price = 7;
            }
        } else if (size.equals("Small")) {
            if (colour.equals("Red")) {
                price = 9;
            } else if (colour.equals("Green")) {
                price = 8;
            } else if (colour.equals("Yellow")) {
                price = 5;
            }
        }

        double allSum = batches * price;
        double expenses = allSum * 0.35;
        double finalSum = allSum - expenses;

        System.out.printf("%.2f leva.", finalSum);
    }
}
