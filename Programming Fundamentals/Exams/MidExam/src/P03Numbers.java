import java.util.*;
import java.util.stream.Collectors;

public class P03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int numbersSum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            numbersSum += numbers.get(i);
        }

        double averageSum = numbersSum * 1.0 / numbers.size();
        int counter = 0;


        List<Integer> topNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) > averageSum) {
                topNumbers.add(numbers.get(i));
                counter++;
            }

        }

        if (counter == 0) {
            System.out.println("No");
            return;
        }

        Collections.sort(topNumbers);
        Collections.reverse(topNumbers);

        if (topNumbers.isEmpty()) {
            System.out.println("No");
        } else if (topNumbers.size() < 5) {
            for (int number : topNumbers) {
                System.out.printf("%d ", number);
            }
        } else {
            List<Integer> sublist = topNumbers.subList(0, 5);
            for (int number : sublist) {
                System.out.printf("%d ", number);
            }
        }
    }
}
