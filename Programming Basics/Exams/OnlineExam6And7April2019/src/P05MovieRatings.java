import java.util.Scanner;

public class P05MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int movies = Integer.parseInt(scanner.nextLine());
        double maxRating = Double.MIN_VALUE;
        double minRating = Double.MAX_VALUE;
        double ratingSum = 0;
        String bestMovie = "";
        String worstMovie = "";


        for (int i = 1; i <= movies; i++) {
            String movieName = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());

            ratingSum += rating;

            if (rating > maxRating) {
                maxRating = rating;
                bestMovie = movieName;
            }
            if (rating < minRating) {
                minRating = rating;
                worstMovie = movieName;
            }

        }
        System.out.printf("%s is with highest rating: %.1f%n", bestMovie, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", worstMovie, minRating);
        System.out.printf("Average rating: %.1f", ratingSum / movies);
    }
}
