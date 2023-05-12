import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "@(?<planetName>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attack>[AD])![^@\\-!:>]*->(?<soldiers>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int countMessages = 1; countMessages <= n; countMessages++) {
            String encryptedMessage = scanner.nextLine();

            String decryptedMessage = getDecryptedMessage(encryptedMessage);
            //декриптирано съобщение -> PQ@Alderaa1:30000!A!->20000

            Matcher matcher = pattern.matcher(decryptedMessage);

            if (matcher.find()){
                String planetName = matcher.group("planetName");
                int population = Integer.parseInt(matcher.group("population"));
                String attackType = matcher.group("attack");
                int soldiers = Integer.parseInt(matcher.group("soldiers"));

                if (attackType.equals("A")) {
                    attackedPlanets.add(planetName);
                } else if (attackType.equals("D")) {
                    destroyedPlanets.add(planetName);
                }

            }

        }

        System.out.println("Attacked planets: " + attackedPlanets.size());
        Collections.sort(attackedPlanets);
        attackedPlanets.forEach(planet -> System.out.println("-> " + planet));

        System.out.println(("Destroyed planets: " + destroyedPlanets.size()));
        Collections.sort(destroyedPlanets);
        destroyedPlanets.forEach(planet -> System.out.println("-> " + planet));
    }
    public static String getDecryptedMessage (String encryptedMessage) {
        //1. брой на символите [s, t, a, r, S, T, A, R]
        //криптирано съобщение -> STCDoghudd4=63333$D$0A53333
        int countLetters = getSpecialLettersCount(encryptedMessage);

        // декриптиране -> конструираме ново съобщение
        StringBuilder decryptedMessage = new StringBuilder();
        //1. всеки символ от криптираното съобщение
        //2. нов символ -> ascii на нов символ = ascii на текущия - count letters
        //3. добавяме новия символ
        for (char symbol : encryptedMessage.toCharArray()) {
            char newSymbol = (char)(symbol - countLetters);
            decryptedMessage.append(newSymbol);
        }
        return decryptedMessage.toString();
    }

    public static int getSpecialLettersCount (String encryptedMessage) {
        //криптирано съобщение -> STCDoghudd4=63333$D$0A53333 -> 3 специални букви
        int count = 0;
        for (char symbol : encryptedMessage.toCharArray()) {
            switch (symbol) {
                case 's':
                case 't':
                case 'a':
                case 'r':
                case 'S':
                case 'T':
                case 'A':
                case 'R':
                    count++;
                    break;
            }
        }
        return count;
    }
}


