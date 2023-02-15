import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double allGrades = 0;
        int classes = 0;
        int lowGrades = 0;

        while (classes != 12) {
            double currentGrade = Double.parseDouble(scanner.nextLine());

            if (currentGrade < 4) {
                lowGrades++;
                if (lowGrades > 1) {
                    break;
                }
            }
            allGrades += currentGrade;
            classes++;
        }

        if (classes == 12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, allGrades / 12);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, classes);
        }
    }
}
