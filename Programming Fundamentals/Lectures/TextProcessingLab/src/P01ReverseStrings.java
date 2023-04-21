import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String word = input;

            String reversed = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }

            System.out.printf("%s = %s%n", word, reversed);

            input = scanner.nextLine();
        }
    }
}
