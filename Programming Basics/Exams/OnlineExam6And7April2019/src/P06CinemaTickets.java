import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentTickets = 0;
        int standardTickets = 0;
        int kidsTickets = 0;
        int allTickets = 0;

        String input = scanner.nextLine();


        while (!input.equals("Finish")) {
            String movieName = input;
            int seats = Integer.parseInt(scanner.nextLine());
            int countCurrentTickets = 0;

            String typeOfTicket = scanner.nextLine();
            while (!typeOfTicket.equals("End")) {
                countCurrentTickets++;
                allTickets++;

                if (typeOfTicket.equals("student")) {
                    studentTickets++;
                } else if (typeOfTicket.equals("standard")) {
                    standardTickets++;
                } else if (typeOfTicket.equals("kid")) {
                    kidsTickets++;
                }

                if (countCurrentTickets >= seats) {
                    break;
                }


                typeOfTicket = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", movieName, countCurrentTickets * 1.0 / seats * 100);


            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", allTickets);
        System.out.printf("%.2f%% student tickets.%n", studentTickets * 1.0 / allTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardTickets * 1.0/ allTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", kidsTickets * 1.0 / allTickets * 100);

    }
}
