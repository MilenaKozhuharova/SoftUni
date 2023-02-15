import java.util.Scanner;

public class P02EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double priceForOne = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());


        if (guests < 10) {
            priceForOne = priceForOne * 1;
        } else if (guests >= 10 && guests <= 15) {
            priceForOne = priceForOne - (priceForOne * 0.15);
        } else if (guests <= 20) {
            priceForOne = priceForOne - (priceForOne * 0.20);
        } else {
            priceForOne = priceForOne - (priceForOne * 0.25);
        }


        double cake = budget * 0.10;
        double sum = priceForOne * guests + cake;

        if (sum > budget) {
            System.out.printf("No party! %.2f leva needed.", sum - budget);
        } else {
            System.out.printf("It is party time! %.2f leva left.", budget - sum);
        }
    }
}
