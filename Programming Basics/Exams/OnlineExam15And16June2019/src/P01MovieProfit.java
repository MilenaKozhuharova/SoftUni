import java.util.Scanner;

public class P01MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        double cinemaPercent = Double.parseDouble(scanner.nextLine());

        double ticketsForADay = tickets * ticketPrice;
        double profit = days * ticketsForADay;
        double leftForCinema = profit * cinemaPercent / 100;
        double sum = profit - leftForCinema;

        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, sum);
    }
}
