import java.util.Scanner;

public class P01SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeEfficiency1 = Integer.parseInt(scanner.nextLine());
        int employeeEfficiency2 = Integer.parseInt(scanner.nextLine());
        int employeeEfficiency3 = Integer.parseInt(scanner.nextLine());

        int studentsCount = Integer.parseInt(scanner.nextLine());
        int hours = 0;

        int maxPerHour = employeeEfficiency1 + employeeEfficiency2 + employeeEfficiency3;

        while (studentsCount > 0) {

            hours++;

            if (hours % 4 == 0) {
                continue;
            }

            studentsCount -= maxPerHour;
        }

        System.out.printf("Time needed: %dh.", hours);


    }
}
