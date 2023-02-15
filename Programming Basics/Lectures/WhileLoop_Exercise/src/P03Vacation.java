import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());

        int daysCount = 0;
        int spendingDays = 0;

        while (money < neededMoney && spendingDays < 5) {
            String spendOrSave = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            if (spendOrSave.equals("spend")) {
                money = money - sum;
                if (money < 0) {
                    money = 0;
                }
                spendingDays++;

            } else if (spendOrSave.equals("save")) {
                money = money + sum;
                spendingDays = 0;
            }
            daysCount++;

        }
        if (money >= neededMoney) {
            System.out.printf("You saved the money for %d days.", daysCount);
        } else if (spendingDays >= 5) {
            System.out.printf("You can't save the money.%n%d", daysCount);
        }
    }
}
