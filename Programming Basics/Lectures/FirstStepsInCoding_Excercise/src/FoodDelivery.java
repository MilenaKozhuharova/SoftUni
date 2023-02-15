import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegetarianMenus = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chickenMenus * 10.35;
        double fishPrice = fishMenus * 12.40;
        double vegetarianPrice = vegetarianMenus * 8.15;

        double allFood = chickenPrice + fishPrice + vegetarianPrice;
        double desert = allFood * 0.20;
        double delivery = 2.50;

        double order = allFood + desert + delivery;

        System.out.println(order);
    }
}
