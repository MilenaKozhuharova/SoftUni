import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "(@|#)(?<one>[A-Za-z]{3,})(\\1)(\\1)(?<two>[A-Za-z]{3,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int countPairs = 0;
        List<String> validPairs = new ArrayList<>();

        while (matcher.find()) {
            String firstWord = matcher.group("one");
            String secondWord = matcher.group("two");
            countPairs++;

            String secondWordReversed = new StringBuilder(secondWord).reverse().toString();

            if (firstWord.equals(secondWordReversed)) {
                validPairs.add(firstWord + " <=> " + secondWord);
            }
        }

        if (countPairs == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.println(countPairs + " word pairs found!");
        }

        if (validPairs.size() == 0) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", validPairs));

        }
    }
}
