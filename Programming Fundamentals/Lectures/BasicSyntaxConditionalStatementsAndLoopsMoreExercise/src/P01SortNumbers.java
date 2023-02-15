import java.util.Scanner;

public class P01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPlace = Integer.parseInt(scanner.nextLine());
        int secondPlace = Integer.parseInt(scanner.nextLine());
        int thirdPlace = Integer.parseInt(scanner.nextLine());

        while (!(firstPlace >= secondPlace && secondPlace >= thirdPlace)) {
            if (thirdPlace > secondPlace) {
                int previousSecondPlace = secondPlace;
                secondPlace = thirdPlace;
                thirdPlace = previousSecondPlace;
            }

            if (secondPlace > firstPlace) {
                int previousFirstPlace = firstPlace;
                firstPlace = secondPlace;
                secondPlace = previousFirstPlace;
            }
        }

        System.out.println(firstPlace);
        System.out.println(secondPlace);
        System.out.println(thirdPlace);
    }
}
