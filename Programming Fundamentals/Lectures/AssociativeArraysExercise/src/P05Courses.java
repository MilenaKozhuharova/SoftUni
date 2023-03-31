import java.util.*;

public class P05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        LinkedHashMap<String, List<String>> courses = new LinkedHashMap<>();

        while (!command.equals("end")) {

            String[] commandParts = command.split(" : ");
            String courseName = commandParts[0];
            String studentName = commandParts[1];

            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());
            }

            courses.get(courseName).add(studentName);

            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());

            entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
        }

    }
}
