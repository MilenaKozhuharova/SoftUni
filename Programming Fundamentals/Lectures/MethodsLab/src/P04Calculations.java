import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int firstNumInput = Integer.parseInt(scanner.nextLine());
        int secondNumInput = Integer.parseInt(scanner.nextLine());

        switch (input) {
            case "add":
                add(firstNumInput, secondNumInput);
                break;
            case "multiply":
                multiply(firstNumInput, secondNumInput);
                break;
            case "subtract":
                subtract(firstNumInput, secondNumInput);
                break;
            case "divide":
                divide(firstNumInput, secondNumInput);
                break;
        }
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);
    }
}
