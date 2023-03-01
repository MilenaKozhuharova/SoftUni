import java.util.Scanner;

public class P02VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printVowelsCount(input);

    }

    public static void printVowelsCount(String input) {

        int vowelsCount = 0;

        for (char symbol : input.toLowerCase().toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                vowelsCount++;
            }
        }
        System.out.println(vowelsCount);
    }
}
