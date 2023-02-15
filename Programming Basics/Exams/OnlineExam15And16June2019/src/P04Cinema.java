import java.util.Scanner;

public class P04Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallSpace = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int ticketPrice = 5;
        int cinemaIncome = 0;

        while (!input.equals("Movie time!")) {
            int people = Integer.parseInt(input);
            hallSpace = hallSpace - people;
            int allTickets = people * ticketPrice;

            if (people % 3 == 0) {
                allTickets = allTickets - 5;
            }
            if (hallSpace < 0) {
                System.out.printf("The cinema is full.%n");
                System.out.printf("Cinema income - %d lv.",cinemaIncome);
                return;
            }
            cinemaIncome = cinemaIncome + allTickets;
            input = scanner.nextLine();
        }
        System.out.printf("There are %d seats left in the cinema.%n", hallSpace);
        System.out.printf("Cinema income - %d lv.", cinemaIncome);
    }
}
