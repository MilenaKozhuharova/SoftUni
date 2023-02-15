import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());

        double dogFoodCost = 2.50;
        int catFoodCost = 4;

        System.out.println(dogFood * dogFoodCost + catFood * catFoodCost + " lv.");
    }
}
