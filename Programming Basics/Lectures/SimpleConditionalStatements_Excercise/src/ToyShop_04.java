import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trip = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double allToysCost = (puzzles * 2.60) + (dolls * 3) + (bears * 4.10) + (minions * 8.20) + (trucks * 2);

        int allToys = puzzles + dolls + bears + minions + trucks;

        if (allToys >= 50) {
            allToysCost = allToysCost - (allToysCost * 0.25);
        }

        allToysCost = allToysCost - (allToysCost * 0.10);

        double moneyLeft = Math.abs(allToysCost - trip);

        if (allToysCost >= trip) {
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", moneyLeft);
        }


    }
}
