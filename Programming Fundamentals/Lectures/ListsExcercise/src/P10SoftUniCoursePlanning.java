import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("course start")) {
            String[] commandParts = command.split(":");
            String lessonTitle = commandParts[1];

            if (command.contains("Add")) {

                if (!schedule.contains(lessonTitle)) {
                    schedule.add(lessonTitle);
                }

            } else if (command.contains("Insert")) {

                int index = Integer.parseInt(commandParts[2]);

                if (!schedule.contains(lessonTitle)) {
                    schedule.add(index, lessonTitle);
                }


            } else if (command.contains("Remove")) {
                if (schedule.contains(lessonTitle)) {
                    schedule.remove(lessonTitle);
                }

            } else if (command.contains("Swap")) {
                String lessonTitle2 = commandParts[2];

                if (schedule.contains(lessonTitle) && schedule.contains(lessonTitle2)) {
                    int lessonOneIndex = schedule.indexOf(lessonTitle);
                    int lessonTwoIndex = schedule.indexOf(lessonTitle2);
                    schedule.set(lessonOneIndex, lessonTitle2);
                    schedule.set(lessonTwoIndex, lessonTitle);

                    String exOne = lessonTitle + "-Exercise";
                    String exTwo = lessonTitle2 + "-Exercise";

                    if (schedule.contains(exOne)) {
                        schedule.remove(schedule.indexOf(exOne));
                        schedule.add(schedule.indexOf(lessonTitle + 1), exOne);
                    }

                    if (schedule.contains(exTwo)) {
                        schedule.remove(schedule.indexOf(exTwo));
                        schedule.add(schedule.indexOf(lessonTitle2) + 1, exTwo);
                    }
                }

            } else if (command.contains("Exercise")) {
                String exercise = lessonTitle + "-Exercise";
                int indexLessonTitle = schedule.indexOf(lessonTitle);

                if (schedule.contains(lessonTitle)) {
                    if (indexLessonTitle == schedule.size() - 1) {
                        schedule.add(indexLessonTitle + 1, exercise);
                    } else if (!schedule.get(indexLessonTitle + 1).equals(exercise)) {
                        schedule.add(indexLessonTitle + 1, exercise);
                    }

                } else {
                    schedule.add(lessonTitle);
                    schedule.add(exercise);
                }

            }

            command = scanner.nextLine();
        }
        printList(schedule);
    }

    public static void printList (List<String> schedule) {
        int count = 1;
        for (String element : schedule) {
            System.out.println(count + "." + element);
            count++;
        }
    }
}
