import java.util.Scanner;

public class P03Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String item = scanner.nextLine();

        double hardness = 0;
        double execution = 0;

        if (country.equals("Russia")) {
            if (item.equals("ribbon")) {
                hardness = 9.100;
                execution = 9.400;
            } else if (item.equals("hoop")) {
                hardness = 9.300;
                execution = 9.800;
            } else if (item.equals("rope")) {
                hardness = 9.600;
                execution = 9.000;
            }
        } else if (country.equals("Bulgaria")) {
            if (item.equals("ribbon")) {
                hardness = 9.600;
                execution = 9.400;
            } else if (item.equals("hoop")) {
                hardness = 9.550;
                execution = 9.750;
            } else if (item.equals("rope")) {
                hardness = 9.500;
                execution = 9.400;
            }
        } else if (country.equals("Italy")) {
            if (item.equals("ribbon")) {
                hardness = 9.200;
                execution = 9.500;
            } else if (item.equals("hoop")) {
                hardness = 9.450;
                execution = 9.350;
            } else if (item.equals("rope")) {
                hardness = 9.700;
                execution = 9.150;
            }
        }
        double sum = hardness + execution;
        double leftPoints = 20 - sum;
        double percent = (leftPoints / 20) * 100;

        System.out.printf("The team of %s get %.3f on %s.%n", country, sum, item);
        System.out.printf("%.2f%%", percent);
    }
}
