import java.util.Scanner;

public class P04FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double amountOfFood = Double.parseDouble(scanner.nextLine());

        double totalBiscuits = 0;
        double totalEatenFood = 0;
        double foodEatenFromTheDog = 0;
        double foodEatenFromTheCat = 0;

        for (int day = 1; day <= days; day++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());
            int foodPerDay = dogFood + catFood;
            totalEatenFood += foodPerDay;
            foodEatenFromTheDog += dogFood;
            foodEatenFromTheCat += catFood;

            if (day % 3 == 0) {
                totalBiscuits += 0.1 * foodPerDay;
            }
        }
        System.out.printf("Total eaten biscuits: %.0fgr.%n", Math.floor(totalBiscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", (totalEatenFood / amountOfFood) * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", foodEatenFromTheDog / totalEatenFood * 100);
        System.out.printf("%.2f%% eaten from the cat.", foodEatenFromTheCat / totalEatenFood * 100);
    }
}
