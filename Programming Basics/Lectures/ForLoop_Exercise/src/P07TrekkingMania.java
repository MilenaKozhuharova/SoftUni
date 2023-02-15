import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int allPeople = 0;
        int musalaPeople = 0;
        int monblanPeople = 0;
        int kilimadzharoPeople = 0;
        int k2People = 0;
        int everestPeople = 0;


        for (int i = 1; i <= groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());

            allPeople = allPeople + people;

            if (people <= 5) {
                musalaPeople = musalaPeople + people;
            } else if (people <= 12) {
                monblanPeople = monblanPeople + people;
            } else if (people <= 25) {
                kilimadzharoPeople = kilimadzharoPeople + people;
            } else if (people <= 40) {
                k2People = k2People + people;
            } else {
                everestPeople = everestPeople + people;
            }
        }
        System.out.printf("%.2f%%%n", musalaPeople * 1.0 / allPeople * 100);
        System.out.printf("%.2f%%%n", monblanPeople * 1.0 / allPeople * 100);
        System.out.printf("%.2f%%%n", kilimadzharoPeople * 1.0 / allPeople * 100);
        System.out.printf("%.2f%%%n", k2People * 1.0 / allPeople * 100);
        System.out.printf("%.2f%%%n", everestPeople * 1.0 / allPeople * 100);

    }
}
