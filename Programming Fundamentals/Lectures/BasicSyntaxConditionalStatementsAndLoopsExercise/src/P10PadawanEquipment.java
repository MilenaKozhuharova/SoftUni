import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightSaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double lightSabers = lightSaberPrice * (Math.ceil(students + 0.10 * students));
        double robes = robePrice * students;
        double belts = (students - students / 6) * beltPrice;


        double allSum = lightSabers + robes + belts;

        if (amountOfMoney >= allSum) {
            System.out.printf("The money is enough - it would cost %.2flv.", allSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", allSum - amountOfMoney);
        }
    }
}
