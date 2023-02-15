import java.util.Scanner;

public class P04CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucher = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int productPrice = 0;
        int ticketCount = 0;
        int othersCount = 0;

        while (!input.equals("End")) {
            String item = input;

            if (item.length() > 8) {
                productPrice = item.charAt(0) + item.charAt(1);

                if (productPrice <= voucher) {
                    voucher = voucher - productPrice;
                } else {
                    System.out.printf("%d%n", ticketCount);
                    System.out.printf("%d", othersCount);
                    return;
                }
                ticketCount++;
            } else {
                productPrice = item.charAt(0);
                if (productPrice <= voucher) {
                    voucher = voucher - productPrice;
                } else {
                    System.out.printf("%d%n", ticketCount);
                    System.out.printf("%d", othersCount);
                    return;
                }
                othersCount++;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%d%n", ticketCount);
        System.out.printf("%d", othersCount);
    }
}