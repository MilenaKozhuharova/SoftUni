import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());

        String result = repeatString(input, repeatCount);

        System.out.println(result);
    }

    public static String repeatString(String input, int repeats) {

        String result = "";

        for (int i = 0; i < repeats; i++) {
            result = result + input;
        }

        return result;
    }
}
