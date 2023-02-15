import java.util.Scanner;

public class P01TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double oneTennisRacket = Double.parseDouble(scanner.nextLine());
        int tennisRacketCount = Integer.parseInt(scanner.nextLine());
        int sneakersCount = Integer.parseInt(scanner.nextLine());

        double tennisRacketsPrice = oneTennisRacket * tennisRacketCount;
        double sneakersPrice = oneTennisRacket / 6;
        double allSneakersPrice = sneakersPrice * sneakersCount;
        double otherEquipment = (tennisRacketsPrice + allSneakersPrice) * 0.2;
        double sum = tennisRacketsPrice + allSneakersPrice + otherEquipment;

        double hisSum = sum / 8;
        double sponsorsSum = sum * 7 / 8;

        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(hisSum));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(sponsorsSum));
    }
}
