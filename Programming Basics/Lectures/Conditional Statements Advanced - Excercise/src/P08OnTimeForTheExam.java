import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examTimeInMinutes = (examHour * 60) + examMinutes;
        int arrivalTimeInMinutes = (arrivalHour * 60) + arrivalMinutes;

        int diffInMinutes = Math.abs(examTimeInMinutes - arrivalTimeInMinutes);

        if (arrivalTimeInMinutes > examTimeInMinutes) {
            System.out.println("Late");

            if (diffInMinutes >= 60) {
                int hour = diffInMinutes / 60;
                int minutes = diffInMinutes % 60;
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            } else {
                System.out.printf("%d minutes after the start", diffInMinutes);
            }

        } else if (arrivalTimeInMinutes == examTimeInMinutes || diffInMinutes <= 30) {
            System.out.println("On time");
            if (diffInMinutes >= 1 && diffInMinutes <= 30) {
                System.out.printf("%d minutes before the start", diffInMinutes);
            }

        } else {
            System.out.println("Early");
            if (diffInMinutes >= 60) {
                int hour = diffInMinutes / 60;
                int minutes = diffInMinutes % 60;
                System.out.printf("%d:%02d hours before the start", hour, minutes);
            } else {
                System.out.printf("%d minutes before the start", diffInMinutes);
            }


        }
    }
}
