import java.util.Scanner;

public class P02GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        double allClothes = statists * clothes;

        if (statists > 150) {
            allClothes = allClothes - (allClothes * 0.1);
        }

        double sum = decor + allClothes;
        double diff = Math.abs(budget - sum);

        if (sum > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        } else if (sum <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }
    }
}
