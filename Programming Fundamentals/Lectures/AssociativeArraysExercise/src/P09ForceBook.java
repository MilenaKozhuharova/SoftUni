import java.util.*;

public class P09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> teams = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {

            if (input.contains("|")) {
                String side = input.split(" \\| ")[0];
                String user = input.split(" \\| ")[1];

                if (!teams.containsKey(side)) {
                    teams.put(side, new ArrayList<>());
                }

                boolean isUserInAnotherTeam = false;

                for (List<String> list : teams.values()) {
                    if (list.contains(user)) {
                        isUserInAnotherTeam = true;
                    }
                }
                if (!isUserInAnotherTeam) {
                    teams.get(side).add(user);
                }

            } else if (input.contains("->")) {
                String user = input.split(" -> ")[0];
                String side = input.split(" -> ")[1];

                teams.entrySet().forEach(entry -> entry.getValue().remove(user));

                if (teams.containsKey(side)) {
                    List<String> currentUsers = teams.get(side);
                    currentUsers.add(user);
                } else {
                    teams.put(side, new ArrayList<>());
                    teams.get(side).add(user);

                }
                System.out.printf("%s joins the %s side!%n", user, side);

            }

            input = scanner.nextLine();
        }

        teams.entrySet().stream().filter(entry -> entry.getValue().size() > 0) //оставя само отборите с играчи
                .forEach(entry -> {
                    System.out.println("Side: " + entry.getKey() + ", Members: " + entry.getValue().size());
                    entry.getValue().forEach(user -> System.out.println("! " + user));
                });

    }
}
