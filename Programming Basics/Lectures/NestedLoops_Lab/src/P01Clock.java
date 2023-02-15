import java.util.Scanner;

public class P01Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int hour = 0; hour <= 23; hour++) {
            for (int min = 0; min <= 59; min++) {
                System.out.printf("%d:%d%n", hour, min);
            }

        }
    }
}
