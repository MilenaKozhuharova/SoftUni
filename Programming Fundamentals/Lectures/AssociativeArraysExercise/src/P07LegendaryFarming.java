import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        Map<String, Integer> junk = new LinkedHashMap<>();

        boolean didWin = false;

        while (!didWin) {
            String input = scanner.nextLine();
            String[] inputParts = input.split(" ");

            for (int index = 0; index < inputParts.length; index += 2) {

                int quantity = Integer.parseInt(inputParts[index]);
                String material = inputParts[index + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = materials.get(material);
                    materials.put(material, currentQuantity + quantity);
                } else {
                    if (!junk.containsKey(material)) {
                        junk.put(material, quantity);
                    } else {
                        int currentQuantity = junk.get(material);
                        junk.put(material, currentQuantity + quantity);
                    }

                }

                if (materials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materials.put("shards", materials.get("shards") - 250);
                    didWin = true;
                    break;

                } else if (materials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materials.put("fragments", materials.get("fragments") - 250);
                    didWin = true;
                    break;

                } else if (materials.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materials.put("motes", materials.get("motes") - 250);
                    didWin = true;
                    break;

                }

            }

            if (didWin) {
                break;
            }
        }

        materials.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));

        junk.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
    }
}
