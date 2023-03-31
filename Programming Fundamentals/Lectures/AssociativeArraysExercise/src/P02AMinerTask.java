import java.util.LinkedHashMap;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();

        while (!input.equals("stop")) {

            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            if (resources.containsKey(resource)) {
                int currentQuantity = resources.get(resource);
                resources.put(resource, currentQuantity + quantity);
            } else {
                resources.put(resource, quantity);
            }

            input = scanner.nextLine();
        }

        resources.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
