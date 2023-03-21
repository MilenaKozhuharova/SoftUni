import java.util.Random;
import java.util.Scanner;

public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] wordsArray = input.split(" ");


        Random rndGenerator = new Random();
        for (int i = 0; i < wordsArray.length; i++) {

            int indexX = rndGenerator.nextInt(wordsArray.length);
            int indexY = rndGenerator.nextInt(wordsArray.length);

            String oldWordX = wordsArray[indexX];
            wordsArray[indexX] = wordsArray[indexY];
            wordsArray[indexY] = oldWordX;

        }

        for (String word : wordsArray) {
            System.out.println(word);
        }
    }
}
