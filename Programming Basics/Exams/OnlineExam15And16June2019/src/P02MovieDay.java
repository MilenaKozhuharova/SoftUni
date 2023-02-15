import java.util.Scanner;

public class P02MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shootingTime = Integer.parseInt(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        int timeForOneScene = Integer.parseInt(scanner.nextLine());

        double terrain = shootingTime * 0.15;
        int timeForScenes = scenes * timeForOneScene;
        double allTime = terrain + timeForScenes;
        double diff = Math.abs(allTime - shootingTime);

        if (shootingTime >= allTime) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", Math.ceil(diff));
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", Math.ceil(diff));
        }
    }
}
