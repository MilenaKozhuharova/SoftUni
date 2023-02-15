import java.util.Scanner;

public class Time15Minutes_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialHours = Integer.parseInt(scanner.nextLine());
        int initialMinutes = Integer.parseInt(scanner.nextLine());

        int allMinutes =  (initialHours * 60) + initialMinutes + 15;

        int hours = allMinutes / 60;
        int minutes = allMinutes % 60;

        if (hours > 23) {
            hours = 0;
        }

        System.out.printf("%d:%02d", hours, minutes);
    }
}
