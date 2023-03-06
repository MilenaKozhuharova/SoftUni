import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> hand1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> hand2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (hand1.size() != 0 && hand2.size() != 0) {

            int firstPlayerCard = hand1.get(0);
            int secondPlayerCard = hand2.get(0);

            hand1.remove(0);
            hand2.remove(0);

            if (firstPlayerCard > secondPlayerCard) {
                hand1.add(firstPlayerCard);
                hand1.add(secondPlayerCard);

            } else if (secondPlayerCard > firstPlayerCard) {
                hand2.add(secondPlayerCard);
                hand2.add(firstPlayerCard);

            }

        }
        if (hand1.size() == 0) {
            System.out.printf("Second player wins! Sum: %d", getSum(hand2));
        } else if (hand2.size() == 0) {
            System.out.printf("First player wins! Sum: %d", getSum(hand1));
        }
    }

    public static int getSum (List<Integer> cards) {
        int sum = 0;
        for (int card : cards) {
            sum += card;
        }
        return sum;
    }
}
