import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        String result = "";

        for (String word : words) {
            int count = word.length();

            for (int i = 0; i < count; i++) {
                result += word;
            }
        }

        System.out.println(result);
    }
}
