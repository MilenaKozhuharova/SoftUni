import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (!charCount.containsKey(symbol)) {
                charCount.put(symbol, 1);
            } else {
                int currentCount = charCount.get(symbol);
                charCount.put(symbol, currentCount + 1);
            }
        }

        charCount.forEach((key, value) -> System.out.println(key + " -> " + value));

    }
}
