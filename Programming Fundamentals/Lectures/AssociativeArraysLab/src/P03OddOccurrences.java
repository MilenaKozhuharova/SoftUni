import java.util.*;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            if (!wordsMap.containsKey(word)) {
                wordsMap.put(word, 1);
            } else {
                int value = wordsMap.get(word);
                wordsMap.put(word, value + 1);
            }
        }

        List<String> finalList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                finalList.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", finalList));

    }
}
