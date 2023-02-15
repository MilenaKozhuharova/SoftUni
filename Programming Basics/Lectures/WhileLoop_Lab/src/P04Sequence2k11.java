import java.util.Scanner;

public class P04Sequence2k11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //проверявам дали числото е <= на n
        //ако е вярно -> отпечатвам числото

        int number = 1;
        while (number <= n) {
            System.out.println(number);
            number = number * 2 + 1;
        }
    }
}
