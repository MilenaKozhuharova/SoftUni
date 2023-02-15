import java.util.Scanner;

public class P05Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int seriesCount = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        for (int i = 1; i <= seriesCount; i++) {
            String seriesName = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());
            if (seriesName.equals("Thrones")) {
                price -= price * 0.5;
            } else if (seriesName.equals("Lucifer")) {
                price -= price * 0.4;
            } else if (seriesName.equals("Protector")) {
                price -= price * 0.3;
            } else if (seriesName.equals("TotalDrama")) {
                price -= price * 0.2;
            } else if (seriesName.equals("Area")) {
                price -= price * 0.1;
            }
            sum += price;
        }
        if (sum <= budget) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - sum);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", sum - budget);
        }
    }
}
