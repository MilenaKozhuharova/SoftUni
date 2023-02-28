import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (input) {
            case "coffee":
                calculateAndPrintCoffee(quantity);
                break;
            case "water":
                calculateAndPrintWater(quantity);
                break;
            case "coke":
                calculateAndPrintCoke(quantity);
                break;
            case "snacks":
                calculateAndPrintSnacks(quantity);
                break;

        }

    }

    public static void calculateAndPrintCoffee(int quantity) {
        System.out.printf("%.2f", quantity * 1.50);
    }

    public static void calculateAndPrintWater(int quantity) {
        System.out.printf("%.2f", quantity * 1.00);
        ;
    }

    public static void calculateAndPrintCoke(int quantity) {
        System.out.printf("%.2f", quantity * 1.40);
    }

    public static void calculateAndPrintSnacks(int quantity) {
        System.out.printf("%.2f", quantity * 2.00);
    }


}
