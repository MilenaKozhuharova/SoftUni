import java.util.Scanner;

public class P01FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double kgBananas = Double.parseDouble(scanner.nextLine());
        double kgOranges = Double.parseDouble(scanner.nextLine());
        double kgRaspberries = Double.parseDouble(scanner.nextLine());
        double kgStrawberries = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = strawberriesPrice / 2;
        double orangesPrice = raspberriesPrice - (0.4 * raspberriesPrice);
        double bananasPrice = raspberriesPrice - (0.8 * raspberriesPrice);

        double raspberries = kgRaspberries * raspberriesPrice;
        double oranges = kgOranges * orangesPrice;
        double bananas = kgBananas * bananasPrice;
        double strawberries = kgStrawberries * strawberriesPrice;

        double sum = raspberries + oranges + bananas + strawberries;

        System.out.printf("%.2f", sum);
    }
}
