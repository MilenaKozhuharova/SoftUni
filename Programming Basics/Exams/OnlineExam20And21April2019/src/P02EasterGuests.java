import java.util.Scanner;

public class P02EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int guests = Integer.parseInt(scanner.nextLine());
       double budget = Double.parseDouble(scanner.nextLine());

       double kozunatsiCount = Math.ceil(guests * 1.0 / 3);
       int eggsCount = guests * 2;
       double kozunatsiPrice = kozunatsiCount * 4;
       double eggsPrice = eggsCount * 0.45;

       double sum = kozunatsiPrice + eggsPrice;

       if (sum <= budget) {
           System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n", kozunatsiCount, eggsCount);
           System.out.printf("He has %.2f lv. left.", budget - sum);
       } else {
           System.out.println("Lyubo doesn't have enough money.");
           System.out.printf("He needs %.2f lv. more.", sum - budget);
       }
    }
}
