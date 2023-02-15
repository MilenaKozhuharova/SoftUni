import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            char currentChar = word.charAt(i);
            reversed += currentChar;
        }
        System.out.println(reversed);
    }
}
