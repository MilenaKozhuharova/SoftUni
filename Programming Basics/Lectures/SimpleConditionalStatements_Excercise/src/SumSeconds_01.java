import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int totalTimeSec = first + second + third;

        int minutes = totalTimeSec / 60;
        int seconds = totalTimeSec % 60;

        System.out.printf("%d:%02d", minutes, seconds);

    }
}
