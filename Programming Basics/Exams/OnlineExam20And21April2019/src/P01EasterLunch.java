import java.util.Scanner;

public class P01EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kozunatsi = Integer.parseInt(scanner.nextLine());
        int eggCarts = Integer.parseInt(scanner.nextLine());
        int kgCookies = Integer.parseInt(scanner.nextLine());

        double kozunakPrice = kozunatsi * 3.20;
        double eggsPrice = eggCarts * 4.35;
        double cookiesPrice = kgCookies * 5.40;
        double eggPaint = eggCarts * 12 * 0.15;

        double sum = kozunakPrice + eggsPrice + cookiesPrice + eggPaint;
        System.out.printf("%.2f", sum);
    }
}
