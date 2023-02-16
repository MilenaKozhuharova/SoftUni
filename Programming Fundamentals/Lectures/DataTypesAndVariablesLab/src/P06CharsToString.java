import java.util.Scanner;

public class P06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third  = scanner.nextLine().charAt(0);

        String full = String.format("%c%c%c", first, second, third);
        System.out.println(full);
    }
}
