import java.util.Scanner;

public class P02Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double neededGas = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double gasPrice = neededGas * 2.10;
        double sum = gasPrice + 100;

        if (day.equals("Saturday")) {
            sum = sum - (sum * 0.1);
        } else if (day.equals("Sunday")) {
            sum = sum - (sum * 0.2);
        }

        if (sum <= budget) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget - sum);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", sum - budget);
        }
    }
}
