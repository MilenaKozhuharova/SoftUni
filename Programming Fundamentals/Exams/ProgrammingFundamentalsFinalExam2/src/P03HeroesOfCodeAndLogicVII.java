import java.util.*;
import java.util.regex.Matcher;

public class P03HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfHeroes = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> heroes = new LinkedHashMap<>();

        for (int i = 1; i <= numberOfHeroes; i++) {
            String[] heroPoints = scanner.nextLine().split(" ");
            String heroName = heroPoints[0];
            int hitPoints = Integer.parseInt(heroPoints[1]);
            int manaPoints = Integer.parseInt(heroPoints[2]);

            heroes.put(heroName, new ArrayList<>());
            heroes.get(heroName).add(0, hitPoints);
            heroes.get(heroName).add(1, manaPoints);
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            String[] commandParts = command.split(" - ");
            String action = commandParts[0];
            String heroName = commandParts[1];

            if (action.equals("CastSpell")) {
                int neededManaPoints = Integer.parseInt(commandParts[2]);
                String spellName = commandParts[3];
                int currentManaPoints = heroes.get(heroName).get(1);

                if (currentManaPoints >= neededManaPoints) {
                    currentManaPoints -= neededManaPoints;
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, currentManaPoints);
                    heroes.get(heroName).set(1, currentManaPoints);
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", heroName,spellName);
                }

            } else if (action.equals("TakeDamage")) {

                int damage = Integer.parseInt(commandParts[2]);
                String attacker = commandParts[3];
                int currentHP = heroes.get(heroName).get(0);

                currentHP -= damage;

                if (currentHP > 0) {
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentHP);
                    heroes.get(heroName).set(0, currentHP);
                } else {
                    heroes.remove(heroName);
                    System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                }

            } else if (action.equals("Recharge")) {

                int amount = Integer.parseInt(commandParts[2]);
                int currentMP = heroes.get(heroName).get(1);

                currentMP += amount;
                if (currentMP > 200) {
                    System.out.printf("%s recharged for %d MP!%n", heroName, 200 - heroes.get(heroName).get(1));
                    heroes.get(heroName).set(1, 200);
                } else {
                    System.out.printf("%s recharged for %d MP!%n", heroName, amount);
                    heroes.get(heroName).set(1, currentMP);
                }

            } else if (action.equals("Heal")) {

                int amount = Integer.parseInt(commandParts[2]); // 50
                int currentHP = heroes.get(heroName).get(0); // 70

                currentHP += amount; // 120
                if (currentHP > 100) {
                    System.out.printf("%s healed for %d HP!%n", heroName, 100 - heroes.get(heroName).get(0));
                    heroes.get(heroName).set(0, 100);
                } else {
                    System.out.printf("%s healed for %d HP!%n", heroName, amount);
                    heroes.get(heroName).set(0, currentHP);
                }

            }

            command = scanner.nextLine();
        }

        heroes.entrySet().forEach(entry -> System.out.printf("%s%nHP: %d%nMP: %d%n", entry.getKey(),entry.getValue().get(0), entry.getValue().get(1)));
    }
}
