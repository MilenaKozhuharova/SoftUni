import java.util.Scanner;

public class P01SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double runtime = Double.parseDouble(scanner.nextLine());

        double ads = runtime * 0.2;
        double episodeWithAds = runtime + ads;
        int extraMinutes = seasons * 10;

        double sum = episodeWithAds * episodes * seasons + extraMinutes;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", seriesName, Math.floor(sum));
    }
}
