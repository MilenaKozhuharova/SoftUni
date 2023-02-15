import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentRecord = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double secondsIvan = meters * secondsPerMeter;

        double resistance = Math.floor(meters / 15) * 12.5;

        double totalTime = secondsIvan + resistance;


        double timeDifference = Math.abs(currentRecord - totalTime);

      if (totalTime < currentRecord ) {
          System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
      } else {
          System.out.printf("No, he failed! He was %.2f seconds slower.", timeDifference);
      }
    }
}
