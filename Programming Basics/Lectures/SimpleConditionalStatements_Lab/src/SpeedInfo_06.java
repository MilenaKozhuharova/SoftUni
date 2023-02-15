import java.util.Scanner;

public class SpeedInfo_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. скорост -> double
        //2. проверка за скоростта:
            // скорост <= 10 -> slow
            // скорост <= 50 -> average
            // скорост <= 150 -> fast
            // скорост <= 1000 -> ultra fast
            // скорост > 1000 -> extremely fast

        double speed = Double.parseDouble(scanner.nextLine());

        if (speed <= 10) {
            System.out.println("slow");
        } else if (speed <= 50) {
            System.out.println("average");
        } else if (speed <= 150) {
            System.out.println("fast");
        } else if (speed <= 1000) {
            System.out.println("ultra fast");
        } else if (speed > 1000) {
            System.out.println("extremely fast");

        }
    }
}
