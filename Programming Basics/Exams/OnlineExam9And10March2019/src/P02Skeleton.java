import java.util.Scanner;

public class P02Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        int secondsFor100Meters = Integer.parseInt(scanner.nextLine());

        int controlInSeconds = minutes * 60 + seconds;
        double lostTime = meters / 120;
        double allLostTime = lostTime * 2.5;
        double timeMarin = (meters / 100) * secondsFor100Meters - allLostTime;

        if (timeMarin <= controlInSeconds) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", timeMarin);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", timeMarin - controlInSeconds);
        }
    }
}
