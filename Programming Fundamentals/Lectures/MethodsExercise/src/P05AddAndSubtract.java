import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(calculation(num1, num2, num3));
    }



    public static int calculation (int num1, int num2, int num3) {
        int sum = num1 + num2;
        int subtract = sum - num3;
        return subtract;
    }
}
