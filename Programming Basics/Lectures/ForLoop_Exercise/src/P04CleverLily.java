import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toys = 0;
        double money = 0;
        double sum = 0;
        int brother = 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 != 0) {
                toys++;
            } else {
                brother++;
                money = money + 10;
                sum = sum + money;
            }
        }

        double sumToys = toys * toyPrice;
        double totalSum = sumToys + sum - brother;

        double diff = Math.abs(totalSum - washingMachinePrice);

        if (totalSum >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
