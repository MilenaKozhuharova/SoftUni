import java.util.Scanner;

public class P03TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        String equipment = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double priceForStay = 0;

        if (days < 1) {
            System.out.println("Days must be positive number!");
            return;
        } else if (days > 7) {
            days--;
        }

        if (city.equals("Bansko") || (city.equals("Borovets"))) {
            if (equipment.equals("withEquipment")) {
                priceForStay = days * 100;
                if (vip.equals("yes")) {
                    priceForStay = priceForStay - (priceForStay * 0.10);
                }
            } else if (equipment.equals("noEquipment")) {
                priceForStay = days * 80;
                if (vip.equals("yes")) {
                    priceForStay = priceForStay - (priceForStay * 0.05);
                }
            } else {
                System.out.println("Invalid input!");
                return;
            }
        } else if (city.equals("Varna") || (city.equals("Burgas"))) {
            if (equipment.equals("withBreakfast")) {
                priceForStay = days * 130;
                if (vip.equals("yes")) {
                    priceForStay = priceForStay - (priceForStay * 0.12);
                }
            } else if (equipment.equals("noBreakfast")) {
                priceForStay = days * 100;
                if (vip.equals("yes")) {
                    priceForStay = priceForStay - (priceForStay * 0.07);
                }
            } else {
                System.out.println("Invalid input!");
                return;
            }
        } else {
            System.out.println("Invalid input!");
            return;
        }

        System.out.printf("The price is %.2flv! Have a nice time!", priceForStay);
    }
}