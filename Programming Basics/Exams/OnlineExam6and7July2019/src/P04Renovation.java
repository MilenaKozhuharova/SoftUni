import java.util.Scanner;

public class P04Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int notForPainting = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        double areaNotForPainting = notForPainting * 1.0 / 100;
        int squareMeters = height * width * 4;
        double squareMetersForPainting = squareMeters - (squareMeters * areaNotForPainting);

        while (!command.equals("Tired!")) {
            int liters = Integer.parseInt(command);

            if (liters > squareMetersForPainting) {
                System.out.printf("All walls are painted and you have %.0f l paint left!", liters - squareMetersForPainting);
                return;
            } else if (liters == squareMetersForPainting) {
                System.out.println("All walls are painted! Great job, Pesho!");
                return;
            }

            squareMetersForPainting = squareMetersForPainting - liters;

            command = scanner.nextLine();
        }
            System.out.printf("%.0f quadratic m left.", squareMetersForPainting);

    }
}
