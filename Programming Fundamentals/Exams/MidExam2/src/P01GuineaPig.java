import java.util.Scanner;

public class P01GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodKg = Double.parseDouble(scanner.nextLine());
        double hayKg = Double.parseDouble(scanner.nextLine());
        double coverKg = Double.parseDouble(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());

        double foodG = foodKg * 1000;
        double hayG = hayKg * 1000;
        double coverG = coverKg * 1000;
        double weightG = weight * 1000;

        int days = 1;

        while (days <= 30) {

            foodG -= 300;

            if (days % 2 == 0) {
                hayG = hayG - (foodG * 0.05);
            }
            if (days % 3 == 0) {
                coverG = coverG - (weightG / 3);
            }
            days++;
        }

        if (foodG <= 0 || hayG < 0 || coverG < 0) {
            System.out.println("Merry must go to the pet store!");
        } else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodG / 1000, hayG / 1000, coverG / 1000);
        }

    }
}
