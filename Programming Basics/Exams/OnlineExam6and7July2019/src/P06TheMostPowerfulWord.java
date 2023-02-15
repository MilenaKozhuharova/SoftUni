import java.util.Scanner;

public class P06TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int bestSum = 0;
        String bestWord = "";

        while (!word.equals("End of words")) {
            int asciiSum = 0;
            for (int i = 0; i < word.length(); i++) {
                asciiSum += word.charAt(i);
                //ако думата започва с a, e, i, o, u, y, A, E, I, O, U, Y -> умножаваме сбора от ascii стойностите по дължината на думата
                //в противен случай -> делим сбора на ascii стойностите на дължината на думата (закръглено надолу)
            }
                char firstChar = word.charAt(0);
            if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o'
            || firstChar == 'u' || firstChar == 'y' || firstChar == 'A' || firstChar == 'E' || firstChar == 'I' ||
                    firstChar == 'O' || firstChar == 'U' || firstChar == 'Y') {
                asciiSum = asciiSum * word.length();
            } else {
                asciiSum = asciiSum / word.length();
            }
            if (asciiSum >= bestSum) {
                bestSum = asciiSum;
                bestWord = word;
            }

            word = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %d", bestWord, bestSum);
    }
}
