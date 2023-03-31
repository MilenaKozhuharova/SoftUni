import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> cars = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            String[] commandParts = command.split(" ");
            String username = commandParts[1];

            if (commandParts[0].equals("register")) {
                String license = commandParts[2];
                if (cars.containsKey(username)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", license);
                } else {
                    cars.put(username, license);
                    System.out.printf("%s registered %s successfully%n", username, license);
                }


            } else if (commandParts[0].equals("unregister")) {

                if (!cars.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    System.out.printf("%s unregistered successfully%n", username);
                    cars.remove(username);
                }

            }
        }

        for (Map.Entry<String, String> entry : cars.entrySet()) {
            String username = entry.getKey();
            String license = entry.getValue();

            System.out.printf("%s => %s%n", username, license);
        }

    }
}
