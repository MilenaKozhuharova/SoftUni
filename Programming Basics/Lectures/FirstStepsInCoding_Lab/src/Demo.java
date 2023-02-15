import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        double age = Double.parseDouble(scanner.nextLine());
        String town = scanner.nextLine();
        System.out.printf("You are %s %s, a %.2f-years old person from %s.", firstName, lastName, age, town);
    }
}
