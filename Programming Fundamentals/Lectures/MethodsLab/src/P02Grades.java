import java.util.Scanner;

public class P02Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        gradeInWords(grade);
    }

    public static void gradeInWords(double grade) {
        String gradeWord = "";
        if (grade >= 2.00 && grade <= 2.99) {
            gradeWord = "Fail";
        } else if (grade <= 3.49) {
            gradeWord = "Poor";
        } else if (grade <= 4.49) {
            gradeWord = "Good";
        } else if (grade <= 5.49) {
            gradeWord = "Very good";
        } else {
            gradeWord = "Excellent";
        }
        System.out.println(gradeWord);
    }
}
