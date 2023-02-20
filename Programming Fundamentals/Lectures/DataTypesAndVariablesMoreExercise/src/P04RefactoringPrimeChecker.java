import java.util.Scanner;

public class P04RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int currentNum = 2; currentNum <= n; currentNum++) {
            boolean isPrime = true;
            for (int divider = 2; divider <= Math.sqrt(currentNum); divider++) {
                if (currentNum % divider == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", currentNum, isPrime);
        }
    }
}