import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studio = 0;
        double apartment = 0;

        switch (month) {
            case "May":
            case "October":

                studio = 50;
                apartment = 65;

                if (nights > 7 && nights <= 14) {
                    apartment = apartment * nights;
                    studio  = nights * (studio * 0.95);
                } else if (nights > 14) {
                    apartment = nights * (apartment * 0.90);
                    studio = nights * (studio * 0.70);
                } else {
                    apartment = nights * apartment;
                    studio = nights * studio;
                }
                break;

            case "June":
            case "September":

                studio = 75.20;
                apartment = 68.70;

                if (nights > 14) {
                    apartment = nights * (apartment * 0.90);
                    studio = nights * (studio * 0.80);
                } else {
                    apartment = nights * apartment;
                    studio = nights * studio;
                }
                break;

            case "July":
            case "August":

                studio = 76;
                apartment = 77;

                if (nights > 14) {
                    apartment = nights * (apartment * 0.90);
                    studio = nights * studio;
                } else {
                    apartment = nights * apartment;
                    studio = nights * studio;
                }
                break;

        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartment, studio);
    }
}
