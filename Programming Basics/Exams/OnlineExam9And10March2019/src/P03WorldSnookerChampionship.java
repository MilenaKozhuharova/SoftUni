import java.util.Scanner;

public class P03WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int countTickets = Integer.parseInt(scanner.nextLine());
        String photo = scanner.nextLine();

        double ticketPrice = 0;
        double onePhotoPrice = 40;
        double photosPrice = 0;

        if (stage.equals("Quarter final")) {
            if (ticketType.equals("Standard")) {
                ticketPrice = 55.50;
            } else if (ticketType.equals("Premium")) {
                ticketPrice = 105.20;
            } else if (ticketType.equals("VIP")) {
                ticketPrice = 118.90;
            }
        } else if (stage.equals("Semi final")) {
            if (ticketType.equals("Standard")) {
                ticketPrice = 75.88;
            } else if (ticketType.equals("Premium")) {
                ticketPrice = 125.22;
            } else if (ticketType.equals("VIP")) {
                ticketPrice = 300.40;
            }
        } else if (stage.equals("Final")) {
            if (ticketType.equals("Standard")) {
                ticketPrice = 110.10;
            } else if (ticketType.equals("Premium")) {
                ticketPrice = 160.66;
            } else if (ticketType.equals("VIP")) {
                ticketPrice = 400;
            }
        }

        if (photo.equals("Y")) {
            photosPrice = countTickets * onePhotoPrice;
        }

        double allTicketsPrice = ticketPrice * countTickets;

        if (allTicketsPrice > 4000) {
            allTicketsPrice = allTicketsPrice - (allTicketsPrice * 0.25);
            photosPrice = 0;
        } else if (allTicketsPrice > 2500) {
            allTicketsPrice = allTicketsPrice - (allTicketsPrice * 0.1);
        }
        double allSum = allTicketsPrice + photosPrice;

        System.out.printf("%.2f", allSum);
    }
}
