import java.util.Scanner;

public class P03FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String food = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = 0;

        if (movie.equals("John Wick")) {
            if (food.equals("Drink")) {
                ticketPrice = 12;
            } else if (food.equals("Popcorn")) {
                ticketPrice = 15;
            } else if (food.equals("Menu")) {
                ticketPrice = 19;
            }

        } else if (movie.equals("Star Wars")) {
            if (food.equals("Drink")) {
                ticketPrice = 18;
            } else if (food.equals("Popcorn")) {
                ticketPrice = 25;
            } else if (food.equals("Menu")) {
                ticketPrice = 30;
            }
        } else if (movie.equals("Jumanji")) {
            if (food.equals("Drink")) {
                ticketPrice = 9;
            } else if (food.equals("Popcorn")) {
                ticketPrice = 11;
            } else if (food.equals("Menu")) {
                ticketPrice = 14;
            }
        }

        if (movie.equals("Star Wars") && tickets >= 4) {
            ticketPrice = ticketPrice - (ticketPrice * 0.3);
        }
        if (movie.equals("Jumanji") && tickets == 2) {
            ticketPrice = ticketPrice - (ticketPrice * 0.15);
        }
        double sum = ticketPrice * tickets;
        System.out.printf("Your bill is %.2f leva.", sum);
    }
}
