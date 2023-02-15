import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String series = scanner.nextLine();
        int oneEpisode = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakTime / 8.0;
        double restTime = breakTime / 4.0;

        double restOfBreak = breakTime - lunchTime - restTime;
        double freeTime = Math.ceil(Math.abs(restOfBreak - oneEpisode));

        if (restOfBreak >= oneEpisode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", series, freeTime);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", series, freeTime);
        }
    }
}
