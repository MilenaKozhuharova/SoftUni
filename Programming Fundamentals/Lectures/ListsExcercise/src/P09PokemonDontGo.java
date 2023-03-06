import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distances = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;

        while (distances.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0) {
                int firstElement = distances.get(0);
                distances.remove(0);
                sum += firstElement;
                int lastElement = distances.get(distances.size() - 1);
                distances.add(0, lastElement);
                modifyList(distances, firstElement);

            } else if (index > distances.size() - 1) {
                int lastElement = distances.get(distances.size() - 1);
                distances.remove(distances.size() - 1);
                sum += lastElement;
                int firstElement = distances.get(0);
                distances.add(firstElement);
                modifyList(distances, lastElement);

            } else if (index >= 0 && index <= distances.size() - 1) {
                int removedNumber = distances.get(index);
                distances.remove(index);
                sum += removedNumber;
                modifyList(distances, removedNumber);
            }

        }
        System.out.println(sum);
    }
    public static void modifyList (List<Integer> distances, int removedNumber) {

        for (int i = 0; i <= distances.size() - 1; i++) {
            int currentElement = distances.get(i);

            if (currentElement <= removedNumber) {
                currentElement += removedNumber;
            } else {
                currentElement -= removedNumber;
            }

            distances.set(i, currentElement);

        }
    }
}
