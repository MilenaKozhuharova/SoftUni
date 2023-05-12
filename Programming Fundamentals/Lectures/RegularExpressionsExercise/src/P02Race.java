import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String names = scanner.nextLine();
        List<String> participants = Arrays.stream(names.split(", "))
                .collect(Collectors.toList());

        Map<String, Integer> racersAndDistances = new LinkedHashMap<>();
        participants.forEach(racer -> racersAndDistances.put(racer, 0));

        //Regex:
        String lettersRegex = "[A-Za-z]";
        Pattern letterPattern = Pattern.compile(lettersRegex);

        String digitsRegex = "[0-9]";
        Pattern digitsPattern = Pattern.compile(digitsRegex);

        String input = scanner.nextLine();

        while (!input.equals("end of race")) {

            StringBuilder nameBuilder = new StringBuilder();
            Matcher letterMatcher = letterPattern.matcher(input);

            while (letterMatcher.find()) {
                nameBuilder.append(letterMatcher.group());
            }

            int distance = 0;
            Matcher digitsMatcher = digitsPattern.matcher(input);

            while (digitsMatcher.find()) {
                distance += Integer.parseInt(digitsMatcher.group());
            }

            String name = nameBuilder.toString();
            if (names.contains(name)) {
                int currentDistance = racersAndDistances.get(name);
                racersAndDistances.put(name, currentDistance + distance);
            }


            input = scanner.nextLine();
        }

        for (int index = 0; index <= 2; index++) {

            if (index == 0) {
                System.out.println("1st place: " + participants.get(index));
            } else if (index == 1) {
                System.out.println("2nd place: " + participants.get(index));
            } else {
                System.out.println("3rd place: " + participants.get(index));
            }


        }



    }
}
