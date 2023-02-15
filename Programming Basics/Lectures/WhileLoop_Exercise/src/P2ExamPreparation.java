import java.util.Scanner;

public class P2ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());

        int badGradesCount = 0;
        int solvedProblemsCount = 0;
        double gradesSum = 0;
        String lastProblem = "";

        boolean hasFailed = true;

        while (badGradesCount < badGrades) {
            String problemName = scanner.nextLine();

            if (problemName.equals("Enough")) {
                hasFailed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                badGradesCount++;
            }
            gradesSum += grade;
            solvedProblemsCount++;
            lastProblem = problemName;
        }
        if (hasFailed) {
            System.out.printf("You need a break, %d poor grades.", badGrades);
        } else {
            System.out.printf("Average score: %.2f%n", gradesSum / solvedProblemsCount);
            System.out.printf("Number of problems: %d%n", solvedProblemsCount);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
