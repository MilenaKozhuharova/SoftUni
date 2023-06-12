import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String places = scanner.nextLine();
        List<String> validPlaces = new ArrayList<>();
        int travelPoints = 0;

        String regex = "(=|\\/)(?<place>[A-Z][A-Za-z]{2,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(places);

        while (matcher.find()) {
            String placeName = matcher.group("place");
            validPlaces.add(placeName);

            int travelPointsToAdd = placeName.length();
            travelPoints += travelPointsToAdd;

        }

        System.out.printf("Destinations: %s%n", String.join(", ", validPlaces));
        System.out.printf("Travel Points: %d", travelPoints);
    }
}
