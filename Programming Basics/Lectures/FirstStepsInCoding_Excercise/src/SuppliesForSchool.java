import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double packOfPens = 5.80;
        double packOfMarkers = 7.20;
        double cleaner = 1.20;

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int liters = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double costOfPens = pens * packOfPens;
        double costOfMarkers = markers * packOfMarkers;
        double costOfCleaner = liters * cleaner;

        double total = costOfPens + costOfMarkers + costOfCleaner;
        double discountPrice = total - (total * (discount / 100.0));

        System.out.println(discountPrice);

    }
}
