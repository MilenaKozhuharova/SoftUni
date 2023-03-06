import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> specialNumberAndPower = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int specialNumber = specialNumberAndPower.get(0);
        int power = specialNumberAndPower.get(1);

        while (numbers.contains(specialNumber)) {
            int specialNumberIndex = numbers.indexOf(specialNumber);

            int left = Math.max(0, specialNumberIndex - power);
            int right = Math.min(specialNumberIndex + power, numbers.size() - 1);

            for (int i = right; i >= left; i--) {
                numbers.remove(i);
            }
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
