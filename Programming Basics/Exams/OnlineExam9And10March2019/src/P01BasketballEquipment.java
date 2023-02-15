import java.util.Scanner;

public class P01BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double yearlyTax = Double.parseDouble(scanner.nextLine());

        double sneakersPrice = yearlyTax - (yearlyTax * 0.4);
        double tracksuitPrice = sneakersPrice - (sneakersPrice * 0.2);
        double ballPrice = tracksuitPrice / 4;
        double accessories = ballPrice / 5;

        double sum = yearlyTax + sneakersPrice + tracksuitPrice + ballPrice + accessories;

        System.out.printf("%.2f", sum);
    }
}
