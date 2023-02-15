import java.util.Scanner;

public class P05FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int visitors = Integer.parseInt(scanner.nextLine());

        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int proteinShake = 0;
        int proteinBar = 0;

        for (int i = 1; i <= visitors; i++) {
            String activity = scanner.nextLine();

            if (activity.equals("Back")) {
                back++;
            } else if (activity.equals("Chest")) {
                chest++;
            } else if (activity.equals("Legs")) {
                legs++;
            } else if (activity.equals("Abs")) {
                abs++;
            } else if (activity.equals("Protein shake")) {
                proteinShake++;
            } else if (activity.equals("Protein bar")) {
                proteinBar++;
            }
        }

        double workout = (back + chest + legs + abs) * 1.0 / visitors;
        double protein = (proteinBar + proteinShake) * 1.0 / visitors;

        System.out.printf("%d - back%n", back);
        System.out.printf("%d - chest%n", chest);
        System.out.printf("%d - legs%n", legs);
        System.out.printf("%d - abs%n", abs);
        System.out.printf("%d - protein shake%n", proteinShake);
        System.out.printf("%d - protein bar%n", proteinBar);
        System.out.printf("%.2f%% - work out%n",workout * 100);
        System.out.printf("%.2f%% - protein", protein * 100);
    }
}
