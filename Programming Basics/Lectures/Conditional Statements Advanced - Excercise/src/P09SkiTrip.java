import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String place = scanner.nextLine();
        String rating = scanner.nextLine();

        double price = 0;
        double moneyForTrip = 0;

       switch (place) {
           case "room for one person":
               if (days < 10) {
                  price = 18;
               } else if (days <= 15) {
                   price = 18;
               } else {
                   price = 18;
               }
               break;

           case "apartment":
               if (days < 10) {
                   price = 25 * 0.70;
               } else if (days <= 15) {
                   price = 25 * 0.65;
               } else {
                   price = 25 * 0.50;
               }
               break;

           case "president apartment":
               if (days < 10) {
                   price = 35 * 0.90;
               } else if (days <= 15) {
                   price = 35 * 0.85;
               } else {
                   price = 35 * 0.80;
               }
               break;

       }
       moneyForTrip = (days - 1) * price;

       if (rating.equals("positive")) {
           moneyForTrip = moneyForTrip * 1.25;
       } else if (rating.equals("negative")) {
           moneyForTrip = moneyForTrip * 0.90;
       }
        System.out.printf("%.2f", moneyForTrip);
    }
}
