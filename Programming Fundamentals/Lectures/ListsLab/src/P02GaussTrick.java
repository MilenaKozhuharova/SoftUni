import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int numbersSize = numbers.size();

        for (int i = 0; i < numbersSize / 2; i++) {
            int firstNum = numbers.get(i);
            int lastNum = numbers.get(numbers.size() - 1);

            numbers.set(i, firstNum + lastNum);
            numbers.remove(numbers.size() - 1);
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
