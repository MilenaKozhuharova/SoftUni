import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        for (int i = 1; i <= tabs; i++) {
            String openedTabs = scanner.nextLine();

            if (openedTabs.equals("Facebook")) {
                salary = salary - 150;
            } else if (openedTabs.equals("Instagram")) {
                salary = salary - 100;
            } else if (openedTabs.equals("Reddit")) {
                salary = salary - 50;
            }

        }
        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%.0f", salary);
        }
    }
}
