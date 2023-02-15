import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double squareMeters = Double.parseDouble(scanner.nextLine());

        double oneSquareMeter = 7.61;
        double discount = 0.18;

        double totalPrice = squareMeters * oneSquareMeter;
        double discountPrice = totalPrice * discount;
        double finalPrice = totalPrice - discountPrice;

        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discountPrice + " lv.");
    }
}
