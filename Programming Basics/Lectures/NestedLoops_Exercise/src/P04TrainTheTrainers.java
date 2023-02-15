import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double finalGradeSum = 0;
        int countGrades = 0;

        while (!input.equals("Finish")) {

            double currentGradeSum = 0;

            for (int i = 1; i <= jury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                countGrades++;
                currentGradeSum = currentGradeSum + grade;
            }

            double currentAverageGrade = currentGradeSum / jury;
            finalGradeSum = finalGradeSum + currentGradeSum;
            System.out.printf("%s - %.2f.%n",input, currentAverageGrade);

            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", finalGradeSum / countGrades);
    }
}
