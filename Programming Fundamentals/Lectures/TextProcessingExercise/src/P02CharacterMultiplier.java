import java.util.Map;
import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");

        String firstString = strings[0];
        String secondString = strings[1];

        int minLength = Math.min(firstString.length(), secondString.length());
        int maxLength = Math.max(firstString.length(), secondString.length());

        int totalSum = 0;

        for (int index = 0; index < minLength; index++) {
            totalSum += (firstString.charAt(index) * secondString.charAt(index));
        }

        if (maxLength == minLength) {
            System.out.println(totalSum);
            return;
        }

        totalSum = getLeftSymbols(firstString, secondString, minLength, maxLength, totalSum);
        System.out.println(totalSum);
    }

    public static int getLeftSymbols (String firstString, String secondString, int minLength, int maxLength, int totalSum) {

        if (maxLength == firstString.length()) {

            for (int index = minLength; index < firstString.length(); index++) {
                totalSum += firstString.charAt(index);
            }
        } else {

            for (int index = minLength; index < secondString.length(); index++) {
                totalSum += secondString.charAt(index);
            }
        }
        return totalSum;
    }


}
