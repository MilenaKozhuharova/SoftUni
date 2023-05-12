import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P05NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> namesList = Arrays.stream(scanner.nextLine().split("\\s*,\\s*")).collect(Collectors.toList());
        String regexHealth = "[^0-9+*-\\/.]";
        Pattern healthPattern = Pattern.compile(regexHealth);

        String regexDamage = "\\+?\\-?\\d+\\.?\\d*";
        Pattern damagePattern = Pattern.compile(regexDamage);

        for (String name : namesList) {
            Matcher healthMatcher = healthPattern.matcher(name);
            int health = 0;

            while (healthMatcher.find()) {
                char symbol = healthMatcher.group().charAt(0);
                health += symbol;
            }

            Matcher damageMatcher = damagePattern.matcher(name);
            double damage = 0;

            while (damageMatcher.find()) {
                double currentDamage = Double.parseDouble(damageMatcher.group());
                damage += currentDamage;
            }

            for (Character symbol : name.toCharArray()) {
                if (symbol == '/') {
                    damage /= 2;
                } else if (symbol == '*') {
                    damage *= 2;
                }
            }

            System.out.printf("%s - %d health, %.2f damage%n", name, health, damage);
        }
    }
}
