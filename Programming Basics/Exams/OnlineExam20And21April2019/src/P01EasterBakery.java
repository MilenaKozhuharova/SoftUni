import java.util.Scanner;

public class P01EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double flourPriceForKg = Double.parseDouble(scanner.nextLine());
        double flourKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int eggCarts = Integer.parseInt(scanner.nextLine());
        int yeast = Integer.parseInt(scanner.nextLine());

        double sugarPriceForKg = flourPriceForKg * 0.75;
        double eggCartPrice = flourPriceForKg * 1.1;
        double yeastPrice = sugarPriceForKg * 0.2;

        double flourPrice = flourPriceForKg * flourKg;
        double sugarPrice = sugarPriceForKg * sugarKg;
        double eggsPrice = eggCartPrice * eggCarts;
        double yeastPrice2 = yeastPrice * yeast;

        double sum = flourPrice + sugarPrice + eggsPrice + yeastPrice2;

        System.out.printf("%.2f", sum);
    }
}
