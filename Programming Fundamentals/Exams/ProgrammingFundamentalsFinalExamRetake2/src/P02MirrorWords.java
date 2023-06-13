import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "(#|@)(?<wordOne>[A-Za-z]{3,})(\\1)(\\1)(?<wordTwo>[A-Za-z]{3,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int wordPairs = 0;
        List<String> mirrorWordsPairs = new ArrayList<>();

        while (matcher.find()) {
            wordPairs++;

            String wordOne = matcher.group("wordOne");
            String wordTwo = matcher.group("wordTwo");

            String wordTwoReversed = new StringBuilder(wordTwo).reverse().toString();

            if (wordOne.equals(wordTwoReversed)) {
                mirrorWordsPairs.add(wordOne + " <=> " + wordTwo);
            }
        }

        if (wordPairs == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", wordPairs);
        }

        if (mirrorWordsPairs.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", mirrorWordsPairs));
        }
    }
}
