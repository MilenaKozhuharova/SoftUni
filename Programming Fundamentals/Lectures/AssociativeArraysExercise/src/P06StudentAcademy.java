import java.util.*;

public class P06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<Double>> students = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {

            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!students.containsKey(name)) {
                students.put(name, new ArrayList<>());
            }

            students.get(name).add(grade);

        }

        LinkedHashMap<String, Double> finalMap = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {

            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = getAverageGrade(grades);

            if (averageGrade >= 4.50) {
                finalMap.put(studentName, averageGrade);
            }
        }

        for (Map.Entry<String, Double> entry : finalMap.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }


    }

    public static double getAverageGrade (List<Double> grades) {

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
