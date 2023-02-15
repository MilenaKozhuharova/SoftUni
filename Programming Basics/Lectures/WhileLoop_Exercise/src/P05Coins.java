import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        double coinsChange = change * 100;

        int coinsCount = 0;

        // 1.23 = 123
        // 1лв, 20ст, 2ст, 1ст.
        // 123 - 100 = 23
        // 23 - 20 = 3
        // 3 - 2 = 1
        // 1 = 1

        while (coinsChange > 0) {
            if (coinsChange >= 200) {
                coinsChange = coinsChange - 200;
                coinsCount++;
            } else if (coinsChange >= 100) {
                coinsChange = coinsChange - 100;
                coinsCount++;
            } else if (coinsChange >= 50) {
                coinsChange = coinsChange - 50;
                coinsCount++;
            } else if (coinsChange >= 20) {
                coinsChange = coinsChange - 20;
                coinsCount++;
            } else if (coinsChange >= 10) {
                coinsChange = coinsChange - 10;
                coinsCount++;
            } else if (coinsChange >= 5) {
                coinsChange = coinsChange - 5;
                coinsCount++;
            } else if (coinsChange >= 2) {
                coinsChange = coinsChange - 2;
                coinsCount++;
            } else if (coinsChange >= 1) {
                coinsChange = coinsChange - 1;
                coinsCount++;
            } else {
                break;
            }
        }
        System.out.println(coinsCount);
    }
}
