import java.util.Scanner;

public class P02FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double priceForOneNight = Double.parseDouble(scanner.nextLine());
        int moreExpenses = Integer.parseInt(scanner.nextLine());

        double priceForNights = 0;


        if (nights > 7) {
            priceForOneNight = priceForOneNight - (0.05 * priceForOneNight);
        }
        priceForNights = nights * priceForOneNight;

        double moreExpensesSum = (moreExpenses * 1.0 / 100) * budget;

        double allSum = priceForNights + moreExpensesSum;

        if (allSum > budget) {
            System.out.printf("%.2f leva needed.", Math.abs(budget - allSum));
        } else {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - allSum);
        }

    }
}
