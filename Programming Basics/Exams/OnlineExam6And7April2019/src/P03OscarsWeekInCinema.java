import java.util.Scanner;

public class P03OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String hall = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketsPrice = 0;

        if (movieName.equals("A Star Is Born")) {
            if (hall.equals("normal")) {
                ticketsPrice = tickets * 7.50;
            } else if (hall.equals("luxury")) {
                ticketsPrice = tickets * 10.50;
            } else if (hall.equals("ultra luxury")) {
                ticketsPrice = tickets * 13.50;
            }
        } else if (movieName.equals("Bohemian Rhapsody")) {
            if (hall.equals("normal")) {
                ticketsPrice = tickets * 7.35;
            } else if (hall.equals("luxury")) {
                ticketsPrice = tickets * 9.45;
            } else if (hall.equals("ultra luxury")) {
                ticketsPrice = tickets * 12.75;
            }
        } else if (movieName.equals("Green Book")) {
            if (hall.equals("normal")) {
                ticketsPrice = tickets * 8.15;
            } else if (hall.equals("luxury")) {
                ticketsPrice = tickets * 10.25;
            } else if (hall.equals("ultra luxury")) {
                ticketsPrice = tickets * 13.25;
            }
        } else if (movieName.equals("The Favourite")) {
            if (hall.equals("normal")) {
                ticketsPrice = tickets * 8.75;
            } else if (hall.equals("luxury")) {
                ticketsPrice = tickets * 11.55;
            } else if (hall.equals("ultra luxury")) {
                ticketsPrice = tickets * 13.95;
            }
        }

        System.out.printf("%s -> %.2f lv.", movieName, ticketsPrice);
    }
}
