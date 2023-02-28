import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.####");
        double result = mathPower(number, power);

        System.out.println(df.format(result));
    }

    public static double mathPower(double number, int power) {
        double result = 0;

        result = Math.pow(number, power);

        return result;
    }
}
