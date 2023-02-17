import java.util.Scanner;

public class P01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int fourth = Integer.parseInt(scanner.nextLine());

        int firstPlusSecond = first + second;
        int thirdSum = firstPlusSecond / third;
        int fourthSum = thirdSum * fourth;

        System.out.println(fourthSum);
    }
}
