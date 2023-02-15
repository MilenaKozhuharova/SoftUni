import java.util.Scanner;

public class P04Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double allSum = 0;
        double cocktailPrice = 0;

        while (!command.equals("Party!")) {
            String cocktailName = command;
            int drinks = Integer.parseInt(scanner.nextLine());
            cocktailPrice = cocktailName.length() * drinks;

            if (cocktailPrice % 2 != 0) {
                cocktailPrice = cocktailPrice * 0.75;
                allSum = allSum + cocktailPrice;
            } else {
                allSum = allSum + cocktailPrice;
            }
            if (allSum >= neededMoney) {
                System.out.printf("Target acquired.%n");
                System.out.printf("Club income - %.2f leva.", allSum);
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Party!")) {
            System.out.printf("We need %.2f leva more.%n", neededMoney - allSum);
            System.out.printf("Club income - %.2f leva.", allSum);
        }
    }
}
