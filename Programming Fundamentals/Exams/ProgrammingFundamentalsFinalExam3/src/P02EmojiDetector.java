import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        long coolThreshold = 1;

        for (char symbol : input.toCharArray()) {
            if (Character.isDigit(symbol)) {
                int number = Integer.parseInt(symbol + "");
                coolThreshold *= number;
            }
        }

        String regex = "(:{2}|[*]{2})(?<word>[A-Z][a-z]{2,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int validEmojis = 0;
        List<String> coolEmojis = new ArrayList<>();

        while (matcher.find()) {
            validEmojis++;
            String emojiWord = matcher.group("word");
            int currentCoolThreshold = 0;

            for (char symbol: emojiWord.toCharArray()) {
                currentCoolThreshold += (int) symbol;
            }

            if (currentCoolThreshold >= coolThreshold) {
                coolEmojis.add(matcher.group());
            }


        }

        System.out.printf("Cool threshold: %d%n", coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", validEmojis);
        coolEmojis.forEach(System.out::println);


    }
}
