import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());


        double increase = deposit * (percent / 100);
        double monthlyIncrease = increase / 12;

        double result = deposit + months * monthlyIncrease;

        System.out.println(result);
    }
}
