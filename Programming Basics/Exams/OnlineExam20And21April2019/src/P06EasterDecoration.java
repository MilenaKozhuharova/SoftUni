import java.util.Scanner;

public class P06EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clients = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double clientSum = 0;
        int itemsCount = 0;
        double allSum = 0;

        for (int i = 1; i <= clients; i++) {
            String command = scanner.nextLine();

            while (!command.equals("Finish")) {
                if (command.equals("basket")) {
                    price = 1.50;
                } else if (command.equals("wreath")) {
                    price = 3.80;
                } else if (command.equals("chocolate bunny")) {
                    price = 7;
                }
                itemsCount++;
                clientSum = clientSum + price;


                command = scanner.nextLine();
            }
            if (itemsCount % 2 == 0) {
                clientSum = clientSum - (clientSum * 0.2);
            }
            System.out.printf("You purchased %d items for %.2f leva.%n", itemsCount, clientSum);
            allSum += clientSum;
            clientSum = 0;
            itemsCount = 0;
        }
        System.out.printf("Average bill per client is: %.2f leva.", allSum / clients);
    }
}
