import java.util.Scanner;

public class P01PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double entranceTax = Double.parseDouble(scanner.nextLine());
        double bedTax = Double.parseDouble(scanner.nextLine());
        double umbrellaTax = Double.parseDouble(scanner.nextLine());

        double taxSum = people * entranceTax;
        double bedsPeople = Math.ceil(0.75 * people);
        double bedsSum = bedsPeople * bedTax;
        double umbrellaPeople = Math.ceil(0.5 * people);
        double umbrellaSum = umbrellaPeople * umbrellaTax;

        double sum = taxSum + bedsSum + umbrellaSum;

        System.out.printf("%.2f lv.", sum);
    }
}
