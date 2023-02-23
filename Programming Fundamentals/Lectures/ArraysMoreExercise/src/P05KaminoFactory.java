import java.util.Arrays;
import java.util.Scanner;

public class P05KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sequenceLength = Integer.parseInt(scanner.nextLine());
        int[] bestSequence = new int[0];

        int bestRowSequence = Integer.MIN_VALUE;
        int bestRowSequenceStartIndex = 0;

        int bestRowSum = 0;
        int bestRowNumber = 0;

        String command = scanner.nextLine();
        int currentRowNumber = 1;

        while (!command.equals("Clone them!")) {
            int[] sequence = Arrays.stream(command.split("!"))
                    .filter(e -> !e.isEmpty())
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int bestCurrentRowSequence = Integer.MIN_VALUE;
            int bestCurrentRowSequenceStartIndex = 0;

            int currentRowSequence = 0;
            int currentRowSequenceStartIndex = 0;

            int currentRowSum = 0;

            for (int i = 0; i < sequence.length; i++) {
                int currentNumber = sequence[i];

                if (currentNumber == 1) {
                    currentRowSequence++;
                    currentRowSum++;
                }

                if (currentRowSequence == 1) {
                    currentRowSequenceStartIndex = i;
                }

                if (i == sequence.length - 1 || sequence[i] != sequence[i + 1]) {
                    if (currentRowSequence > bestCurrentRowSequence) {
                        bestCurrentRowSequence = currentRowSequence;
                        bestCurrentRowSequenceStartIndex = currentRowSequenceStartIndex;
                    }

                    currentRowSequence = 0;
                }
            }

            if (bestCurrentRowSequence > bestRowSequence ||
                    (bestCurrentRowSequence == bestRowSequence && bestCurrentRowSequenceStartIndex < bestRowSequenceStartIndex) ||
                    (bestCurrentRowSequence == bestRowSequence && bestCurrentRowSequenceStartIndex == bestRowSequenceStartIndex && currentRowSum > bestRowSum)) {

                bestRowSequence = bestCurrentRowSequence; // запазваме засега най-добрия sequence
                bestRowSequenceStartIndex = bestCurrentRowSequenceStartIndex;
                bestRowNumber = currentRowNumber;
                bestRowSum = currentRowSum;
                bestSequence = sequence;
            }

            currentRowNumber++;
            command = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestRowNumber, bestRowSum);

        for (int i = 0; i < bestSequence.length; i++) {
            System.out.print(bestSequence[i] + " ");
        }
    }
}
