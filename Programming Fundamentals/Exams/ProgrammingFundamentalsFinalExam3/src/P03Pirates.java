import java.util.*;
import java.util.regex.Matcher;

public class P03Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<Integer>> cities = new LinkedHashMap<>();

        while (!input.equals("Sail")) {

            String[] cityInfo = input.split("\\|\\|");
            String cityName = cityInfo[0];
            int population = Integer.parseInt(cityInfo[1]);
            int gold = Integer.parseInt(cityInfo[2]);

            if (cities.containsKey(cityName)) {
                int currentPopulation = cities.get(cityName).get(0);
                int currentGold = cities.get(cityName).get(1);
                cities.get(cityName).set(0, currentPopulation + population);
                cities.get(cityName).set(1, currentGold + gold);
            } else {
                cities.put(cityName, new ArrayList<>());
                cities.get(cityName).add(0, population);
                cities.get(cityName).add(1, gold);
            }

            input = scanner.nextLine();
        }

        String events = scanner.nextLine();

        while (!events.equals("End")) {
            String[] eventParts = events.split("=>");
            String action = eventParts[0];
            String cityName = eventParts[1];

            if (action.equals("Plunder")) {
                int people = Integer.parseInt(eventParts[2]);
                int gold = Integer.parseInt(eventParts[3]);

                int currentPopulation = cities.get(cityName).get(0);
                int currentGold = cities.get(cityName).get(1);

                cities.get(cityName).set(0, currentPopulation - people);
                cities.get(cityName).set(1, currentGold - gold);

                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", cityName, gold, people);

                if (cities.get(cityName).get(0) == 0 || cities.get(cityName).get(1) == 0) {
                    cities.remove(cityName);
                    System.out.printf("%s has been wiped off the map!%n", cityName);
                }

            } else if (action.equals("Prosper")) {
                int gold = Integer.parseInt(eventParts[2]);
                int currentGold = cities.get(cityName).get(1);

                if (gold < 0) {
                    System.out.println("Gold added cannot be a negative number!");
                } else {
                    cities.get(cityName).set(1, currentGold + gold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, cityName, cities.get(cityName).get(1));
                }

            }
            events = scanner.nextLine();
        }

        if (cities.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cities.size());
            cities.entrySet().forEach(entry -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                    entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));

        }




    }
}
