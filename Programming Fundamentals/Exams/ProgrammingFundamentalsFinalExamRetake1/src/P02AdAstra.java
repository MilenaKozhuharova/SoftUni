import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(#|\\|)(?<itemName>[A-Za-z\\s]+)(\\1)(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})(\\1)(?<calories>[0-9]+)(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int totalCalories = 0;
        List<String> items = new ArrayList<>();

        while (matcher.find()){

            String itemName = matcher.group("itemName");
            String expirationDate = matcher.group("expirationDate");
            int calories = Integer.parseInt(matcher.group("calories"));

            items.add(String.format("Item: %s, Best before: %s, Nutrition: %d", itemName, expirationDate, calories));


            totalCalories += calories;
        }

        int caloriesPerDay = totalCalories/2000;
        System.out.printf("You have food to last you for: %d days!%n", caloriesPerDay);
        items.forEach(System.out::println);

    }
}
