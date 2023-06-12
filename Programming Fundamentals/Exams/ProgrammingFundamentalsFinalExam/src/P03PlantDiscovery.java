import java.util.*;

public class P03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plantsAndRarity = new LinkedHashMap<>();
        Map<String, List<Double>> plantsAndRatings = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] plantInfo = scanner.nextLine().split("<->");
            String name = plantInfo[0];
            int rarity = Integer.parseInt(plantInfo[1]);

            plantsAndRarity.put(name, rarity);
            plantsAndRatings.putIfAbsent(name, new ArrayList<>());
        }

        String command = scanner.nextLine();

        while (!command.equals("Exhibition")) {
            String[] commandParts = command.split(": ");
            String secondInfo = commandParts[1];
            String[] moreInfo = secondInfo.split(" - ");

            if (!plantsAndRarity.containsKey(moreInfo[0])) {
                System.out.println("error");
                command = scanner.nextLine();
                continue;
            }

            if (commandParts[0].equals("Rate")) {
                String plant = moreInfo[0];
                double rating = Double.parseDouble(moreInfo[1]);

                plantsAndRatings.get(plant).add(rating);

            } else if (commandParts[0].equals("Update")) {
                String plant = moreInfo[0];
                int newRarity = Integer.parseInt(moreInfo[1]);

                plantsAndRarity.put(plant, newRarity);


            } else if (commandParts[0].equals("Reset")) {
                String plant = moreInfo[0];
                plantsAndRatings.get(plant).clear();


            }
            command = scanner.nextLine();
        }



        System.out.println("Plants for the exhibition:");
        plantsAndRarity.entrySet().forEach(entry -> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",
                entry.getKey(), entry.getValue(), plantsAndRatings.get(entry.getKey()).stream().mapToDouble(val -> val).average().orElse(0)));
    }

}
