import java.util.Scanner;

public class P01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        double maxBonusPoints = Double.MIN_VALUE;
        int bestAttendance = 0;


        for (int i = 0; i < students; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());

            double bonus = attendance * 1.0 / lectures * (5 + additionalBonus);

            if (bonus > maxBonusPoints) {
                maxBonusPoints = bonus;
                bestAttendance = attendance;
            }

        }

        System.out.printf("Max Bonus: %.0f.%n", maxBonusPoints);
        System.out.printf("The student has attended %d lectures.", bestAttendance);
    }
}
