import java.util.Scanner;

public class P06VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double parkingPrice = 0;
        double allPrice = 0;

        for (int i = 1; i <= days; i++) {
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    parkingPrice += 2.50;
                    allPrice += 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    parkingPrice += 1.25;
                    allPrice += 1.25;
                } else {
                    parkingPrice += 1;
                    allPrice += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", i, parkingPrice);
            parkingPrice = 0;
        }
        System.out.printf("Total: %.2f leva", allPrice);
    }
}
