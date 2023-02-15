import java.util.Scanner;

public class P06FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int movieCounter = 0;
        String bestMovie = "";
        int maxSum = Integer.MIN_VALUE;

        while (!movieName.equals("STOP")) {
            int currentSum = 0;
            movieCounter++;
            for (int i = 0; i < movieName.length(); i++) {
                int currentChar = movieName.charAt(i);
                currentSum += currentChar;

                if (currentChar >= 65 && currentChar <= 90) {
                    currentSum -= movieName.length();
                } else if (currentChar >= 97 && currentChar <= 122) {
                    currentSum -= movieName.length() * 2;
                }
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                bestMovie = movieName;
            }

            if (movieCounter >= 7) {
                break;
            }
        movieName = scanner.nextLine();
        }
        if (movieCounter >= 7) {
            System.out.println("The limit is reached.");
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, maxSum);
    }
}
