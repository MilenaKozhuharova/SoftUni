import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int rams = Integer.parseInt(scanner.nextLine());

        int videoCardsCost = videoCards * 250;
        double processorsCost = processors * (videoCardsCost * 0.35);
        double ramsCost = rams * (videoCardsCost * 0.10);

        double totalCost = videoCardsCost + processorsCost + ramsCost;

        if (videoCards > processors) {
            totalCost = totalCost - (totalCost * 0.15);
        }

        double moneyLeft = Math.abs(budget - totalCost);

        if (totalCost <= budget) {
            System.out.printf("You have %.2f leva left!", moneyLeft);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", moneyLeft);
        }

    }
}
