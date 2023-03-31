import com.sun.jdi.event.StepEvent;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> userAndPoints = new LinkedHashMap<>();
        Map<String, Integer> languagesCount = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {

            String[] inputParts = input.split("-");
            String username = inputParts[0];

            if (input.contains("banned")) {
                userAndPoints.remove(username);
            } else {
                String language = inputParts[1];
                int points = Integer.parseInt(inputParts[2]);

                if (!userAndPoints.containsKey(username)) {
                    userAndPoints.put(username, points);
                } else {
                    int currentPoints = userAndPoints.get(username);
                    if (points > currentPoints) {
                        userAndPoints.put(username, points);
                    }
                }

                if (!languagesCount.containsKey(language)) {
                    languagesCount.put(language, 1);
                } else {
                    int currentCount = languagesCount.get(language);
                    languagesCount.put(language, currentCount + 1);
                }
            }

            input = scanner.nextLine();
        }

        System.out.println("Results:");
        userAndPoints.entrySet().forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));
        System.out.println("Submissions:");
        languagesCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}
