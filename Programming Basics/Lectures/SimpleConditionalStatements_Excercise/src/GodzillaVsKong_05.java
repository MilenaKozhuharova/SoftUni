import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double clothingCostPerPerson = Double.parseDouble(scanner.nextLine());

        double decorCost = budget * 0.10;
        double clothingCost = people * clothingCostPerPerson;


        if (people > 150) {
            clothingCost = clothingCost - (clothingCost * 0.10);
        }

        double moneyLeft = Math.abs(budget - (decorCost + clothingCost));

        if (decorCost + clothingCost > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyLeft);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
        }


    }
}
