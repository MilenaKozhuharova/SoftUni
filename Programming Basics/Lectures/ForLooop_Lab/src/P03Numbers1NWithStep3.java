import java.util.Scanner;

public class P03Numbers1NWithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int a = 1; a<=n; a += 3) {
            System.out.println(a);
        }
    }
}
